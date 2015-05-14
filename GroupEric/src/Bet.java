
public class Bet implements iBet {

	private iPlayer player1;
	private iPlayer player2;
	private int wager;
	
	public Bet( iPlayer player1, iPlayer player2, int wager )
	{
		this.player1 = player1;
		this.player2 = player2;
		this.wager = wager;
	}
	
	public String race() {
		if ( player1.getVehicle().getQuarterMileTime() > player2.getVehicle().getQuarterMileTime() )
		{
			player1.addCash(wager);
			player2.addCash(wager * -1 );
			return player1.getName() + " in a " + player1.getVehicle().toString()
					+ " beats " + player2.getName() + " in a " + player2.getVehicle().toString();
		}
		else
		{
			player1.addCash(wager * -1);
			player2.addCash(wager);
			return player1.getName() + " in a " + player1.getVehicle().toString()
					+ " loses to " + player2.getName() + " in a " + player2.getVehicle().toString();
		}
	}
	
	public String toString()
	{
		return "";
	}
}
