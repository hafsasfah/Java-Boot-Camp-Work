package models;

public class StockOwned {
	private String userName;
	private String ticker;
	private int shares;
		
	public StockOwned(String userName, String ticker, int shares) {
		this.setUserName(userName);
		this.setTicker(ticker);
		this.setShares(shares);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}
		

}
