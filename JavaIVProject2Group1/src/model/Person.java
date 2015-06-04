package model;

import java.util.*;

public class Person 
{

	String name;
	ArrayList<Stock> stocks;
	double purse;
	
	Scanner scan = new Scanner(System.in);
	
	public Person(String name, double purse) 
	{
		this.name = name;
		this.stocks = new ArrayList<Stock>();
		this.purse = purse;
	}
	public void addStock(Stock stock){
		this.stocks.add(stock);
	}
	
	public String getName() 
	{
		return name;
	}

	public ArrayList<Stock> getStocks(){
		return stocks;
	}

	public double getPurse() 
	{
		return purse;
	}

	public void buyStock(Stock stock)
	{
		this.purse -= stock.getPrice();
		this.addStock(stock);
	}
	public void sellStock(Stock stock)
	{
		this.purse += stock.getPrice();
		this.removeStock(stock);
	}
	private void removeStock(Stock stock) {
		this.stocks.remove(stock);
		
	}
	
}
