package com.MonopolyGame;

public class Property {

	private String nameOfProperty;
	private String ownerOfProperty;
	private int rent;
	private int costOfProperty;
	
public Property(String nameOfProperty, String ownerOfProperty,int rent,int costOfProperty )
{
	this.nameOfProperty = nameOfProperty;
	this.ownerOfProperty =  ownerOfProperty;
	this.rent = rent;
	this.costOfProperty = costOfProperty;
	
}

public String getNameOfProperty() {
	return this.nameOfProperty;
}

public void setNameOfProperty(String nameOfProperty) {
	this.nameOfProperty = nameOfProperty;
}

public String getOwnerOfProperty() {
	return this.ownerOfProperty;
}

public void setOwnerOfProperty(String ownerOfProperty) {
	this.ownerOfProperty = ownerOfProperty;
}

public int getRent() {
	return this.rent;
}

public void setRent(int rent) {
	this.rent = rent;
}

public int getCostOfProperty() {
	return this.costOfProperty;
}

public void setCostOfProperty(int costOfProperty) {
	this.costOfProperty = costOfProperty;
}
	
}
