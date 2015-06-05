
public interface iPlayer {
	
	String getName();
	int getCash();
	void setName(String name);
	void addCash(int cash);
	void setVehicle(iVehicle car);
	iVehicle getVehicle();
}