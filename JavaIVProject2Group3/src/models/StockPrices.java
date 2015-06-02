package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class StockPrices {
	
	private String date;
	private double price;
	
	Stocks stocks = new Stocks();
	
	public StockPrices(String ticker, String date, double price)
	{
		ticker = stocks.getTicker();
		this.date = date;
		this.price = price;
	}
	
	public String getDate()
	{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date);
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
}
