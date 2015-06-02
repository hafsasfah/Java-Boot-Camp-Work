package Models;

import java.util.Scanner;
public class Player {

	private String userName;
	private int userID;
	private double cash;
 
	public Player(String userName, int userID)
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
	this.userID = userID;
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