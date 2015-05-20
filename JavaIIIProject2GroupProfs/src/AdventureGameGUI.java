import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class AdventureGameGUI extends JFrame {
	
	private TwoDimensionalMaze maze;
	private JPanel setupPanel;
	private JTextField numberOfPlayersTextField;
	private IParty party;
	private IPosition currentPosition;
	private JLabel setupLabel;
	private JButton setupButton;
	private JButton startButton;
	
	public static void main(String[] args)
	{
		new AdventureGameGUI();
	}
	
	public AdventureGameGUI()
	{
		setTitle("Adventure Game");
		setSize( 1024, 768 );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout( new BorderLayout() );
		
		File mazeFile = new File("maze.txt");
		System.out.println(mazeFile.getAbsolutePath());
		ICharacterFactory npcFactory = new NPCFactory();
		IRoomFactory roomFactory = new RandomRoomFactory(npcFactory);
		try
		{
			maze = new TwoDimensionalMaze(mazeFile, roomFactory);
		}
		catch( IOException e )
		{
			System.out.println( e.toString());
			System.exit(0);
		}
		
		setupPanel = new JPanel();
		setupLabel = new JLabel("How many players are in your party? ( 1 - 6 )");
		setupPanel.add( setupLabel );
		numberOfPlayersTextField = new JTextField(3);
		setupPanel.add( numberOfPlayersTextField );
		setupButton = new JButton("Create Party");
		setupButton.addActionListener( new SetupButtonListener() );
		setupPanel.add(setupButton);
		
		startButton = new JButton("Start Game");
		startButton.addActionListener( new StartGameButtonListener());
		setupPanel.add(startButton);
		
		add( setupPanel, BorderLayout.NORTH );
		
		revalidate();
	}
	
	private class StartGameButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if ( party != null )
			{
				currentPosition = maze.getStartingPosition();
				remove( setupPanel );
				add( currentPosition.getRoom().getPanel(), BorderLayout.NORTH );
				add( currentPosition.getRoom().getNPCParty().getPanel(), BorderLayout.EAST );
				revalidate();
			}
		}
	}
	
	private class SetupButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			try
			{
				int numberOfPlayers = Integer.parseInt( numberOfPlayersTextField.getText() );
				ICharacter[] players = new ICharacter[ numberOfPlayers ];
				for ( int index = 0; index < players.length; index++ )
				{
					String playerName = JOptionPane.showInputDialog("Please enter the name of Player # " + ( index + 1 ) );
					PlayerCharacterFactory playerCharacterFactory = new PlayerCharacterFactory(playerName);
					players[index] = playerCharacterFactory.createCharacter();
				}
				party = new Party( players );
				add( party.getPanel(), BorderLayout.WEST );
				numberOfPlayersTextField.setEnabled(false);
				setupButton.setEnabled(false);
				revalidate();
			}
			catch ( NumberFormatException nfe )
			{
				
			}
		}	
	}
}
