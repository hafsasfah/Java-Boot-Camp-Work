

import java.awt.*;
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
		GridBagLayout accessLayout = new GridBagLayout();
		
		accessLayout.rowWeights = new double[] { 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
												0.1, 0.1, 0.1, 0.1, 0.1, 0.2};
		
		accessLayout.columnWeights = new double[] { 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
													0.1, 0.1, 0.1, 0.1, 0.1, 0.2};
		
		getContentPane().setLayout(accessLayout);
		
		
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
						new GridBagConstraints(gridForX, gridForY, 1, 1,0.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,  
						new Insets(0, 0, 0, 0), 0, 0));
				
				
				tempPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
								
				
			}
			
			
		}
		
		
		{//The main inner  starts at (1,1) and takes up 11,11 
		
			JPanel innerPanel = new JPanel();
			getContentPane().add(innerPanel, new GridBagConstraints(1, 1, 11, 11, 0.0, 0.0,
													GridBagConstraints.CENTER,
													GridBagConstraints.BOTH,
													new Insets(0,0,0,0), 0, 0));

		}
		
		pack();
		setTitle("Monopoly");
		setSize(1000,700);
	
	}
		
	

	
	/*
	
	
	
	
		setTitle("Title");
		setVisible(true);
		setSize(1000, 800);
		setPreferredSize(new Dimension(1000, 700));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		validate();
		setLayout(new BorderLayout());
	
	north = new JPanel();
	south = new JPanel();
	east = new JPanel();
	west = new JPanel();
	center = new JPanel();
	
	add(north, BorderLayout.NORTH);
	add(south, BorderLayout.SOUTH);
	add(east, BorderLayout.EAST);
	add(west, BorderLayout.WEST);
	add(center, BorderLayout.CENTER);
	

	north.setLayout(new BoxLayout(north, BoxLayout.X_AXIS));
	south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));
	east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
	west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
	center.setLayout(new BoxLayout(center, BoxLayout.LINE_AXIS));
	
	
	//North Panel set up 
	//north.setOpaque(true);
	//north.setBackground(new Color(178,247,178));
	//north.setBorder(new MatteBorder(1, 1, 1, 1, new Color(50, 126,52)));
	//north.add(Box.createVerticalGlue());
	//north.add(Box.createRigidArea(new Dimension(120,1)));
	
	//Upward side of the board
	north.add(new CornerPlatform(1, 0, 0, "Up", "PARKING!"));
	north.add(new Street(2, 60, 122, "Up", "506", 80, new Color(94, 60, 49)));
	north.add(new Street(3, 70, 111, "Up", "507", 100, new Color(94, 60, 49)));
	north.add(new Street(4, 80, 112, "Up", "508", 250, Color.white));
	north.add(new Street(5, 90, 123, "Up", "506", 90, new Color(94, 60, 49)));
	north.add(new Street(6, 100, 143, "Up", "509", 550, Color.red));
	north.add(new Street(7, 110, 134, "Up", "510", 200, new Color(94, 60, 49)));
	north.add(new CornerPlatform(8, 0, 0, "Up", "GO TO JAIL!"));
	
	
	
	
	
	//north.add(comp);														//<-----have to add	
	//north.add(Box.createRigidArea(new Dimension(300, 1)));
	//north.add(turn); 														//<-----have to add the turn
	
	
	
	//South Panel set up 
	//south.setOpaque(true);
	//south.setBackground(new Color(178, 247, 178));
	//south.setBorder(new MatteBorder(1, 1, 1, 1, new Color(50, 126, 52)));
	
	
	//south.add(Box.createVerticalGlue());
	
	//downward side of the board
	south.add(new CornerPlatform(9, 100, 1000, "Down", "GO!"));
	south.add(new Street(10, 1, 1, "Down", "506", 80, new Color(94, 60, 49)));
	south.add(new Street(11, 1, 1, "Down", "507", 100, new Color(94, 60, 49)));
	south.add(new Street(12, 1, 1, "Down", "508", 250,  Color.white));
	south.add(new Street(13, 1, 1, "Down", "506", 90, new Color(94, 60, 49)));
	south.add(new Street(14, 1, 1, "Down", "509", 550, Color.red));
	south.add(new Street(15, 1, 1, "Down", "510", 200, new Color(94, 60, 49)));
	south.add(new CornerPlatform(16, 1, 1, "Down", "JAIL!"));
	
	
	//south.add(Box.createRigidArea(new Dimension(20, 1)));
	//south.add(Box.createHorizontalGlue());
	
	
	//East Panel set up 
	//east.setOpaque(true);
	//east.setBackground(new Color(178, 247, 178));
	//east.setBorder(new MatteBorder(3, 6, 3, 6, new Color(50, 126, 52)));
	//east.add(Box.createVerticalGlue());
	
	//right side of the board 
	east.add(new Street(17, 11, 21, "Left", "511", 80,  Color.GREEN));
	east.add(new Street(18, 21, 31, "Left", "512", 100,  Color.CYAN));
	east.add(new Street(19, 31, 41, "Left", "513", 250,  Color.white));
	east.add(new Street(20, 41, 51, "Left", "514", 90,  Color.BLUE));
	east.add(new Street(21, 51, 61, "Left", "515", 550, Color.red));
	east.add(new Street(22, 61, 71, "Left", "516", 200,  Color.GRAY));
	
	
	//West Panel set up 
	//west.setOpaque(true);
	//west.setBackground(new Color(178, 247, 178));
	//west.setBorder(new MatteBorder(1, 1, 1, 1, new Color(50, 126, 52)));
	
	//left side of the board 
	west.add(new Street(23, 1, 1, "Right", "507", 100, new Color(94, 60, 49)));
	west.add(new Street(24, 1, 1, "Right", "508", 250, new Color(94, 60, 49)));
	west.add(new Street(25, 1, 1, "Right", "506", 90, Color.white));
	west.add(new Street(26, 1, 1, "Right", "509", 550, new Color(94, 60, 49)));
	west.add(new Street(27, 1, 1, "Right", "510", 200, Color.red));
	west.add(new CornerPlatform(28, 1, 1, "Right", "END!"));
	
	
 	**/


	
	

}
