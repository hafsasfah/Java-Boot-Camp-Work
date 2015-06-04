package model;

public class Transactions 
{
	
	
	Person buyer;
	public Person getBuyer() {
		return buyer;}

	public void setStock(Stock stock) 
		{
			this.stock = stock;
		}

	public double getStockPrice() {
		return stockPrice;}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;}

	public String getDate() {
		return date;}

	public int getAmountBought() {
		return amountBought;
	}


	Stock stock;
		public void setBuyer(Person buyer) 
		{
			this.buyer = buyer;
		}

	double stockPrice;
	public Stock getStock() 
		{
			return stock;
		}
	
	String date;
		public void setDate(String date)
		{
			this.date = date;
		}

	int amountBought;
		public void setAmountBought(int amountBought) 
	
		{
			this.amountBought = amountBought;
		}
	
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
