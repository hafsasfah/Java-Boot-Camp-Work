package StockModel;


public class StockModel 
{

	double currentPrice;
	String stockName;
	String companyName;
	String date;

	public StockModel()
	{
		this.stockName = "";
	}

	public StockModel(double price, String name, String date)
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
	
	public StockModel(String name, String stockname)
	{
		this.companyName= name;
		this.stockName = stockname;

	}
	
	public double getCurrentPrice() 
	{
		return this.currentPrice;
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
