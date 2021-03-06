import java.awt.Graphics;
import java.util.HashSet;

import logic.DiceRoll;





public class Player implements IPlayer
{
	private int id;
	private String name;
	private int money = 15000;
	private int propertyOwned = 0;
	private static Player currentPlayer;
	private Property location;
	private int position;
	
	
	
	public Player( int id, String name, int money, int position, int PropertyOwned)
	{
		this.id = id;
		this.name = name;
		this.money = money;
		this.propertyOwned = PropertyOwned;
		this.position = position;
	}
	
	public int getID() {
		return id;
	}


	
	
	

	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name)
	{
		this.name = name;
		
		
	}


	public int getMoney() {
		return money;
	}
	
	
	public void setMoney(int money)
	{
		
		this.money = money;
		
	}

	
	public int getPropertyOwned()
	{
		return propertyOwned;

	}

	public void spendMoney(int money) {
		this.money -= money;
		setChanged();
		notifyObservers();
	}
	public int getProperty (int Property) {
		return Property;
	}


	private void notifyObservers() {
		
		
	}

	private void setChanged() {
		
		
	}

	public boolean hasLostGame() {
		return money <= 0;
	}
	
	public void setHasLostMoney(int money)
	{
		
		this.money = money;
	}
	
	

	
	public Player getCurrentPlayer()
	{
		
		return currentPlayer;
	}
	
	public void setCurrentPlayer(Player aCurrentPlayer)
	{
		
		currentPlayer = aCurrentPlayer;
		
	}
	
	
	public Property getLocation()
	{
		
		return location;
	}
	
	public void setLocation(Property location)
	{
		
		this.location = location;
		
	}
	
	
	public int getCurrentPosition()
	{
		return position;
		
	}
	
	public void setCurrentPosition(int position)
	{
		
		this.position = position;
		
		
	}

	@Override
	public void setPropertyOwned(int propertyOwned) {
		
		this.propertyOwned = propertyOwned;
		
	}

	@Override
	public void setID(int id) 
	{
		this.id = id;
		
	}
	
	

}
