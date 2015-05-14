package RacingGame;

public interface iPlayer 
{
	
	String getName();
	int getCash();
	void addCash(int cash);
	void setVehicle(iVehicle car);
	iVehicle getVehicle();
	
}
