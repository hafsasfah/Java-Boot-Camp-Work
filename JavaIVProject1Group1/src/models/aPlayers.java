package models;

import java.util.Observable;

public abstract class aPlayers extends Observable
{
	public abstract String getName();
	public abstract int getID();
	public abstract int getCash();
	
}
