
import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;


public class GUI extends JFrame {

	private JPanel carPanel1; // to hold components for player 1
	private JPanel carPanel2; // to hold components for player 2
	private JPanel selectedCarPanel; // to hold components 
	private JList carList; // the cars
	private JList carList2; // the cars
	private JTextField selectedCar1; // the selected car for player 1
	private JTextField selectedCar2; // the selected car for player 1
	private JLabel label; // a message
	
	// The following array holds the values that will be displayed in the 
	// carList list component.
	
	private String[] cars = {"Lamborghini", "Ferrari", "Pagani", "McLaren", "Porche"};
	
	public GUI()
	{
		// Set the title
		setTitle("Select Car");
		
		//Specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add a BorderLayout manager
		setLayout(new BorderLayout());
		
		//Build the car and selectedcar panels
		buildCarPanel();
		buildSelectedCarPanel();
		
		//Add the panels to the content pane
		
		 
		add(carPanel1,BorderLayout.WEST);
		add(carPanel2,BorderLayout.EAST);
		add(selectedCar1, BorderLayout.SOUTH);
		add(selectedCar2, BorderLayout.NORTH);
		
		//Add the panels to the content
		pack();
		setVisible(true);
				
		
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
		
		//Register the list selection listener
		carList.addListSelectionListener(new ListListener());
		
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
		selectedCar1 = new JTextField(10);
		selectedCar2 = new JTextField(10);
		
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
		public void valueChanged(ListSelectionEvent e) {
			
			//Get Selected Car for player 1
			String selection1 = (String) carList.getSelectedValue();
			
			//Put the selected month in the text field
			selectedCar1.setText("Player 1 Selected :" + selection1);
			
			//Get Selected Car for player 2
			String selection2 = (String) carList.getSelectedValue();
			
			//Put the selected month in the text field
			selectedCar2.setText("Player 2 Selected :" + selection2);
			
			
			
		}
		
	}
	
	public static void main(String[] args)
	{
		new GUI();
	}
}
