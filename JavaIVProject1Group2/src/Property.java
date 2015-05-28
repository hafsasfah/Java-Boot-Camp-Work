

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Property 
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8240929997527619885L;
	private String name;
	private int cost;
	private Color color;

	
	
	
	public Property(int n, int x, int y, String a, String name, int cost, Color color)
	{
		
		this.name = name;
		this.cost = cost;
		this.color = color;
		
		
	}
	
	public int getPropertyCost()
	{
		return this.cost;	
	}
	
	public void setPropertyCost(int cost)
	{
		this.cost = cost; 
	}
	
	public String getNameOfTheProperty()
	{
		
		return this.name;
		
	}
	
	public void setNameOfTheProperty(String name)
	{
		
		this.name = name;
		
	}
	

	public Color getColor()
	{
		
		return this.color;
		
	}
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	


