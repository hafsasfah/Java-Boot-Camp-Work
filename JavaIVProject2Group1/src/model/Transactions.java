package model;

public class Transactions 
{

	int purse;
	int stockPrice;
	String date;
	
	public Transactions(int purse, int stockPrice, String date) 
	{
		this.purse = purse;
		this.stockPrice = stockPrice;
		this.date = date;
	}
	
	public double buyStock()
	{
		
		return (purse - stockPrice);
		
	}
	
	public double sellStock()
	{
		
		return (purse + stockPrice);
		
	}
}
