package models;

import data.Coordinates;
import java.util.HashSet;

import interfaces.iPlayers;


public class Players extends aPlayers 
{
	private String move;
	private int purchase;
	private int payRent;
	private int location;
	private int coordinates;
	int cash;
	Coordinates coord = new Coordinates();
	int id;
	
	public Players(String move, int purchase, int payRent, int location, int coordinates, int id)
	{
		this.move = move;
		this.purchase = purchase;
		this.payRent = payRent;
		this.cash = cash;
		
	}

	@Override
	public String getMove() {
		
		return this.move;
	}

	
	@Override
	public int getPayRent() {
		
		return this.payRent;
	}

	@Override
	public int getCash() {
		
		return this.cash;
	}

	@Override
	public int setLocation() {
		
		return location;
	}

	@Override
	public int setCoordinates() {
		
		return coordinates;
	}

	@Override
	public int getPurchase() {
		
		return this.purchase;
	}

	@Override
	public int getID() {
		
		return id;
	}

}
