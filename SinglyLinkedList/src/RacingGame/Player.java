package RacingGame;

public class Player implements  PlayerI {

	
	
	String name;
	int cash;
	VehicleI vehicle;
	
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

	public Player(String name, int cash, VehicleI vehicle) {
		super();
		this.name = name;
		this.cash = cash;
		this.vehicle = vehicle;
	}

	@Override
	public void setVehicle(VehicleI vehicle) {
		this.vehicle= vehicle;
	}

	

	@Override
	public VehicleI getVehicle() {
		// TODO Auto-generated method stub
		return vehicle;
	}

	
;
	
	
	
	
	
	
	
	
}
