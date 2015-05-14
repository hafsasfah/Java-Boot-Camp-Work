package DGRacingGame;

import RacingGame.iVehicle;


public interface iPlayer
{
	String getName();
	int getCash();
	void addCash ( int cash );
	void setVehicle( iVehicle vehicle );
	iVehicle getVehicle();
	

}
