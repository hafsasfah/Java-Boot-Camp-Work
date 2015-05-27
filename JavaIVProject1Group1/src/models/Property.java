package models;

import data.Coordinates;
import interfaces.iPlayers;


public class Property extends aProperty {
	private int rentPrice;
	private int purchasePrice;
	private int ID;
	private String name;
	private Coordinates coord = new Coordinates();
	
	public Property(String name, int ID, int rentPrice, int purchasePrice, Coordinates coord) {
		this.name = name;
		this.ID = ID;
		this.rentPrice = rentPrice;
		this.purchasePrice = purchasePrice;
		this.coord = coord;
	}
	
	@Override
	public void assignPlayerToProperty(iPlayers player) {
		//null
	}

	@Override
	public void chargePlayerRent(int rent) {
		//null
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	@Override
	public int getRentalPrice() {
		return rentPrice;
	}
	
	public void setRentalPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

}
