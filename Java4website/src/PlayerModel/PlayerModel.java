package PlayerModel;

public class PlayerModel 
{
	
	
	private String name;
	private double cash; 
	
	//if (putData.containsKey("name") && putData.containsKey("ticker") && putData.containsKey("numberOwned"))
	
	public PlayerModel(String name, double cash)
	{
		
		this.name = name;
		
		this.cash = cash;
		
		
	}
	
	
	
	public String getThePlayerName()
	{
		
		
		return name;
		
	}
	
	public double getThePlayerCash()
	{
		
		return cash;
		
	}
	
	
	public void setThePlayerName(String name)
	{
		
		this.name = name;
		
	}
	
	public void setThePlayerCash(double cash)
	{
		
		this.cash = cash;
		
	}
	
	

}
