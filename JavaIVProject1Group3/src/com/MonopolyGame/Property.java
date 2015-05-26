package com.MonopolyGame;



public class Property extands Observable implements IProperty
{

	private String nameOfProperty;
	private String ownerOfProperty;
	private int rent;
	private int costOfProperty;
	
public Property()
{
	
	
}

public String getNameOfProperty() {
	return nameOfProperty;
}

public void setNameOfProperty(String nameOfProperty) {
	this.nameOfProperty = nameOfProperty;
}

public String getOwnerOfProperty() {
	return ownerOfProperty;
}

public void setOwnerOfProperty(String ownerOfProperty) {
	this.ownerOfProperty = ownerOfProperty;
}

public int getRent() {
	return rent;
}

public void setRent(int rent) {
	this.rent = rent;
}

public int getCostOfProperty() {
	return costOfProperty;
}

public void setCostOfProperty(int costOfProperty) {
	this.costOfProperty = costOfProperty;
}


public String ownerOfProperty() {
	// TODO Auto-generated method stub
	return null;
}
	
}
