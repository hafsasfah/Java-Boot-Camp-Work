
public class Bet implements iBet{

	private iPlayer player1;
	private iPlayer player2;
	private int wager;
	
	public Bet(iPlayer player1, iPlayer player2, int wager) {
		this.player1 = player1;
		this.player2 = player2;
		this.wager = wager;
	}
	
	public void setWager(int wager) {
		this.wager = wager;
	}
	
	@Override
	public int getWager() {
		return this.wager;
	}
	
	public boolean isValid() {
		return false;
	}
	
	@Override
	public String Race() {
		if (player1.getVehicle().getQuarterMileTime() > player2.getVehicle().getQuarterMileTime()){
			player1.addCash(wager);
			player2.addCash(wager * -1);
			return player1.getName() + " in a " + player1.getVehicle().toString() + 
					" defeated " + player2.getName() + " in a " + player2.getVehicle();
		}
		else {
			player2.addCash(wager);
			player1.addCash(wager * -1);
			return player2.getName() + " in a " + player2.getVehicle().toString() + 
					" defeated " + player1.getName() + " in a " + player1.getVehicle();
		}
	}
	
	
}