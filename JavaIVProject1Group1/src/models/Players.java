package models;

import interfaces.iPlayers;


public class Players implements iPlayers 
{
	String move;
	int purchase;
	int payRent;
	int location;
	int coordinates;
	int cash;
	
	public Players(String move, int purchase, int payRent, int location, int coordinates)
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

}
