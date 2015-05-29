

public interface IPlayer 
{


	public int getID();
	public String getName();
	public void setName(String name);
	public int getMoney();
	public void setMoney(int money);
	public void setPropertyOwned(int propertyOwned);
	public void spendMoney(int money);
	public int getPropertyOwned();
	public boolean hasLostGame();
	public void setHasLostMoney(int money);
	public Player getCurrentPlayer();
	public void setCurrentPlayer(Player aCurrentPlayer);
	public Property getLocation();
	public void setLocation(Property location);
	public int getCurrentPosition();
	public void setCurrentPosition(int position);
	
	
	
	
	
	
	
	
	
	
}
