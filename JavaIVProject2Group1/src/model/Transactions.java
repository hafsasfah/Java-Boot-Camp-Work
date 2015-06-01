package model;

public class Transactions 
{

	int purse;
	int stockPrice;
	String date;
	
	public double buyStock()
	{
		int purse; //call purse from Person Class
		int stockPrice; //Obtain stockPrice from Stock class
		return (purse - stockPrice);
		
	}
	
	public double sellStock()
	{
		int purse; //call purse from Person Class
		int stockPrice; //Obtain stockPrice from Stock class
		return (purse + stockPrice);
		
	}
}
