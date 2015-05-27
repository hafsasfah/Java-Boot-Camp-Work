package models;

import java.util.Observable;

public abstract class aPlayer extends Observable
{
	public abstract String getMove();
	public abstract int getID();
	public abstract int getCash();
	public abstract int getPayRent();
	public abstract int setLocation();
	public abstract int setCoordinates();
	public abstract int getPurchase();
	
}
