package DGRacingGame;



public class Player implements iPlayer 
{
	private String name;
	private int cash;
	private iVehicle car;
	
	
	public String getName() 
	{
		
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	public int getCash() 
	{
		
		return cash;
	}
	
	public void setCash(int cash)
	{
		this.cash = cash;
	}
	
	
	public void addCash(int cash) 
	{
		this.cash += cash;
	}
	
	
	public void setVehicle(iVehicle car) 
	{
		this.car = car;
	}
	
	public iVehicle getVehicle() 
	{
		return car;
	}

	
	public void setVehicle(RacingGame.iVehicle vehicle) 
	{
		
	}

	
	public RacingGame.iVehicle getVehicle() {
		
		return null;
	}
	
}
