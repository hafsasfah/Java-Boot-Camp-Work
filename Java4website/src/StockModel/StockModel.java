package StockModel;


public class StockModel 
{

	int currentPrice;
	String stockName;
	String companyName;
	int date;

	public StockModel()
	{
		this.stockName = "";
	}

	public StockModel(int price, String name, int date)
	{
		this.currentPrice = price;
		this.stockName = name;
		this.date = date;
	}
	
	public StockModel(String name, String company, int price, int date)
	{
		this.companyName= company;
		this.currentPrice = price;
		this.stockName = name;
		this.date = date;
	}
	
	public int getCurrentPrice() 
	{
		return currentPrice;
	}

	public void setCurrentPrice(int currentPrice) 
	{
		this.currentPrice = currentPrice;
	}

	public String getStockName()
	{
		return stockName;
	}
	
	public void setStockName(String stockName) 
	{
		this.stockName = stockName;
	}

	public int getDate()
	{
		return date;
	}

	public void setDate(int date)
	{
		this.date = date;
	}

	
}
