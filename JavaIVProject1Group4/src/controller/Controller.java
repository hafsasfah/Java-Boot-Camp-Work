package controller;

import model.*;

public class Controller {
	Player[] players;
	Property[] properties;
	
	private int currentPlayer;
	private Gameboard board;
	
	public static void main ()
	{
		
	}
	
	public Controller()
	{	
		board = new Gameboard();
		players = board.getPlayers();
		properties = board.getProps();
		currentPlayer = 0;
	}
	
	public void playerRoll()
	{
		players[currentPlayer].move(board.getDie().rollDie());	
		// -1 is our un-owned sentiment value, these properties don't charge rent but instead allow you to purchase them.
		if (!(properties[players[currentPlayer].getLocation()].getOwner() == -1) || !(properties[players[currentPlayer].getLocation()].getOwner() == currentPlayer))
		{
			payRent();
		}
			
	}
	
	private void payRent()
	{
		int rentFee = properties[players[currentPlayer].getLocation()].getPurchasePrice();
		players[currentPlayer].setCash(-rentFee);
		
		players[ properties[players[currentPlayer].getLocation()].getOwner()].setCash(rentFee);	
		
	}
	
	public void endTurn()
	{
		
		if (currentPlayer == board.getPlayers().length - 1)
		{
			currentPlayer = 0;
		}
		else
		{
			currentPlayer++;
		}
		
		
	}

	public void buyProp()
	{
		
		int propertyPrice = properties[players[currentPlayer].getLocation()].getPurchasePrice();
		players[currentPlayer].setCash(-propertyPrice);
		
	}
	
	
}
