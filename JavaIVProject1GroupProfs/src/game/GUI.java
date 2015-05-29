package game;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controllers.*;
import factory.ClassicMonopolyPropertyFactory;

public class GUI extends JFrame 
{
	private JPanel startPanel;
	private JLabel startLabel;
	private JTextField startField;
	private JButton startNewGameButton;
	
	private IGameController gameController;
	
	public GUI()
	{
		setTitle("Cartel");
		setSize( 1600, 1024 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout( new BorderLayout() );
		
		startPanel = new JPanel();
		startLabel = new JLabel("How many players?");
		startField = new JTextField(3);
		startNewGameButton = new JButton("Start Game!");
		startNewGameButton.addActionListener( new startButtonListener() );
		
		startPanel.add( startLabel );
		startPanel.add( startField );
		startPanel.add( startNewGameButton );
		
		add(startPanel, BorderLayout.CENTER );
		
		gameController = new GameController( new ClassicMonopolyPropertyFactory() );
		
		setVisible(true);
	}
	
	private class startButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			try
			{
				int totalPlayers = Integer.parseInt( startField.getText() );
				String[] playerNames = new String[totalPlayers];
				for ( int count = 0; count < totalPlayers; count++ )
				{
					playerNames[count] = JOptionPane.showInputDialog("Enter Player # " + ( count + 1 ) + "'s name.");
				}
				remove( startPanel );
				add( gameController.startNewGame(playerNames).getGameView(), BorderLayout.CENTER );
				validate();
			}
			catch ( Exception ex )
			{
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new GUI();
	}
}
