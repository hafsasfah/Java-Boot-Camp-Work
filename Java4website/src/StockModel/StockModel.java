package StockModel;


public class StockModel 
{

	int currentPrice;
	String stockName;
	String companyName;
	String date;

	public StockModel()
	{
		this.stockName = "";
	}

	public StockModel(int price, String name, String date)
	{
		this.currentPrice = price;
		this.stockName = name;
		this.date = date;
	}
	
	public StockModel(String name, String company, int price, String date)
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
	
	public String getCompanyName()
	{
		return companyName;
	}
	public void setStockName(String stockName) 
	{
		this.stockName = stockName;
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
