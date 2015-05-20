import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class AdventureGameGUI extends JFrame {
	
	private TwoDimensionalMaze maze;
	private JPanel setupPanel;
	private JTextField numberOfPlayersTextField;
	private IParty party;
	private JLabel setupLabel;
	private JButton setupButton;
	private JButton startButton;
	
	private JPanel northPanel;
	private JPanel eastPanel;
	private JPanel southPanel;
	private JPanel westPanel;
	
	public static void main(String[] args)
	{
		new AdventureGameGUI();
	}
	
	public AdventureGameGUI()
	{
		setTitle("Adventure Game");
		setSize( 1024, 1024 );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout( new BorderLayout() );
		
		setupPanel = new JPanel();
		setupLabel = new JLabel("How many players are in your party? ( 1 - 6 )");
		setupPanel.add( setupLabel );
		numberOfPlayersTextField = new JTextField(3);
		setupPanel.add( numberOfPlayersTextField );
		setupButton = new JButton("Create Party");
		setupButton.addActionListener( new SetupButtonListener() );
		setupPanel.add(setupButton);
		
		startButton = new JButton("Start Game");
		startButton.setEnabled(false);
		startButton.addActionListener( new StartGameButtonListener());
		setupPanel.add(startButton);
		
		northPanel = new JPanel();
		northPanel.add( setupPanel );
		
		add( northPanel, BorderLayout.NORTH );
		
		eastPanel = new JPanel();
		add( eastPanel, BorderLayout.EAST );
		
		westPanel = new JPanel();
		add( westPanel, BorderLayout.WEST );
		
		southPanel = new JPanel();
		add( southPanel, BorderLayout.SOUTH );
		
		File mazeFile = new File("maze.txt");
		System.out.println(mazeFile.getAbsolutePath());
		ICharacterFactory npcFactory = new NPCFactory();
		IRoomFactory roomFactory = new RandomRoomFactory(npcFactory);
		try
		{
			maze = new TwoDimensionalMaze(this, mazeFile, roomFactory);
		}
		catch( IOException e )
		{
			System.out.println( e.toString());
			System.exit(0);
		}
		
		revalidate();
	}
	
	public void updateDisplay()
	{
		northPanel.removeAll();
		northPanel.add( maze.getCurrentPosition().getRoom().getPanel() );
		
		eastPanel.removeAll();
		eastPanel.add( maze.getCurrentPosition().getRoom().getNPCParty().getPanel() );
		
		southPanel.removeAll();
		southPanel.add(maze.getPanel());
		
		revalidate();
	}
	
	private class StartGameButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			northPanel.remove( setupPanel );
			updateDisplay();
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
				westPanel.add( party.getPanel() );
				numberOfPlayersTextField.setEnabled(false);
				setupButton.setEnabled(false);
				startButton.setEnabled(true);
				revalidate();
			}
			catch ( NumberFormatException nfe )
			{
				
			}
		}	
	}
}
