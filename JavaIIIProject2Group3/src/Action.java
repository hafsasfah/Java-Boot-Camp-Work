public class Action {

	public static int attack(int attackerStrength, int opponentHitPoints) {
		return attackerStrength - opponentHitPoints;
	}
	
	public static int sleep(int playerHitPoints) {
		playerHitPoints += 1;
		return playerHitPoints;
	}
	
	public static int run(int playerHitPoints) {
		// TEMP: update certain buttons to be disabled later
		playerHitPoints -= 1; // damage is 1 upon being a coward
		return playerHitPoints;
	}
	
	public static int haraKiri() {
		return 0;
	}
}