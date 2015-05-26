package models;

import java.util.*;

public abstract class AbstractPlayer extends Observable {
	public abstract int getID();
	public abstract String getName();
	public abstract int getMoney();
	public abstract void spendMoney(int money);
	public abstract boolean hasLostGame();
	public abstract HashSet<AbstractProperty> getOwnedProperties();
	public abstract void purchaseProperty( AbstractProperty property );
}