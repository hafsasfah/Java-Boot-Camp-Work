
public class Bet implements BetInterface
{

	private Player player1; 
	private Player player2;
	private int wager;
	
	public Bet(Player player1, Player player2, int wager)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.wager = wager;
	}
	
	
	@Override
	public String Race()
	{
		if(player1.getVehicle().makeRandom() > player2.getVehicle().makeRandom())
		{
			player1.addCash(wager);
			player2.addCash(-1 * (wager));
			return player1.getName() + " in a " + player1.getVehicle().getModel()
					+  " beats " + player2.getName() + " in a " + player2.getVehicle().getModel();
		}
		else 
		{	
			player1.addCash(wager * -1);
			player2.addCash(wager);
			return player1.getName() + " in a " + player1.getVehicle().getModel() + " loses to " 
			+ player2.getName() + " in a " + player2.getVehicle().getModel();

		}
		
		
		
		
	}

}
