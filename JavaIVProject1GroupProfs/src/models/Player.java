package models;

import java.util.*;

public class Player extends AbstractPlayer {

	private int id;
	private String name;
	private int money;
	private HashSet<AbstractProperty> properties;
	
	public Player( int id, String name, int money )
	{
		this.id = id;
		this.name = name;
		this.money = money;
		properties = new HashSet<AbstractProperty>();
	}
	
	@Override
	public int getID() {
		return id;
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
		return money <= 0;
	}

	@Override
	public HashSet<AbstractProperty> getOwnedProperties() {
		return properties;
	}

	@Override
	public void purchaseProperty(AbstractProperty property) {
		properties.add( property );
		setChanged();
		notifyObservers();
	}
}
