import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JPanel;

public class TwoDimensionalMaze implements iMaze {
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	private final char START = 's';
	private final char WALL = 'w';
	private final char ROOM = 'r';
	private final char END = 'e';

	private TwoDimensionalPosition start;
	private TwoDimensionalPosition end;
	private ArrayList<TwoDimensionalPosition> maze;
	private int maxX;
	private int maxY;

	private JPanel panel;

	public TwoDimensionalMaze(File mazeFile, iRoomFactory roomFactory)
			throws IOException {
		maze = new ArrayList<TwoDimensionalPosition>();

		Scanner fileScanner = new Scanner(mazeFile);

		int xPosition = 0;
		int yPosition = 0;

		while (fileScanner.hasNext()) {
			String[] lineSplit = fileScanner.nextLine().split(" ");
			for (String word : lineSplit) {
				switch (word.charAt(0)) {
				case START:
					start = new TwoDimensionalPosition(roomFactory.createRoom(), xPosition, yPosition);
					maze.add(start);
					break;
				case WALL:
					maze.add(new TwoDimensionalPosition(null, xPosition, yPosition));
					break;
				case ROOM:
					maze.add(new TwoDimensionalPosition(roomFactory.createRoom(), xPosition, yPosition));
					break;
				case END:
					end = new TwoDimensionalPosition(roomFactory.createRoom(), xPosition, yPosition);
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
	}

	@Override
	public iPosition getStartingPosition() {
		return start;
	}

	@Override
	public Iterator<iPosition> iterator(iPosition position) {
		return new TwoDimensionalMazeIterator((TwoDimensionalPosition) position);
	}

	@Override
	public boolean isEndPosition(iPosition position) {
		return position.equals(end);
	}

	@Override
	public boolean isValidPosition(iPosition position) {
		if ( ! ( position instanceof TwoDimensionalPosition) )
		{
			return false;
		}
		TwoDimensionalPosition twoDimensionalPosition = (TwoDimensionalPosition) position;
		return ( twoDimensionalPosition.getRoom() != null 
				&& areCoordinatesValid(twoDimensionalPosition.getX(), twoDimensionalPosition.getY() ) );
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

		public TwoDimensionalMazeIterator(TwoDimensionalPosition position) {
			x = position.getX();
			y = position.getY();
			iterations = 0;
		}

		public boolean hasNext() {
			return iterations < MAX_ITERATIONS;
		}

		public TwoDimensionalPosition next() {
			TwoDimensionalPosition emptyPosition = new TwoDimensionalPosition(-1,-1);
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
}