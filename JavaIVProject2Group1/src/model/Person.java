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

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getPurse() 
	{
		return purse;
	}

	public void setPurse(double purse)
	{
		this.purse = purse;
	}
	
}
