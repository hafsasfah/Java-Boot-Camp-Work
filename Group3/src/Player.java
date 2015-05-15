
public class Player implements PlayerInterface
{

	String name = "default";
	int cash;
	CarClass car = new CarClass();
	int numcompare;
	
	public Player() 
	{
	this.cash = 100;	
	}
	
	public Player(String name, int cash , CarClass car)
	{
		this.name = name;
		this.cash = cash;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCash() {
		return cash;
	}
	public void addCash(int cash) {
		this.cash += cash;
	}
	public CarClass getVehicle() {
		return car;
	}
	public void setVehicle(CarClass car) {
		this.car = car;
	}
	
	
}
