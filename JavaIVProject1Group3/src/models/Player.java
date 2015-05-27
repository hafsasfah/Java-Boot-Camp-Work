package models;


public class Player implements AbstractPlayer {
	

	private int playerId;
	private String playerName;
	private int  playerCash;
	


public Player(int playerId, String playerName, int playerCash){
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerCash = playerCash;
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
	
	@Override
	public void purchaseProperty( )
	{
	   return ;
	}

	@Override
	public void currentLocation() {
		// TODO Auto-generated method stub
		
	}
 
	
}
