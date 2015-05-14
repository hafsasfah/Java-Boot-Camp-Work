

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
	
	public int subtractCash(int cash) {
		this.cash-=cash;
		return this.cash;
	}
	
	
	
	public Player(String name, int cash, VehicleI vehicle) {
		super();
		this.name = name;
		this.cash = cash;
		this.vehicle = vehicle;
	}
	public Player(String name, int cash) {
		super();
		this.name = name;
		this.cash = cash;
		this.vehicle = null;
	}

	@Override
	public void setVehicle(VehicleI vehicle) {
		this.vehicle= vehicle;
	}

	

	@Override
	public VehicleI getVehicle() {
		return vehicle;
	}

	
;
	
	
	
	
	
	
	
	
}
