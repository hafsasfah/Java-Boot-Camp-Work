

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


//******The Coordinates Class will be made for player location and design placement of the board********//

public class PropertyManager extends JPanel 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4907739068486854697L;
	
	protected int rowForLocation;						//Set up the location 
	protected int columnForLocation;					//Set up the location
	
	protected int width;
	protected int height;
	
	protected int number;								//Represents assigning number on each platform on the Game board
	protected Rectangle2D.Double buildRect;
	protected Rectangle2D.Double buildRect2;
	
	public String alignment;
	protected Color colorSetBorder = Color.black;
	
	CornerPlatform c;
	Street s;
	
	
	public PropertyManager()
	{
		
		
		
		
	}
	

	public PropertyManager(int n, int x, int y, String a)
	{
		this.number = n;
		this.rowForLocation = x;
		this.columnForLocation = y;
		this.alignment = a;
		
	
		
		setBounds(x, y, width, height);
		setOpaque(true);
		setBackground(new Color(159,214,141));
		/*
		if(alignment.equals("Up") || alignment.equals("Down"))
		{
			width = 0;
			height = 0;		
		}else if(alignment.equals("Left") || alignment.equals("Right"))
		{
			width = 0;
			height = 0;
		}
		**/
	}
	

	public int getNumberOfPlatformLocations()
	{
		
		return number;
		
	}
	
	public void setNumberOfPlatFormLocations(int n)
	{
		this.number = n;	
	}
	
	public Color getTheBoardColor()
	{
		
		
		return new Color(0,0,0);
	}
	
	public void setTheBoardColor(Color c)
	{
		
		this.colorSetBorder = c;
		
	}
	
	
	
	
	public String getName()
	{
		return "Platforms";
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setPaint(Color.black);
		g2d.setStroke(new BasicStroke(3));
		
		repaint();
		
	}
	
	
	public String toString()
	{
		return "The Platforms";	
	}
	
	
	
	
	
	
}
