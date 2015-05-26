package model;
import java.util.ArrayList;


public class Player implements iPlayer {
	String name;
	int location;
	int cash;
	ArrayList<Integer> ownedProperties;
	
	
	public Player(String name){
		this.name = name;
		location = 0;
		cash = 1500;
		}
	public String getName(){
		return name;
	}
	
	@Override
	public int getLocation() {
			return location;
	}
	@Override
	public void setLocation(int location) {
		this.location = location;
		
	}
	@Override
	public int getCash() {
		
		return cash;
	}
	@Override
	public void setCash(int amountSpent) {
		this.cash += amountSpent;
		
	}
	@Override
	public ArrayList<Integer> getPlayerOwnedProperties() {
		// TODO Auto-generated method stub
		return ownedProperties;
	}
	@Override
	public void addProperty(int indexOfProperty) {
		ownedProperties.add(indexOfProperty);
		
	}
}
