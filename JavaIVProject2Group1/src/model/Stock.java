package model;

public class Stock 
{
	String ticker;
	String name;
	double openingPrice;
	
	public Stock(String ticker, String name)
	{
		this.name = name;
		this.ticker = ticker;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getTicker()
	{
		return ticker;
	}
	
	public void setPrice(double price)
	{
		this.openingPrice=price;
	}
	
	public double getPrice()
	{
		return openingPrice;
	}
}
