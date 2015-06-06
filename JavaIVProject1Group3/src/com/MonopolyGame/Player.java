package com.MonopolyGame;



public class Player implements IPlayer {
	

	private int playerId;
	private String playerName;
	private int  playerCash;
	private int propertyOwned = 0;
	private static Player currentPlayer;
	private Property location;
	private int position;


public int getPropertyOwned() {
		return propertyOwned;
	}

	public void setPropertyOwned(int propertyOwned) {
		this.propertyOwned = propertyOwned;
	}

	public static Player getCurrentPlayer() {
		return currentPlayer;
	}

	public static void setCurrentPlayer(Player currentPlayer) {
		Player.currentPlayer = currentPlayer;
	}

	public Property getLocation() {
		return location;
	}

	public void setLocation(Property location) {
		this.location = location;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

public Player(int playerId, String playerName, int playerCash , int position, int PropertyOwned){
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerCash = playerCash;
	this.propertyOwned = PropertyOwned;
	this.position = position;
}

	public int getplayerId()
	{
		return playerId;
	}
	
	public String getplayerName()
	{
		return playerName;
	}
	
	public int getplayerCash()
	{
		return playerCash;
	}
	
	public void purchaseProperty( )
	{
	   return ;
	}

	@Override
	public void setPlayerId(int playerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerName(String playerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayerCash(int playerCash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentPlayer(String currentPlayer) {
		// TODO Auto-generated method stub
		
	}
}
