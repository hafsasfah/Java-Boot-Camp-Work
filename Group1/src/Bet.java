
public class Bet {
	
	private Player player1;
	private Player player2;
	private int wager = 0;

	public Bet( Player player1, Player  player2, int wager)
	{
		this.player1 = player1;
		this.player2 = player1;
		this.wager = wager;
	}
	
	public String Race()
	{	
		
		if player1.getVehicle().getQuarterMile(); //TODO: these should be player1.getVehicle().getQuaterMile() ;
		{
			player1.addCash(wager);
			player2.addCash(-(wager));
			System.out.print("Player 1 Wins");
		}
		else if player2.getVehicle().getQuarterMile();
		{
			player1.addCash(-(wager));
			player2.addCash(wager);
			System.out.print("Player 2 Wins");
		}
		else
		{
			System.out.print("There is a tie");
		}

	}
}
