package controller;

import model.*;

public class Controller {
	public Player[] players;
	public Property[] properties;
	
	private int currentPlayer;
	Property currentProp; 
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
		updateProperty();
	}
	
	private void updateProperty(){
		this.currentProp = properties[players[currentPlayer].getLocation()];
		
	}
	public void playerRoll()
	{
		players[currentPlayer].move(board.getDie().rollDie());	
		updateProperty();
		// -1 is our un-owned sentiment value, these properties don't charge rent but instead allow you to purchase them.
		if (!(currentProp.getOwner() == -1) || !(currentProp.getOwner() == currentPlayer))
		{
			payRent();
		}
		
			
	}
	
	private void payRent()
	{
		int rentFee = currentProp.getPurchasePrice();
		players[currentPlayer].setCash(-rentFee);
		
		players[ currentProp.getOwner()].setCash(rentFee);	
		
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
		
		int propertyPrice = currentProp.getPurchasePrice();
		players[currentPlayer].setCash(-propertyPrice);
		
	}
	
	
}
