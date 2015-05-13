
public class Player implements iPlayer {
	private String name;
	private int cash;
	private iVehicle car;
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getCash() {
		return cash;
	}
	
	@Override
	public void addCash(int cash) {
		this.cash += cash;
		
	}
	@Override
	public void setVehicle(iVehicle car) {
		this.car = car;
	}
	@Override
	public iVehicle getVehicle() {
		return car;
	}
}
