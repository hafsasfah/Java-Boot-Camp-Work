package interfaces;

import java.util.Observable;

import data.Coordinates;

public abstract class iProperty extends Observable {

	public abstract void assignPlayerToProperty(iPlayers player);
	public abstract void chargePlayerRent(int rent);
	public Coordinates coord = new Coordinates();
	public abstract String getName();
	
}
