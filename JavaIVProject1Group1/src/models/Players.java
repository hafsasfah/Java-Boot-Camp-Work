package models;

import data.Coordinates;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashSet;

import views.PlayersView;
import interfaces.iPlayers;

public class Players extends aPlayers 
{
	public PlayersView playerview;
	private String name;
	public String locationOccupied = "GO";
	private int location = 0;
	private int cash = 1500;
	private int id;
	public Coordinates coord = new Coordinates();
	private Connection connection;
	
	
	public Players(String name) {
		this.name = name;
		cash = 1500;
	}
	
	
	public void setCash(int cash) {
		this.cash = cash;
	}

	public String getLocationOccupied() {
		return locationOccupied;
	}

	public void setLocationOccupied(String locationOccupied) {
		this.locationOccupied = locationOccupied;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public Players(String name,int x, int y, int id, PlayersView view)
	{
		this.name = name;
		this.coord.setRow(x);
		this.coord.setColumn(y);
		this.playerview = view;
		
	}

	public void takeTurn()
	{
		setChanged();
		notifyObservers();
	}
	
	
	@Override
	public String getName() {
		
		return this.name;
	}

	

	@Override
	public int getCash() {
		
		return this.cash;
	}



	@Override
	public int getID() {
		
		return id;
	}

}
