package models;

import java.util.*;

public abstract class AbstractProperty extends Observable implements Comparable<AbstractProperty> {
	public abstract int getID();
	public abstract void setID( int id );
	public abstract int getSequenceNumber();
	public abstract int getGameID();
	public abstract String getName();
	public abstract int getPurchasePrice();
	public abstract int getRentalPrice();
	public abstract AbstractPlayer getOwner();
	public abstract int hashCode();
	public abstract LinkedList<AbstractPlayer> getParkedPlayers();
}