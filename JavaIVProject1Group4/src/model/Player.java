package model;
import java.util.ArrayList;


public class Player implements iPlayer {
	String name;
	int location;
	int cash;
	ArrayList<Property> ownedProperties;
	
	
	public Player(String name){
		this.name = name;
		location = 0;
		cash = 1500;
		ownedProperties = new ArrayList<Property>(); 
		}
	public String getName(){
		return name;
	}
	public void addProp(Property prop){
		ownedProperties.add(prop);
	}
	
	@Override
	public int getLocation() {
			return location;
	}
	@Override
	public void setLocation(int location) {
		this.location = location;
		
	}
	
	public void move(int spaces)
	{
		if(location + spaces < 35)
		{
			location += spaces;
		}
		else 
		{	
			location = (location+spaces) -36;
		}
	}
		
	@Override
	public int getCash() {
		
		return cash;
	}
	@Override
	public void setCash(int amountSpent) {
		this.cash += amountSpent;
		
	}
	
	public ArrayList<Property> getPlayerOwnedProperties() {
		// TODO Auto-generated method stub
		return ownedProperties;
	}
	@Override
	public void addProperty(int indexOfProperty) {
		//ownedProperties.add(indexOfProperty);
		
	}
}
