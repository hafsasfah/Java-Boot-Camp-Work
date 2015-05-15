import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RacingGameGUI extends JFrame 
{	
	private final int STARTING_CASH = 100;
	private final int HEIGHT = 600;
	private final int WIDTH = 800;
	
	private iPlayer player1;
	private iPlayer player2;
	private iBet bet;
	private iVehicleFactory vehicleFactory;
	
	private JPanel northPanel;
	
	private JLabel startLabel;
	private JButton startRacingButton;
	
	private JLabel placeBetLabel;
	private JTextField wagerField;
	private JButton placeBetButton;
	private JButton raceButton;
	
	private JLabel resultLabel;
	
	public RacingGameGUI()
	{
		setTitle("Eric's Ultimate Racing Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		setLayout(new BorderLayout());
		
		vehicleFactory = new CarFactory();
		
		player1 = new Player(vehicleFactory, STARTING_CASH);
		player2 = new Player(vehicleFactory, STARTING_CASH);
		add(player1.getPanel(), BorderLayout.WEST);
		add(player2.getPanel(), BorderLayout.EAST);
		
		startLabel = new JLabel();
		startRacingButton = new JButton("Start Racing");
		startRacingButton.addActionListener( new StartRacingButtonListener() );
		
		northPanel = new JPanel();
		northPanel.add(startLabel);
		northPanel.add(startRacingButton);
		add(northPanel, BorderLayout.NORTH);
		
		placeBetLabel = new JLabel("Enter your wager for the race");
		wagerField = new JTextField(10);
		placeBetButton = new JButton("Bet");
		placeBetButton.addActionListener( new PlaceBetButtonListener() );
		raceButton = new JButton("Start Race");
		raceButton.addActionListener( new RaceButtonListener() );
		
		resultLabel = new JLabel();
		
		add( resultLabel, BorderLayout.CENTER );
		
		setVisible(true);
	}
	
	private class StartRacingButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if ( player1.isReady() && player1.getVehicle().isReady() && player2.isReady() && player2.getVehicle().isReady() )
			{
				northPanel.removeAll();
				northPanel.add(placeBetLabel);
				northPanel.add(wagerField);
				northPanel.add(placeBetButton);
				northPanel.add(raceButton);
				raceButton.setEnabled(false);
			}
			else
			{
				startLabel.setText("Please select a vehicle for both players");
			}
			revalidate();
		}
	}
	
	private class PlaceBetButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				bet = new Bet( player1, player2, Integer.parseInt( wagerField.getText() ) );
				raceButton.setEnabled(true);
			}
			catch ( NumberFormatException exception )
			{
				placeBetLabel.setText("You must enter a valid wager");
			}
			
		}
	}
	
	private class RaceButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			resultLabel.setText( bet.race() );
			raceButton.setEnabled(false);
			if ( player1.getCash() <= 0 || player2.getCash() <= 0 )
			{
				northPanel.remove(wagerField);
				northPanel.remove(placeBetButton);
				northPanel.remove(raceButton);
				if ( player1.getCash() > player2.getCash() )
				{
					placeBetLabel.setText("Game over!  Player 1 wins!");
				}
				else
				{
					placeBetLabel.setText("Game over!  Player 2 wins!");
				}
				revalidate();
			}	
		}
	}
	
	public static void main(String[] args)
	{
		new RacingGameGUI();
	}
}
