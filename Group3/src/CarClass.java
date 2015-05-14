import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarClass {

	private String Model;
	public CarClass()
	{
		
	}
	
	public static int makeRandom()
	{
		
	Random rand = new Random();
	return rand.nextInt((5 - 1) +1) + 1;
	
	}
		Random random = new Random (10);
		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public Random getRandom() {
			return random;
		}

		public void setRandom(Random random) {
			this.random = random;
		}
		
	public class CarBoxWindow extends JFrame
	{
		private JPanel CarSelection;     //To hold Components
		private JPanel SelectedCarPanel; //To hold more Components?
		private JComboBox CarBox;        //A list of Badass Cars
		private JLabel Label;            // Displays a Message
		private JTextField selectedCar;  // Chosen Car
		
		
		private String[] Model = { "Jaguar XJS" , "Nissan GT-R",
									"Lamborghini Diablo","Lotus Elise",
									"Ferrari F50" , "Luxas LFA","Koenigsegg Agera"};
		
		
			public CarBoxWindow()
			{
				//Title of the Selection Box
				setTitle("Car Selecion");
				
				//Decides what the Close button does
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Create a BorderLayout manager
				setLayout( new BorderLayout());
				
				//Panel Building
				buildCarPanel();
				buildSelectedCarPanel();
				
				//Add the panels to the content Pane
				add(CarSelection, BorderLayout.CENTER);
				add(SelectedCarPanel, BorderLayout.SOUTH);
				
				//Pack and Display the Window??????
				pack();
				setVisible(true);
			}
		private void buildCarPanel()
		{
			//build a Panel to hold the combo box
			CarSelection = new JPanel();
		}
		}
		
	}
		
		
	


