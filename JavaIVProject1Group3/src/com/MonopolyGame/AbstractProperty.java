package com.MonopolyGame;

import java.util.LinkedList;
import java.util.Observable;

public abstract class AbstractProperty extends Observable
{
	public abstract String getNameOfProperty();
	public abstract void setNameOfProperty();
	public abstract String getOwnerOfProperty();
	public abstract String setOwnerOfProperty();
	public abstract void getRent();
	public abstract void setRent();
	public abstract int getCostOfProperty();
	public abstract void setCostOfProperty();
	public abstract LinkedList<AbstractPlayer> getParkedPlayers();
	public void addParkedPlayer(AbstractPlayer currentPlayer) {
		// TODO Auto-generated method stub
		
	}
	
}


