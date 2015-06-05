package StockModel;

public class OwnedStock
{
	String ticker;
	String player;
	Integer owned = 0;
	
	public OwnedStock()
	{
		
	}
	
	public OwnedStock(String player, String ticker, Integer owned)
	{
	this.ticker = player;
	this.player = ticker;
	this.owned = owned;
		
	}
	
	public String getTicker()
	{
		return ticker;
	}
	public void setTicker(String ticker)
	{
		this.ticker = ticker;
	}
	public String getPlayer() 
	{
		return player;
	}
	public void setPlayer(String player)
	{
		this.player = player;
	}
	public Integer getOwned()
	{
		return owned;
	}
	public void setOwned(Integer owned) 
	{
		this.owned = owned;
	}
	
	
	
	

}
