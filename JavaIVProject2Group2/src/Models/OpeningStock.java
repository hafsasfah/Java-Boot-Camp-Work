package Models;


public class OpeningStock
	
	{
	private String ticker;
	private double price;
	private String date;
	public OpeningStock( String ticker, String date, double price )
	{

		this.setTicker(ticker);

		this.setPrice(price);
	}
	
	public double getPrice() 
	{
	return price;
	}

	public void setPrice(double price)
	{
	this.price = price;
	}

	public String getTicker() 
	{
	return ticker;
	}

	public void setTicker(String ticker) 
	{
	this.ticker = ticker;
	}
	
	public String getDate() 
	{
		return date;
	}
		
	public void setDate(String date) 
	{
		this.date = date;
	}
}