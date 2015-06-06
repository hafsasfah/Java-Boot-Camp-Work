package com.MonopolyGame;

public interface IPlayer {

	public int getPlayerId;
	public void setPlayerId(int playerId);
	public String getPlayerName;
	public void setPlayerName(String playerName); 
	public int  getPlayerCash;
	public void  setPlayerCash(int playerCash);
	public int getPropertyOwned = 0;
	public static Player getCurrentPlayer;
	public void setCurrentPlayer(String currentPlayer);
	public Property getLocation;
	public void setLocation(Property location);
	public int getPosition;
	public void setPosition(int position);

}
