package RacingGame;

public class Player implements  PlayerI {

	
	
	String name;
	int cash;
	Car vehicle;
	
	@Override
	public String getName() {
	
		return name;
	}

	@Override
	public int getCash() {
		
		return cash;
	}

	@Override
	public int addCash(int cash) {
		this.cash+=cash;
		return this.cash;
	}

	public Player(String name, int cash, Car vehicle) {
		super();
		this.name = name;
		this.cash = cash;
		this.vehicle = vehicle;
	}

	@Override
	public void setVehicle(Car vehicle) {
		this.vehicle= vehicle;
	}

	

	@Override
	public Car getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

	
;
	
	
	
	
	
	
	
	
}
