import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import logic.DiceRoll;



//******Game board will build on the overall design of the game******//

public class GUI extends JFrame 
{

	//This represents the Default Grid Values
	private int gridForX = 0;
	private int gridForY = 0;
	private JButton diceRoll;
	
	ArrayList<Property> property = new ArrayList<Property>();				//Not Used yet
	
	
	//Creates the platforms for the Game board  

	public static void main(String[]args)
	{
		new GUI().setVisible(true);
		
			int totalPlayer = 0;
		
		while(totalPlayer < 2 || totalPlayer > 8)
		{
			Scanner keyboard = new Scanner(System.in);
			JOptionPane.showInputDialog("Enter Total Players: ");
			totalPlayer = keyboard.nextInt();
		}
	}
	
	
	public GUI()
	{
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		pack();
		setTitle("Monopoly");
		setSize(1000,700);
		setPreferredSize(new Dimension(1000, 700));
		
		JLabel bank = new JLabel("Bank");
		getContentPane().add(bank, BorderLayout.NORTH);
		
		createThePanels();
	}
	
	//Create the platforms for the Game board  
	
	public void createThePanels()
	{
		
		GridBagLayout accessLayout = new GridBagLayout();
		
		accessLayout.rowWeights = new double[]	{ 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
				0.1, 0.1, 0.1, 0.1, 0.1, 0.2}; 
		
		
		accessLayout.columnWeights = new double[] { 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
				0.1, 0.1, 0.1, 0.1, 0.1, 0.2}; 
		
	
		getContentPane().setLayout(accessLayout);
		
		
		JLabel jail = new JLabel("   Jail  ");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		getContentPane().add(jail, gbc_btnNewButton);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel salon = new JLabel("   Salon  ");
		GridBagConstraints gbc_salon = new GridBagConstraints();
		getContentPane().add(salon, gbc_salon);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel partyStore = new JLabel("Party Store");
		GridBagConstraints gbc_partyStore = new GridBagConstraints();
		getContentPane().add(partyStore, gbc_partyStore);
		
		
		getContentPane().setLayout(accessLayout);
		
		JLabel playboyMansion = new JLabel("Playboy Mansion");
		GridBagConstraints gbc_playboyMansion = new GridBagConstraints();
		getContentPane().add(playboyMansion, gbc_playboyMansion);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel one = new JLabel("Local Bar");
		GridBagConstraints gbc_one = new GridBagConstraints();
		getContentPane().add(one, gbc_one);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel operaHouse = new JLabel("Opera House");
		GridBagConstraints gbc_operaHouse = new GridBagConstraints();
		getContentPane().add(operaHouse, gbc_operaHouse);
		

		JLabel disco = new JLabel("Disco Club");
		GridBagConstraints gbc_disco = new GridBagConstraints();
		getContentPane().add(disco, gbc_disco);
		
		JLabel hospital = new JLabel("Hospital");
		GridBagConstraints gbc_hospital = new GridBagConstraints();
		getContentPane().add(hospital, gbc_hospital);
		
		JLabel halfwayHouse = new JLabel("Halfway House");
		GridBagConstraints gbc_halfwayHouse = new GridBagConstraints();
		getContentPane().add(halfwayHouse, gbc_halfwayHouse);
		
		JLabel daycare = new JLabel("Daycare");
		GridBagConstraints gbc_daycare = new GridBagConstraints();
		getContentPane().add(daycare, gbc_daycare);
		
		JLabel policeStation = new JLabel("Police Station");
		GridBagConstraints gbc_policeStation = new GridBagConstraints();
		getContentPane().add(policeStation, gbc_policeStation);
		
		JLabel burgerJoint = new JLabel("Burger Joint");
		GridBagConstraints gbc_burgerJoint = new GridBagConstraints();
		getContentPane().add(burgerJoint, gbc_burgerJoint);
		
		
		
		

		for(int j = 0; j < 4; j++)				//<-----------this represents the four sides Top, down, left, and right
		{
			for(int i = 0; i < 13; i++)			//<-----------this represents thirteen panels of each side of the window 
			{
				JPanel tempPanel = new JPanel();
				
				
				switch(j)
				{
				case 0: //Top Spaces 
					gridForX = i;
					gridForY = 0;
					break;
				case 1: //Left Spaces 
					gridForX = 0;
					gridForY = i;
					break;
				case 2: //Right Spaces 
					gridForX = 12;
					gridForY = i;
					break;
				case 3: //Bottom Spaces 
					gridForX = i;
					gridForY = 12;
					break;
				
				}
							
				getContentPane().add(tempPanel, 
						new GridBagConstraints(gridForX, gridForY, 
								1,//GridWidth
								1,//GridHeight
								0.0,//Double weightX
								0.0, //Double weightY
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,  
						new Insets(0, 0, 0, 0), 0, 0));
				
				
				tempPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
		
				
				JPanel innerPanel = new JPanel();
				getContentPane().add(innerPanel, new GridBagConstraints(1, 1, 11, 11, 0.0, 0.0,
														GridBagConstraints.CENTER,
														GridBagConstraints.BOTH,
														new Insets(0,0,0,0), 0, 0));
				
				JLabel start = new JLabel(" GO! ");
				getContentPane().add(start, new GridBagConstraints(3, 3, 11, 11, 1.2, 1.2,
														GridBagConstraints.SOUTHEAST,
														GridBagConstraints.CENTER,
														new Insets(0,0,30,0), 30, 0));
				

				JLabel fifthAvenue = new JLabel("Fifth Avenue");
				getContentPane().add(fifthAvenue, new GridBagConstraints(8, 8, 11, 11, 0.2, 0.2,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 0));
				
				 new DiceRoll();
				
				JButton play = new JButton("Dice Roll");
				play.addActionListener(new ActionListener()
				{
					public  void actionPerformed(ActionEvent e) 
					{
						javax.swing.JOptionPane.showMessageDialog (null,"you rolled "+ DiceRoll.getRoll());
					}
				});
				getContentPane().add(play, new GridBagConstraints(5, 5, 11, 11, 0.2, 0.2,
						GridBagConstraints.NORTH,
						GridBagConstraints.CENTER,
						new Insets(2,5,10,0), 50, 0));
				
				
				diceRoll = new JButton("Buy");
				getContentPane().add(diceRoll, new GridBagConstraints(5, 5, 11, 11, 0.2, 0.2,
														GridBagConstraints.CENTER,
														GridBagConstraints.CENTER,
														new Insets(0,20,0,0), 80, 0));
				}
			
			}
		
		}	
	
		
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
