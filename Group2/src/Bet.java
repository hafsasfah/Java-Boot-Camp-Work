
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
	public String race() {
		if (player1.getVehicle().getQuarterMileTime() < player2.getVehicle().getQuarterMileTime()){
			player1.addCash(wager);
			player2.addCash(wager * -1);
			return player1.getName() + " drove a " + player1.getVehicle().getColor() + " " + 
				player1.getVehicle().toString() + " for " + player1.getVehicle().getQuarterMileTime() 
				+ " seconds and defeated " + player2.getName() + " who drove a " + 
				player2.getVehicle().getColor() + " " + player2.getVehicle().toString() + " for " + 
				player2.getVehicle().getQuarterMileTime() + " seconds";
		}
		else {
			player2.addCash(wager);
			player1.addCash(wager * -1);
			return player2.getName() + " drove a " + player2.getVehicle().getColor() + " " + 
				player2.getVehicle().toString() + " for " + player2.getVehicle().getQuarterMileTime() 
				+ " seconds and defeated " + player1.getName() + " who drove a " + 
				player1.getVehicle().getColor() + " " + player1.getVehicle().toString() + " for " + 
				player1.getVehicle().getQuarterMileTime() + " seconds";
		}
	}
	
	
}