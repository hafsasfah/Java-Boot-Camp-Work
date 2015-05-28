package models;

import data.Coordinates;

import java.util.HashSet;

import views.PlayersView;
import interfaces.iPlayers;


public class Players extends aPlayers 
{
	private String name;
	private int location;
	private int cash = 1500;
	private int id;
	public Coordinates coord = new Coordinates();
	PlayersView playerview;
	
	
	public Players(String name,int x, int y, int id)
	{
		this.addObserver(playerview);
		this.name = name;
		this.coord.setRow(x);
		this.coord.setColumn(y);
		
	}

	public void takeTurn(int rollResult)
	{
		if(this.coord.getRow() == 10 && this.coord.getColumn() >= 0)
		{
			this.coord.setColumn(this.coord.getColumn() - rollResult);
			setChanged();
			notifyObservers();
		}
		if(this.coord.getRow() == 10 && ((this.coord.getColumn() - rollResult) < 0))
		{
			rollResult = rollResult - this.coord.getColumn();
			this.coord.setColumn(0);
			this.coord.setRow(this.coord.getRow() - rollResult);
			setChanged();
			notifyObservers();
		}
		
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
