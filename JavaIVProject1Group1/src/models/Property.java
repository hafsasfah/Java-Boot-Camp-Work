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
	
	public Property() {
				
		try {
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE \"Property\" (\"ID\" serial NOT NULL,"
					+ "\"Name\" character varying(50), \"PurchasePrice\" integer, "
					+ "\"RentalPrice\" integer, \"Owner_Player_ID\" integer, "
					+ "\"Game_ID\" integer,CONSTRAINT \"Property_PK\" PRIMARY KEY (\"ID\"), "
					+ "CONSTRAINT \"Property_Game_ID_FK\" FOREIGN KEY (\"Game_ID\") "
					+ "REFERENCES \"Game\" (\"ID\") MATCH SIMPLE ON UPDATE NO ACTION ON DELETE "
					+ "NO ACTION,"
					+ "CONSTRAINT \"Property_Owner_Player_ID_FK\" FOREIGN KEY (\"Owner_Player_ID\")"
					+ "REFERENCES \"Player\" (\"ID\") MATCH SIMPLE "
					+ "ON UPDATE NO ACTION ON DELETE NO ACTION) "
					+ "WITH ( OIDS=FALSE ); ALTER TABLE \"Property\" OWNER TO postgres;";
			statement.execute(insertsql);
		}
			catch (Exception e) {
				e.printStackTrace();
		}
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
