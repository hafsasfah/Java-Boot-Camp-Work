import javax.swing.JOptionPane;


public class Bet {
		
	public static void race(PlayerI player1, PlayerI player2)
	{	//TODO: what are these if statements doing!?!? Im assuming you want to compare between the two speeds
		boolean flag = false;
		int wager = Integer.parseInt(JOptionPane.showInputDialog("Enter amout to wager"));
		if (wager>player1.getCash() || wager > player2.getCash() ){ flag = true;}
		while(flag){
			wager = Integer.parseInt(JOptionPane.showInputDialog("Error\nAmout to wager must be less then or equal too both player's wallets\nPlayer 1 now has $" + player1.getCash()+ " \nPlayer 2 now has $" + player2.getCash() +"\n\n Enter wager"));
			if (wager <= player1.getCash() && wager <= player2.getCash() ){
				flag = false;
				
				
			}
		}
		
		if (player1.getCash() == 0 || player2.getCash()==0){
			if(player1.getCash() ==0){
				JOptionPane.showMessageDialog(null, "Player 2 has won the game!!!!!!" );
				
			}
			if(player2.getCash() ==0){
				JOptionPane.showMessageDialog(null, "Player 1 has won the game!!!!!!" );
				
			}
		}
		else{
		double player1Speed=player1.getVehicle().getQuarterMile(); ;
		double player2Speed=player2.getVehicle().getQuarterMile();
		
		if (player1Speed<player2Speed)
		{
			player1.addCash(wager);
			player2.addCash(-1*wager);
			JOptionPane.showMessageDialog(null, "Player 1 wins the race\nPlayer 1 now has $" + player1.getCash()+ " \nPlayer 2 now has $" + player2.getCash() );
		}
		else if (player2Speed<player1Speed)
		{
			player1.addCash(-1*wager);
			player2.addCash(wager);
			JOptionPane.showMessageDialog(null, "Player 2 wins the race\nPlayer 1 now has $" + player1.getCash()+ " \nPlayer 2 now has $" + player2.getCash() );
		}
		else
		{
			JOptionPane.showMessageDialog(null,"There is a tie");
		}
		}

	}
}
