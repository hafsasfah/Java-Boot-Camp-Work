package models;

public class OwnedStock {

	private String playerName;
	private String ticker;
	private int numberOwned;

	public OwnedStock(String playerName, String ticker, int numberOwned) {
		this.setPlayerName(playerName);
		this.setTicker(ticker);
		this.setNumberOwned(numberOwned);
	}

	public int getNumberOwned() {
		return numberOwned;
	}

	public void setNumberOwned(int numberOwned) {
		this.numberOwned = numberOwned;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}
