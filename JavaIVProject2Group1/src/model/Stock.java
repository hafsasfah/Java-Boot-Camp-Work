package model;

public class Stock 
{
	String ticker;
	String name;
	double openingPrice;
	int amountOwned;
	
	public Stock(String ticker, String name)
	{
		this.name = name;
		this.ticker = ticker;
		amountOwned = 0;
	}
	
	public Stock( String name, int amountOwned)
	{
		this.name = name;
		
		this.amountOwned = amountOwned;
	}
	public void setTicker(String ticker)
	{
		this.ticker=ticker;
	}
	
	public int getAmountOwned(){
		return this.amountOwned;
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
