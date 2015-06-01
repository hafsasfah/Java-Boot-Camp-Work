package models;

import java.util.*;

public class Player extends AbstractPlayer {

	private int id;
	private String name;
	private int money;
	private ArrayList<AbstractProperty> properties;
	private int gameID;
	private AbstractProperty currentLocation;
	
	public Player( String name, int money, int gameID, AbstractProperty currentLocation )
	{
		this.name = name;
		this.money = money;
		this.gameID = gameID;
		properties = new ArrayList<AbstractProperty>();
		this.currentLocation = currentLocation;
	}
	
	public Player( int id, String name, int money, int gameID, ArrayList<AbstractProperty> properties, AbstractProperty currentLocation )
	{
		this.id = id;
		this.name = name;
		this.money = money;
		this.gameID = gameID;
		this.properties = properties;
		this.currentLocation = currentLocation;
	}
	
	@Override
	public int getID() {
		return id;
	}
	
	@Override
	public void setID(int id) {
		this.id = id;
	}
	
	@Override
	public int getGameID() {
		return gameID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public void spendMoney(int money) {
		this.money -= money;
		setChanged();
		notifyObservers();
	}

	@Override
	public boolean hasLostGame() {
		return money < 0;
	}

	@Override
	public ArrayList<AbstractProperty> getOwnedProperties() {
		return properties;
	}

	@Override
	public void purchaseProperty(AbstractProperty property) {
		spendMoney( property.getPurchasePrice() );
		properties.add( property );
		setChanged();
		notifyObservers();
	}

	@Override
	public AbstractProperty getCurrentLocation() {
		return currentLocation;
	}

	@Override
	public void setCurrentLocation(AbstractProperty newLocation) {
		currentLocation = newLocation;
		setChanged();
		notifyObservers();
	}

	@Override
	public void addMoney(int money) {
		this.money += money;	
		setChanged();
		notifyObservers();
	}
}
