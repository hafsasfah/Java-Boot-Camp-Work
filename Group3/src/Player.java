
public class Player implements PlayerInterface
{

	String name;
	int cash;
	CarInterface car;
	
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
	public CarInterface getVehicle() {
		return car;
	}
	public void setVehicle(CarInterface car) {
		this.car = car;
	}
	
	
}
