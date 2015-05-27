package com.MonopolyGame;

public abstract class Player implements IPlayer {
	

	private int playerId;
	private String playerName;
	private int  playerCash;


public Player(int playerId, String playerName, int playerCash){
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerCash = playerCash;
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
}
