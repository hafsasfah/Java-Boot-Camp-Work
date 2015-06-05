package model;

import java.util.*;

public class Person 
{

	String name;
	//ArrayList<Stock> stocks;
	double purse;
	Map<Stock, Integer> stocks;
	
public Person(String name, double purse) 
	{
		this.name = name;
		this.stocks = new HashMap<Stock, Integer>();
		this.purse = purse;
	}
public Person(String name) 
{
	this.name = name;
	this.stocks = new HashMap<Stock, Integer>();
	this.purse = 0.0;
}

public Person(String name, Stock stock, int amountOwned) 
{
	this.stocks = new HashMap<Stock, Integer>();
	this.name = name;
	this.stocks.put(stock, amountOwned);
	this.purse = 0;
}

	public void addStock(Stock stock,int amountOwned)
	{
		this.stocks.put(stock,amountOwned);
	}
	
	public String getName() 
	{
		return name;
	}

	public Map<Stock, Integer> getStocks()
	{
		return stocks;
	}

	public double getPurse() 
	{
		return purse;
	}

	public void buyStock(Stock stock,int amount)
	{
		this.purse -= stock.getPrice();
		try
		{
			
			stocks.put(stock, stocks.get(stock) + amount);
			
		}
		catch(Exception e){
			stocks.put(stock,  amount);
		}
		
	}
	
	public void sellStock(Stock stock, int amount)
	{
		this.purse += stock.getPrice();
		try
		{
			
			stocks.put(stock, stocks.get(stock) + amount);
			if(stocks.get(stock) <= 0){
				stocks.remove(stock);
			}
			
		}
		catch(Exception e){
			stocks.put(stock,  amount);
		}
	}

	public String getTicker() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
