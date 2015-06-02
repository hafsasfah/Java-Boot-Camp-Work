package models;

import java.util.Scanner;

public class User {

	private String userName;
	private int userID;
	private double cash;
	
	public User(String userName, int userID)
	{
		this.userName = userName;
		this.userID = userID;
		cash = 50000;
	} 
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		Scanner input = new Scanner(System.in);
		userName = input.nextLine();
		input.close();
	}
	
	public int getUserId()
	{
		return userID;
	}
	
	public void setUserId(int userId)
	{
		userID = ;
	}
	
	public double getCash()
	{
		return cash;
	}
	
	public void setCash(double profit)
	{
		cash += profit;
	}
}
