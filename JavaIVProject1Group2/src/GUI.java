import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import logic.DiceRoll;

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
		
		String player1;
		String player2;

		Scanner keyboard = new Scanner(System.in);
		JOptionPane.showInputDialog("Player 1 enter your name ");
		player1 = keyboard.toString();
		
		
		JOptionPane.showInputDialog("Player 2 enter your name ");
		player2 = keyboard.toString();
	
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
				tempPanel.setBackground(Color.CYAN);

				
				
				JLabel start = new JLabel(" GO! ");
				getContentPane().add(start, new GridBagConstraints(3, 3, 11, 11, 1.2, 1.2,
														GridBagConstraints.SOUTHEAST,
														GridBagConstraints.CENTER,
														new Insets(0,0,30,0), 30, 0));
				
				
				//*****************RIGHT SIDE OF THE BOARD*************************************//
				JLabel atlanticAvenue = new JLabel("Atlantic Avenue");
				getContentPane().add(atlanticAvenue, new GridBagConstraints(2, 1, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel bAndO = new JLabel("B & O Railroad");
				getContentPane().add(bAndO, new GridBagConstraints(2, 2, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel baltic = new JLabel("Baltic Avenue");
				getContentPane().add(baltic, new GridBagConstraints(2, 3, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel boardWalk = new JLabel("Boardwalk");
				getContentPane().add(boardWalk, new GridBagConstraints(2, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel connecticut = new JLabel("Connecticut Avenue");
				getContentPane().add(connecticut, new GridBagConstraints(2, 5, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel electric = new JLabel("Electric Company");
				getContentPane().add(electric, new GridBagConstraints(2, 6, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				JLabel illinois = new JLabel("Illinois Avenue");
				getContentPane().add(illinois, new GridBagConstraints(2, 7, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel indiana = new JLabel("Indiana Avenue");
				getContentPane().add(indiana, new GridBagConstraints(2, 8, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel kentucky = new JLabel("Kentucky Avenue");
				getContentPane().add(kentucky, new GridBagConstraints(2, 9, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel marvin = new JLabel("Marvin Gardens");
				getContentPane().add(marvin, new GridBagConstraints(2, 10, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel medi = new JLabel("Mediterranean Avenue");
				getContentPane().add(medi, new GridBagConstraints(2, 11, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHEAST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				
				
				//*******************LEFT SIDE OF THE BOARD***************************//
				JLabel york = new JLabel("New York Avenue");
				getContentPane().add(york, new GridBagConstraints(0, 1, 11, 11, 0.1, 0.1,
														GridBagConstraints.NORTHWEST,
														GridBagConstraints.WEST,
														new Insets(0,0,0,0),20, 13));
				
				JLabel carolina = new JLabel("Carolina Avenue");
				getContentPane().add(carolina, new GridBagConstraints(0, 3, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.EAST,
														new Insets(0,0,50,0),20, 13));
				
				JLabel pacific = new JLabel("Pacific Avenue");
				getContentPane().add(pacific, new GridBagConstraints(0, 5, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.EAST,
														new Insets(0,0,60,0),20, 13));
				

				JLabel bond = new JLabel("Bond Street");
				getContentPane().add(bond, new GridBagConstraints(0, 7, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.EAST,
														new Insets(0,0,40,0),20, 13));
				

				JLabel st = new JLabel("St. Charles Place");
				getContentPane().add(st, new GridBagConstraints(0, 9, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.EAST,
														new Insets(0,0,0,0),20, 13));
				

				JLabel place = new JLabel("Vermont Place");
				getContentPane().add(place, new GridBagConstraints(0, 11, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.EAST,
														new Insets(30,0,0,0),20, 13));
				

				JLabel bow = new JLabel("Bow Street");
				getContentPane().add(bow, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.SOUTH,
														new Insets(200,10,0,0),20, 13));
				
				JLabel cross = new JLabel("Cross Station");
				getContentPane().add(cross, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.SOUTH,
														new Insets(110,10,0,0),20, 13));
				
				JLabel whiteHall = new JLabel("Whitehall");
				getContentPane().add(whiteHall, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.SOUTH,
														new Insets(30,10,0,0),20, 13));
				
				JLabel states = new JLabel("States Avenue");
				getContentPane().add(states, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.NORTHWEST,
														new Insets(0,10,70,0),20, 13));
				
				JLabel virginia = new JLabel("Virginia Street");
				getContentPane().add(virginia, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.NORTHWEST,
														new Insets(0,10,160,0),20, 13));
				

				JLabel water = new JLabel("Water Works");
				getContentPane().add(water, new GridBagConstraints(0, 0, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.NORTHWEST,
														new Insets(0,10,250,0),20, 13));
				
				
				//**************BOTTOM OF THE ROW**************************//

				JLabel coven = new JLabel("Coventry Street");
				getContentPane().add(coven, new GridBagConstraints(5, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.WEST,
														new Insets(0,48,50,0),20, 13));
				
				JLabel huston = new JLabel("Huston Road");
				getContentPane().add(huston, new GridBagConstraints(0, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.WEST,
														new Insets(0,190,50,0),20, 13));
				
				JLabel pall = new JLabel("Pall Mall");
				getContentPane().add(pall, new GridBagConstraints(0, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.WEST,
														new Insets(0,0,50,0),20, 13));
				
				JLabel penton = new JLabel("Pentonville Road");
				getContentPane().add(penton, new GridBagConstraints(0, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.WEST,
														new Insets(0,0,50,200),20, 13));
				
				JLabel line = new JLabel("Line Road");
				getContentPane().add(line, new GridBagConstraints(0, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTHEAST,
														GridBagConstraints.SOUTH,
														new Insets(0,0,50,0),20, 13));
				

				JLabel readingRailroad = new JLabel("Reading Railroad");
				getContentPane().add(readingRailroad, new GridBagConstraints(1, 4, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTHEAST,
														GridBagConstraints.SOUTHEAST,
														new Insets(0,40,48,0),20, 13));
				

				JLabel maple = new JLabel("Mapleville");
				getContentPane().add(maple, new GridBagConstraints(1, 10, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.NORTH,
														new Insets(100,0,0,0),20, 13));
				

				JLabel court = new JLabel("Court Road");
				getContentPane().add(court, new GridBagConstraints(2, 12, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.SOUTHWEST,
														new Insets(17,10,30,0),20, 13));
				
				JLabel belle = new JLabel("Belleville");
				getContentPane().add(belle, new GridBagConstraints(2, 12, 11, 11, 0.1, 0.1,
														GridBagConstraints.WEST,
														GridBagConstraints.SOUTHWEST,
														new Insets(17,110,30,0),20, 13));
				
				JLabel hills = new JLabel("Hillsdale");
				getContentPane().add(hills, new GridBagConstraints(2, 2, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.SOUTHEAST,
														new Insets(0,0,50,0),20, 13));
				
				JLabel may = new JLabel("Mayfair");
				getContentPane().add(may, new GridBagConstraints(4, 2, 11, 11, 0.1, 0.1,
														GridBagConstraints.SOUTH,
														GridBagConstraints.SOUTHEAST,
														new Insets(0,0,48,0),20, 13));
				
				
				
				
				
			
				 new DiceRoll();
				
				JButton play = new JButton("Dice Roll");
				play.addActionListener(new ActionListener()
				{
					public  void actionPerformed(ActionEvent e) 
					{
						GUI players = new GUI();
						javax.swing.JOptionPane.showMessageDialog (null," rolled "+ DiceRoll.getRoll());
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
				

				
				
				JPanel innerPanel = new JPanel();
				innerPanel.setBackground(Color.WHITE);
				

				}
			
			}
		
		}	
	
			
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
