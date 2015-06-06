package models;


public abstract class Player implements AbstractPlayer {
	

	private int playerId;
	private String playerName;
	private int  playerCash;
	private Object currentLocation;

public Player(int playerId, String playerName, int playerCash, Object currentLocation){
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerCash = playerCash;
	this.setCurrentLocation(currentLocation);
}
	@Override
	public int getplayerId()
	{
		return playerId;
	}
	@Override
	public String getplayerName()
	{
		return playerName;
	}
	@Override
	public int getplayerCash()
	{
		return playerCash;
	}
	
	public Object getCurrentLocation() {
		return currentLocation;
	}
	
	public void setCurrentLocation(Object currentLocation) {
		this.currentLocation = currentLocation;
		
	}
 
	
}
