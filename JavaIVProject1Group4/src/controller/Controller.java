package controller;

import java.util.Observable;

import javax.swing.JFrame;

import game.GUI;
import model.*;

public class Controller extends Observable{
	private static Player[] players; 
	private static Property[] properties;
	
	private static int currentPlayer;
	private static Property currentProp; 
	private static Gameboard board;
	
	public static void main (String args[])
	{
		new Controller();
		GUI gui = new GUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(800,600);
		gui.setVisible(true);
		
		
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
		 setChanged();
	     notifyObservers();
		
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
	
	public static void endTurn()
	{
		
		if (currentPlayer == board.getPlayers().length - 1)
		{
			currentPlayer = 0;
		}
		else
		{
			currentPlayer++;
		}
		System.out.println(players[currentPlayer].getName());
		
	}

	public void buyProp()
	{
		
		int propertyPrice = currentProp.getPurchasePrice();
		players[currentPlayer].setCash(-propertyPrice);
		
	}

	public static Property getCurrentProp() {
		return currentProp;
	}

	public static Player getCurrentPlayer() {
		// TODO Auto-generated method stub
		return players[currentPlayer];
	}
	
	
}
