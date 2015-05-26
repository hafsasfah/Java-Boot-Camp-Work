package models;

import java.util.Observable;

public abstract class AbstractProperty extends Observable {
	public abstract int getID();
	public abstract String getName();
	public abstract int getPurchasePrice();
	public abstract int getRentalPrice();
	public abstract AbstractPlayer getOwner();
	public abstract int hashCode();
}