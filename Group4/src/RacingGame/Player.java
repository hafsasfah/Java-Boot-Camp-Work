package RacingGame;

public class Player implements iPlayer
{

	private String name;
	private int cash;
	private iVehicle car;
	
	public Player(String name, int cash, iVehicle car) 
	{
		super();
		this.name = name;
		this.setCash(cash);
		this.car = car;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	
	public void addCash(int cash) 
	{
		this.cash += cash;
		
	}

	public iVehicle getVehicle()
	{
		return car;
	}
	
	
	public void setVehicle(iVehicle car) 
	{
		this.car = car;
	}
	
	
}
