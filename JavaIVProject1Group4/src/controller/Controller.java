package controller;

import model.*;

public class Controller {
	
	private int currentPlayer;
	private Gameboard board;
	
	public static void main ()
	{
		
	}
	
	public Controller()
	{	
		board = new Gameboard();
		currentPlayer = 0;
	}
	
	public void playerRoll()
	{
		board.getPlayer(currentPlayer).move(board.getDie().rollDie());	
		
		if (!(board.getProperty(board.getPlayer(currentPlayer).getLocation()).getOwner() == -1) || !(board.getProperty(board.getPlayer(currentPlayer).getLocation()).getOwner() == currentPlayer))
		{
			payRent();
		}
			
	}
	
	private void payRent()
	{
		int rentFee = -(board.getProperty(board.getPlayer(currentPlayer).getLocation()).getPurchasePrice());
		board.getPlayer(currentPlayer).setCash(rentFee);
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
		
		int propertyPrice = board.getProperty(board.getPlayer(currentPlayer).getLocation()).getPurchasePrice();
		board.getPlayer(currentPlayer).setCash(-propertyPrice);
		
	}
	
	
}
