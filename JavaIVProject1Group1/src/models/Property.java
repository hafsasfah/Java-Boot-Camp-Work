package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import data.Coordinates;
import interfaces.iPlayers;

public class Property extends aProperty {
	private int rentPrice;
	private int purchasePrice;
	private int ID;
	private int ownerID;
	private String name;
	public Coordinates coord;
	private Players player;
	ArrayList<Players> parkedPlayers;
	public boolean BUYABLE = true;
	private Connection connection;
	
	public Property(String name) {
		this.name = name;
		rentPrice = 10;
		purchasePrice = 100;
	}
	
	public boolean isBUYABLE() {
		return BUYABLE;
	}

	public void setBUYABLE(boolean bUYABLE) {
		BUYABLE = bUYABLE;
	}

	public Property(int row, int column, String name)
	{
		coord = new Coordinates();
		this.coord.setRow(row);
		this.coord.setColumn(column);
		this.name = name;
		
	}
	
	public Property(String name, int ID, int rentPrice, int purchasePrice, 
			int row, int column)
	{
		this.name = name;
		this.ID = ID;
		this.rentPrice = rentPrice;
		this.purchasePrice = purchasePrice;
		coord = new Coordinates();
		this.coord.setRow(row);
		this.coord.setColumn(column);
	}

	@Override
	public void assignPlayerToProperty(iPlayers player) {
		//null4now
	}

	@Override
	public void chargePlayerRent(int rent) {
		//null4now
	}
	
	public Coordinates getCoord() {
		return coord;
	}

	public int getOwnerID() {
		return this.ownerID;
	}
	
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
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

	@Override
	public ArrayList<Players> getPlayerParty() {
		if (player.coord.getRow() == this.coord.getRow() && 
				player.coord.getColumn() == this.coord.getColumn()) {
			parkedPlayers.add(player);
		}
		return parkedPlayers;
	}
}
