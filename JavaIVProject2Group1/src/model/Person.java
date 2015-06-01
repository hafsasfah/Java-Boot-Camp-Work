package model;

import java.util.*;

public class Person 
{

	String name;
	String stock;
	double purse;
	
	Scanner scan = new Scanner(System.in);
	
	public Person(String name, String stock, double purse) 
	{
		this.name = name;
		this.stock = stock;
		this.purse = purse;
	}
	
	public void name()
	{
	 	System.out.print("Enter you name: ");
	 	name = scan.nextLine();
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
