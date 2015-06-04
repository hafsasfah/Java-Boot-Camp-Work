package model;

public class Transactions 
{
	
	
	Person buyer;
	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmountBought() {
		return amountBought;
	}

	public void setAmountBought(int amountBought) {
		this.amountBought = amountBought;
	}

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
