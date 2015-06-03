package models;

public class Stock 
{
	private String ticker;
	private String name;
	
	public Stock( String ticker, String name )
	{
		this.setTicker(ticker);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
}
