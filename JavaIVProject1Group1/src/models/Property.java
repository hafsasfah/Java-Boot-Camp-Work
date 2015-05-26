package models;

import data.Coordinates;
import interfaces.iPlayers;
import interfaces.iProperty;

public class Property extends iProperty
{

	String name = "default";
	public Coordinates coord;
	
	public Property(int row, int column, String name)
	{
		coord = new Coordinates();
		this.coord.setRow(row);
		this.coord.setColumn(column);
		this.name = name;
		
	}
	@Override
	public void assignPlayerToProperty(iPlayers player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargePlayerRent(int rent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName()
	{
		return this.name;
	}

	
}
