package home;


public class StockModel 
{

	int currentPrice;
	String stockName;
	int date;

	StockModel()
	{
		this.stockName = "";
	}

	StockModel(int price, String name, int date)
	{
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
