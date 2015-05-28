package models;

import data.Coordinates;
import java.util.HashSet;

import interfaces.iPlayers;


public class Players extends aPlayers 
{
	private String name;
	private int location;
	private int cash = 1500;
	private int id;
	public Coordinates coord = new Coordinates();
	
	
	public Players(String name,int x, int y, int id)
	{
		this.name = name;
		this.coord.setRow(x);
		this.coord.setColumn(y);
		
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
