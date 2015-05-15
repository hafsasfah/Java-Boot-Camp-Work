

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI extends JFrame implements ActionListener{

	private JPanel carPanel1; // to hold components for player 1
	private JPanel carPanel2; // to hold components for player 2
	private JPanel selectedCarPanel; // to hold components 
	private JList carList; // the cars
	private JList carList2; // the cars
	private JTextField selectedCar1; // the selected car for player 1
	private JTextField selectedCar2; // the selected car for player 1
	private JLabel label; // a message
	Player player1 = new Player("Player 1", 100);
	Player player2 = new Player("Player 2", 100);
	
	// The following array holds the values that will be displayed in the 
	// carList list component.
	
	private String[] cars = {"Lamborghini", "Ferrari", "Pagani", "McLaren", "Porche"};
	
	public GUI()
	{
		
		final int windowLength = 300;
		final int windowWidth = 300;
		
		// Set the title
		setTitle("Select Cars to Race");
		
		setSize(windowLength, windowWidth);
		
		//Specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add a BorderLayout manager
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		//Build the car and selected car panels
		buildCarPanel();
		buildSelectedCarPanel();
		
		//Add the panels to the content pane
		
		 
		add(carPanel1,BorderLayout.WEST);
		add(carPanel2,BorderLayout.EAST);
		add(selectedCar1,BorderLayout.NORTH);
		add(selectedCar2,BorderLayout.SOUTH);
		
		//Add the panels to the content
		pack();
		setSize(600,600);//Size of JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);//Sets if its visible.
		
		JButton startButton = new JButton("Race");//The JButton name.
		add(startButton);//Add the button to the JFrame.
		startButton.addActionListener(this);//Reads the action.
	}
	public void actionPerformed(ActionEvent e) {
		//System.out.println(
		Bet.race(player1, player2, Integer.parseInt(JOptionPane.showInputDialog("Enter amout to wager")));
				
		
	}
	
	private void buildCarPanel()
	{
		
		//Create a panel to hold the car list for player 1
		carPanel1 = new JPanel();
		
		//Create a panel to hold the car list for player 2
		carPanel2 = new JPanel();
		
		//Create the list
		carList = new JList(cars);
		carList2 = new JList(cars);
		
		
		//Set the selection mode to single selection
		carList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		carList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//Register the list selection listener
		carList.addListSelectionListener((ListSelectionListener) new ListListener());
		carList2.addListSelectionListener((ListSelectionListener)new ListListener1());
		
		//Add the list to the panel
		carPanel1.add(carList);
		carPanel2.add(carList2);		
		
	}

	
	private void buildSelectedCarPanel()
	{
		
		//Create a panel to hold the text field
		selectedCarPanel = new JPanel();
		
		//Create the label
		label = new JLabel("You selected: ");
		
		//Create the text field
		selectedCar1 = new JTextField(15);
		selectedCar2 = new JTextField(15);
		
		//Make the text field uneditable
		selectedCar1.setEditable(false);
		selectedCar2.setEditable(false);
		
		//Add the label and text field to the panel
		selectedCarPanel.add(label);
		selectedCarPanel.add(selectedCar1);
		selectedCarPanel.add(selectedCar2);
		
	}
	
	private class ListListener implements ListSelectionListener
	{

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			
			//Get Selected Car for player 1
			String selection1 = (String) carList.getSelectedValue();
			//System.out.println("Gui "+selection1);
			player1.vehicle = new Car(selection1);
			
			//Put the selected month in the text field
			selectedCar1.setText("Player 1 Selected :" + selection1);
			
		}
	}
		private class ListListener1 implements ListSelectionListener
		{
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
			
			//Get Selected Car for player 2
			String selection2 = (String) carList2.getSelectedValue();

		
				
			
			
			player2.vehicle = new Car(selection2);
			
			//Put the selected month in the text field
			selectedCar2.setText("Player 2 Selected :" + selection2);
			}
			
			
		}

		
		
	
	
	public static void main(String[] args)
	{
		new GUI();
	}
}
