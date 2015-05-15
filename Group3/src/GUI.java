import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class GUI extends JFrame
{
	Player player1;
	Player player2;
	CarClass car1;
	CarClass car2;
	
	private JLabel label;					//displays the message 
	

	private JPanel CarSelection;  
	private JComboBox CarBox; 
	String[] cars = { "Jaguar XJS" , "Nissan GT-R",
			"Lamborghini Diablo","Lotus Elise",
			"Ferrari F50" , "Luxas LFA","Koenigsegg Agera"};
	private JTextField selectedCar; 
	
	
	
	private JPanel panel1;
	private JTextField selectedWager; 		//select the wager 
	private JLabel messageLabel;
	private JButton startMatch;
	
	
	public GUI()
	{
		
		car1 = new CarClass("Explorer");
		car2 = new CarClass("Corvet");
		
		player1 = new Player("Player 1", 100, car1);
		player2 = new Player("Player 2", 100, car2);
		
		//set the title
		
		JComboBox carBox = new JComboBox(cars);
		JComboBox carBox2 = new JComboBox(cars);
		
		setTitle("Car Race");
		//specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the size (x, y) and visibility
		setSize(300, 400);

		setLayout(new GridLayout(3,2));
		buildnewCarPanel();
		this.add(CarSelection);
		
		buildCarPanel();
		this.add(panel1);
		
		setResizable(false);
		setVisible(true);	
	}
	
	public void buildCarPanel()
	{
	messageLabel = new JLabel("Please Input a Bet.");
	selectedWager = new JTextField(15);
	panel1 = new JPanel();
	
	startMatch = new JButton("Start Game");
	startMatch.addActionListener(new StartMatchButtonListener());
	
	
	panel1.add(messageLabel);
	panel1.add(selectedWager);
	panel1.add(startMatch);
	
	}
	
	private void buildnewCarPanel()
	{
		//build a Panel to hold the combo box
		CarSelection = new JPanel();
		
		//Create the combo box
		CarBox = new JComboBox(cars);
		
		//Register action listener
		CarBox.addActionListener(new ComboBoxListener());
		
		//add the combo box to the panel
		CarSelection.add(CarBox);
	}
	
	private class ComboBoxListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
		//Get the selected Car
		String selection = (String) CarBox.getSelectedItem();
		selectedCar = new JTextField();
		selectedCar.setText(selection);
		}

	}
	
	
	private class StartMatchButtonListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent E)
		{
			String tempwager = selectedWager.getText();
			int wager = Integer.parseInt(tempwager);
			Bet newgame = new Bet(player1,player2,wager);
			JOptionPane.showMessageDialog(null,newgame.Race());
			
		}
		
		
	}
	
	public static void main(String[]args)
	{
		GUI cargame = new GUI();
	}

}
