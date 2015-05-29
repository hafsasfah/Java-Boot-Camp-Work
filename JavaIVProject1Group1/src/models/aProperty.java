package models;

import interfaces.iPlayers;

import java.util.ArrayList;
import java.util.Observable;

public abstract class aProperty extends Observable {

	public abstract int getOwnerID();
	public abstract int getID();
	public abstract int getPurchasePrice();
	public abstract int getRentalPrice();
	public abstract void assignPlayerToProperty(iPlayers player);
	public abstract void chargePlayerRent(int rent);
	public abstract String getName();
	public abstract ArrayList<Players> getPlayerParty();
 	
	//public abstract AbstractPlayer getOwner();
	//public abstract int hashCode();
	
}
