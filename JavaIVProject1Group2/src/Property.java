

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import logic.DiceRoll;

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
	

	public Property()
	{
		
		
		this.ID = DiceRoll.getRollOne();
		this.ID = DiceRoll.getRollTwo();

	}
	
	
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
	

	public ArrayList<Property> getProperty()
	{
		return property;
	}
	
	public void initializingPropertyTest()
	{
		
		
		property = new ArrayList<Property>();
		
		Property bank = new Property(1,"BANK", 0);
		Property jail = new Property(2,"Jail", 1500);
		Property salon = new Property(3,"Salon", 40);
		Property partyStore = new Property(5,"Party Store", 12);
		Property playboyMansion = new Property(6,"Playboy Mansion", 800);
		Property localBar = new Property(7,"Local Bar", 25);
		
		
		Property operaHouse = new Property(8,"Opera House", 300);
		Property discoClub = new Property(9,"Disco Club", 200);
		Property hospital = new Property(10,"Hospital", 1000);
		Property halfwayHouse = new Property(11,"Halfway House", 70);
		Property dayCare = new Property(12,"Daycare", 60);
		Property policeStation = new Property(13,"Police Station", 900);
		Property burgerJoint = new Property(14,"Burger Joint", 10);
		
		
		
		property.add(bank);
		property.add(jail);
		property.add(salon);
		property.add(partyStore);
		property.add(playboyMansion);
		
		property.add(localBar);
		property.add(operaHouse);
		property.add(discoClub);
		property.add(hospital);
		
		property.add(halfwayHouse);
		property.add(dayCare);
		property.add(policeStation);
		property.add(burgerJoint);
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	


