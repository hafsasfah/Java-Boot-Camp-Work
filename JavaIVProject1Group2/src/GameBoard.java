



import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

//******Game board will build on the overall design of the game******//

public class GameBoard extends JFrame 
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6033684453093511700L;
	
	

	//This represents the Default Grid Values
	private int gridForX = 0;
	private int gridForY = 0;
	private JTextField text1; 
	
	
	
	//Create the platforms for the Game board  
	//ArrayList<PropertyManager>platform = new ArrayList<PropertyManager>();
	
	public static void main(String[]args)
	{
		
		new GameBoard().setVisible(true);
		
		
		
	}
	
	
	
	
	public GameBoard()
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
		
		JLabel jail = new JLabel("Jail");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(jail, gbc_btnNewButton);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel salon = new JLabel("Salon");
		GridBagConstraints gbc_salon = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		getContentPane().add(salon, gbc_salon);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel partyStore = new JLabel("Party Store");
		GridBagConstraints gbc_partyStore = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		getContentPane().add(partyStore, gbc_partyStore);
		
		getContentPane().setLayout(accessLayout);
		
		JLabel playboyMansion = new JLabel("Playboy Mansion");
		GridBagConstraints gbc_playboyMansion = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		getContentPane().add(playboyMansion, gbc_playboyMansion);
		
		getContentPane().setLayout(accessLayout);
		
		//JButton playboyMansion = new JButton("Playboy Mansion");
		//GridBagConstraints gbc_playboyMansion = new GridBagConstraints();
		//gbc_btnNewButton.gridx = 2;
		//gbc_btnNewButton.gridy = 2;
		//getContentPane().add(playboyMansion, gbc_playboyMansion);
		
		
		
		
		

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
				
				
				tempPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));	
				
				JPanel innerPanel = new JPanel();
				getContentPane().add(innerPanel, new GridBagConstraints(1, 1, 11, 11, 0.0, 0.0,
														GridBagConstraints.CENTER,
														GridBagConstraints.BOTH,
														new Insets(0,0,0,0), 0, 0));
			}
		}
		
		
		
	}


	
	

}
