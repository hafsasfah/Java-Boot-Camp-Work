package com.MonopolyGame;

import java.util.LinkedList;
import java.util.Observable;

import UtilityPropertyGroup;

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
	public AbstractPlayer getOwner() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setOwner(AbstractPlayer currentPlayer) {
		// TODO Auto-generated method stub
		
	}
	public int getRentalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public UtilityPropertyGroup getPropertyGroup() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


