package com.MonopolyGame;

import javafx.beans.Observable;

public interface IProperty extends Observable{
	
	public String getNameOfProperty();
	public String ownerOfProperty();
	public int getRent();
	public int getCostOfProperty();
	

}
