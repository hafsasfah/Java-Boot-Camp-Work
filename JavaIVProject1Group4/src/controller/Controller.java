package controller;

import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.GameboardView;
import view.PlayerView;
import view.PropertyView;
import game.GUI;
import model.*;


public class Controller extends Observable{
	private static Player[] players; 
	private static Property[] properties;
	
	private static int currentPlayer;
	private static Property currentProp; 
	private static Gameboard board;
	private static Controller control;
	
	
	public static void main (String args[])
	{
		
		
		control = new Controller();
	      PlayerView playerView = new PlayerView();
	      control.addObserver(playerView);
	      GameboardView gameboardView= new GameboardView();
	      control.addObserver(gameboardView);
	      PropertyView propView = new PropertyView();
	      control.addObserver(propView);
	      
	      
	  //     to = new TextObserver(ov);
	  //    TextObserver to = new TextObserver(ov);
	     // ov.addObserver(to);
		
		
	      
	
		
	
		GUI gui = new GUI(playerView, propView, gameboardView);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(1000,750);
		gui.setVisible(true);
		
		
	}
	
	public Controller()
	{	
		board = new Gameboard();
		players = board.getPlayers();
		properties = board.getProps();
		currentPlayer = 1;
		update();
		
	}
	
	private void update(){
		this.currentProp = properties[players[currentPlayer].getLocation()];
		 setChanged();
	     notifyObservers();
		
	}
	public static void playerRoll()
	{	//die.rollDie()
		int oldLocation = players[currentPlayer].getLocation();
		players[currentPlayer].move(Dice.rollDie());	
		control.update();
		// -1 is our un-owned sentiment value, these properties don't charge rent but instead allow you to purchase them.
		if (currentProp.getOwner()>=0)
		{
			control.payRent();
		}
		
		if (oldLocation > players[currentPlayer].getLocation())
		{
			players[currentPlayer].setCash(200);
		}
		
		 control.setChanged();
	     control.notifyObservers();
	     
	     
	     
	     
			
	}
	
	private void payRent()
	{
		int rentFee = currentProp.getPurchasePrice();
		players[currentPlayer].setCash(-rentFee);
		if(rentFee>players[currentPlayer].getCash()){
	    	 players[currentPlayer].playerWentBankrupt();
	     }
		
		players[ currentProp.getOwner()].setCash(rentFee);	
		control.setChanged();
	     control.notifyObservers();
		
	}
	
	public static void endTurn()
	{
		
		if (currentPlayer == board.getPlayers().length - 1)
		{
			currentPlayer = 1;
		}
		else
		{
			currentPlayer++;
		}
		//System.out.println(players[currentPlayer].getName());
		 control.setChanged();
	     control.notifyObservers();
	     if(!players[currentPlayer].playerIsntBankrupt()){
	    	 gameStatusCheck();
	    	 endTurn();
	    	 
	     }
	     
		
	}
	public static void gameStatusCheck(){
		int playersleft = 0;
		Player winner = players[0];
		for(int i=1;i<players.length;i++){
			if(players[i].playerIsntBankrupt()){
				continue;
			}
			else
				playersleft++;
			
		}
		
		if (playersleft <= 0){
			for(int i=1;i<players.length;i++){
				if(players[i].playerIsntBankrupt())
					winner = players[i];
			}
			JOptionPane.showMessageDialog(null, winner.getName() + "is the winner!");
		}
	}
	public static void buyProp()
	{
		
		int propertyPrice = currentProp.getPurchasePrice();
		players[currentPlayer].setCash(-propertyPrice);
		players[currentPlayer].addProp(currentProp);
		control.setChanged();
	     control.notifyObservers();
	     if(propertyPrice>players[currentPlayer].getCash()){
	    	 JOptionPane.showMessageDialog(null, "Player can't afford this property");
	     }
		
	}

	public static Property getCurrentProp() {
		return currentProp;
	}

	public static Player getCurrentPlayer() {
		// TODO Auto-generated method stub
		return players[currentPlayer];
	}
	public static Property[] getProperties(){
		return properties;
	}

	
	
	
}
