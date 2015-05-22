
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class TwoDimensionalMaze implements iMaze
{
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	private final char START = 's';
	private final char WALL = 'w';
	private final char ROOM = 'r';
	private final char END = 'e';

	private Gui gui;
	
	private Position start;
	private Position end;
	private Position currentPosition;
	private ArrayList<iPosition> maze;
	private int maxX;
	private int maxY;

	private Position north;
	private Position east;
	private Position south;
	private Position west;
	
	private JPanel panel;
	private JButton northButton;
	private JButton eastButton;
	private JButton southButton;
	private JButton westButton;
	private JPanel centerPanel;
	private JLabel centerLabel;

	public TwoDimensionalMaze( Gui gui, File mazeFile, iRoomFactory roomFactory)
			throws IOException {
		
		this.gui = gui;
		
		maze = new ArrayList<iPosition>();

		Scanner fileScanner = new Scanner(mazeFile);

		int xPosition = 0;
		int yPosition = 0;

		while (fileScanner.hasNext()) {
			String[] lineSplit = fileScanner.nextLine().split(" ");
			for (String word : lineSplit) {
				switch (word.charAt(0)) {
				case START:
					start = new Position(roomFactory.createRoom(), xPosition, yPosition);
					maze.add(start);
					break;
				case WALL:
					maze.add(new Position(null, xPosition, yPosition));
					break;
				case ROOM:
					maze.add(new Position(roomFactory.createRoom(), xPosition, yPosition));
					break;
				case END:
					end = new Position(roomFactory.createRoom(), xPosition, yPosition);
					maze.add(end);
					break;
				}
				xPosition++;
			}
			if (xPosition > maxX) {
				maxX = xPosition;
			}
			xPosition = 0;
			yPosition++;
		}

		fileScanner.close();

		maxY = yPosition;

		panel = new JPanel();
		northButton = new JButton("North");
		westButton = new JButton("West");
		eastButton = new JButton("East");
		southButton = new JButton("South");
		
		northButton.addActionListener( new DirectionButtonListener() );
		westButton.addActionListener( new DirectionButtonListener() );
		eastButton.addActionListener( new DirectionButtonListener() );
		southButton.addActionListener( new DirectionButtonListener() );
		
		centerPanel = new JPanel();
		centerLabel = new JLabel();
		centerPanel.add( centerLabel );
		
		panel.setLayout( new GridLayout(3,3));
		panel.add( new JLabel());
		panel.add( northButton );
		panel.add( new JLabel());
		
		panel.add( westButton );
		panel.add( centerPanel );
		panel.add( eastButton );
		
		panel.add( new JLabel());
		panel.add( southButton );
		panel.add( new JLabel());
		
		currentPosition = start;
		
		updateDirectionButtons();
	}

	@Override
	public iPosition getStartingPosition() {
		return start;
	}

	@Override
	public Iterator<iPosition> iterator(iPosition position) {
		return new TwoDimensionalMazeIterator((Position) position);
	}

	@Override
	public boolean isEndPosition(iPosition position) {
		return position.equals(end);
	}
	
	public iPosition getCurrentPosition() {
		return currentPosition;
	}

	@Override
	public boolean isValidPosition(iPosition position) {
		if ( ! ( position instanceof Position) )
		{
			return false;
		}
		Position Position = (Position) position;
		return ( Position.getRoom() != null 
				&& areCoordinatesValid(Position.getX(), Position.getY() ) );
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

	private boolean areCoordinatesValid(int x, int y) {
		return x >= 0 && y >= 0 && x < maxX && y < maxY;
	}

	protected class TwoDimensionalMazeIterator implements Iterator<iPosition> {
		private int x;
		private int y;
		private int iterations;
		private final int MAX_ITERATIONS = 4;

		public TwoDimensionalMazeIterator(Position position) {
			x = position.getX();
			y = position.getY();
			iterations = 0;
		}

		public boolean hasNext() {
			return iterations < MAX_ITERATIONS;
		}

		public iPosition next() {
			Position emptyPosition = new Position(-1,-1);
			int currentIndex = x + y * maxY;
			switch (iterations++) {
			case NORTH:
				return areCoordinatesValid(x, y - 1) ? maze.get(currentIndex - maxY) : emptyPosition;
			case EAST:
				return areCoordinatesValid(x + 1, y) ? maze.get(currentIndex + 1) : emptyPosition;
			case SOUTH:
				return areCoordinatesValid(x, y + 1) ? maze.get(currentIndex + maxY) : emptyPosition;
			case WEST:
				return areCoordinatesValid(x - 1, y) ? maze.get(currentIndex - 1) : emptyPosition;
			default:
				return null;
			}
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	private void updateDirectionButtons()
	{
		Iterator<iPosition> iterator = iterator( currentPosition );
		north = (Position)iterator.next();
		east = (Position)iterator.next();
		south = (Position)iterator.next();
		west = (Position)iterator.next();
		
		centerLabel.setText( currentPosition.getX() + ", " + currentPosition.getY() );
		
		northButton.setEnabled( isValidPosition(north) );
		eastButton.setEnabled( isValidPosition(east) );
		southButton.setEnabled( isValidPosition(south) );
		westButton.setEnabled( isValidPosition(west) );
	}
	
	private class DirectionButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if ( e.getSource() == northButton )
			{
				currentPosition = north;
			}
			else if ( e.getSource() == eastButton )
			{
				currentPosition = east;
			}
			else if ( e.getSource() == southButton )
			{
				currentPosition = south;
			}
			else if ( e.getSource() == westButton )
			{
				currentPosition = west;
			}
			
		}
		
	}
}

