
public class Gameboard implements iGameboard{
	Player[] players;
	Property[] properties;
	//Dice die;
	
	
	
	@Override
	public Player[] getPlayers() {
		
		return players;
	}

	@Override
	public Property[] getProperties() {
		return properties;
	}

	@Override
	public Property getProperty(int index) {
		return properties[index];
	}

	@Override
	public Player getPlayer(int index) {
		
		return players[index];
	}

}
