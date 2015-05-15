import javax.swing.JOptionPane;


public class Bet {
	
	//private PlayerI player1;
//	private PlayerI player2;
	//private int wager = 0;

	public Bet( PlayerI player1, PlayerI  player2, int wager)
	{
		//this.player1 = player1;
		//this.player2 = player1;
		//this.wager = wager;
	}
	
	public static void race(PlayerI player1, PlayerI player2, int wager)
	{	//TODO: what are these if statements doing!?!? Im assuming you want to compare between the two speeds
		
		double player1Speed=player1.getVehicle().getQuarterMile(); ;
		double player2Speed=player2.getVehicle().getQuarterMile();
		
		if (player1Speed<player2Speed)
		{
			player1.addCash(wager);
			player2.addCash(-1*wager);
			JOptionPane.showMessageDialog(null, "Player 1 Wins\nPlayer 1 now has $" + player1.getCash()+ " \nPlayer 2 now has $" + player2.getCash() );
		}
		else if (player2Speed<player1Speed)
		{
			player1.addCash(-1*wager);
			player2.addCash(wager);
			JOptionPane.showMessageDialog(null, "Player 2 Wins\nPlayer 1 now has $" + player1.getCash()+ " \nPlayer 2 now has $" + player2.getCash() );
		}
		else
		{
			JOptionPane.showMessageDialog(null,"There is a tie");
		}

	}
}
