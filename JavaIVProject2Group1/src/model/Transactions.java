package model;

public class Transactions 
{
	Person buyer;
	Stock stock;
	double stockPrice;
	int amountBought;
	String date;

	public Transactions(Person buyer, Stock stock, double stockPrice, String date, int amountBought) 
	{
		this.buyer = buyer;
		this.stock = stock;
		this.stockPrice = stockPrice;
		this.date = date;
		this.amountBought = amountBought;
	}	
	
	
	public Person getBuyer() 
	{
		return buyer;
	}

	public void setStock(Stock stock) 
	{
			this.stock = stock;
	}

	public double getStockPrice() 
	{
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) 
	{
		this.stockPrice = stockPrice;
	}

	public String getDate() 
	{
		return date;
	}

	public int getAmountBought()
	{
		return amountBought;
	}

	public void setBuyer(Person buyer) 
	{
		this.buyer = buyer;
	}

	public Stock getStock() 
	{
		return stock;
	}
	
	
	public void setDate(String date)
	{
		this.date = date;
	}

	public void setAmountBought(int amountBought) 
	{
		this.amountBought = amountBought;
	}
}
