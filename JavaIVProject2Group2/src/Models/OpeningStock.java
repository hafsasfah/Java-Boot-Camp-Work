package Models;

public class OpeningStock {

<<<<<<< HEAD
}
=======
public class OpeningStock
	
	{
	private String ticker;
	private double price;
	private String date;
	public OpeningStock( String ticker, String date, double price )
	{

		this.setTicker(ticker);
		this.setDate(date);
		this.setPrice(price);
	}
	
	public double getPrice() 
	{
	return price;
	}

	public void setPrice(double price)
	{
	this.price = price;
	}

	public String getTicker() 
	{
	return ticker;
	}

	public void setTicker(String ticker) 
	{
	this.ticker = ticker;
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
>>>>>>> 0ef229b92091e6ab0a0b48ccf91f54ec2c98688f
