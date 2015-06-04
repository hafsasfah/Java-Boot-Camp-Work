package model;

public class Transactions 
{
	
	
	Person buyer;
	Stock stock;
	double stockPrice;
	String date;
	int amountBought;
	
	public Transactions(Person buyer, Stock stock, double stockPrice, String date, int amountBought) 
	{
		this.buyer = buyer;
		this.stock = stock;
		this.stockPrice = stockPrice;
		this.date = date;
		this.amountBought = amountBought;
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
