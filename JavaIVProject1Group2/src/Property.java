

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Property 
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8240929997527619885L;
	private String name;
	private int cost;
	private int ID;
	ArrayList<Property> property = new ArrayList<Property>();	
	
	public Property(int id, String name, int cost)
	{
		
		this.ID = id;
		this.name = name;
		this.cost = cost;
	}
	
	
	
	public int getID()
	{
		
		return ID;
	}
	
	
	public void setID(int id)
	{
		
		this.ID = id;
		
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
	

		
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	


