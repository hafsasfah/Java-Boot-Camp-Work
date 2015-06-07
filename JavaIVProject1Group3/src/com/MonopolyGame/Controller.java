package com.MonopolyGame;
 
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import models.Dice;
import views.ViewProperty;


public class Controller 
{
	private Dice dice;
	private com.MonopolyGame.Player[] Player;
	private Property Property;
	private int i = 0;
	
	
		
		LinkedList<Player> object = new LinkedList<Player>();
		ArrayList<PropertyFactory> property = new ArrayList<PropertyFactory>();	
		
		
		public Controller(LinkedList<Player> playerObject, ArrayList<PropertyFactory> propertyObject, 
				Dice dice, Player[] Player, int totalPlayers)
		{
			this.object = playerObject;
			this.property = propertyObject;	
			this.dice = dice;
			this.Player = Player;
		}
	
		public Controller() 
		{
			
			
			Player = new Player[2];
			for(int i = 0; i < Player.length; i++)
			{
				
				Player[i] = new Player(i, "Player " + (i +1), i, i, i);
				
			}
		}

		public int getPlayerPurchaseAction()
		{
			
			if(Dice.getRoll() == Property.getNameOfProperty())
			{
				if(Player[i].getLocation() == Property.getNameOfProperty())
				{
					JOptionPane.showMessageDialog(null,"Player: " + Player[i] + " is located at: " + Property.getNameOfProperty());
				}if(Property.getCostOfProperty() < Player[i].getplayerCash())
				{
					Player[i].setPlayerCash;(Player[i].getplayerCash()) - Property.getCostOfProperty());
					JOptionPane.showMessageDialog(null, Player[i] + " has bought something!" 
					+" Your remaining money: " + Player[i].getplayerCash());
				
				}if(Property.getCostOfProperty() > Player[i].getplayerCash())
				{
					JOptionPane.showMessageDialog(null, "You do not have enough money for buy that!");
				}
				
			}else if(Player[i].getplayerCash() < 0)
			{
				JOptionPane.showMessageDialog(null, "Sorry you are out of money!");
			}
			return Player[i].getplayerCash();
		
		}
}
		
		
		
		
		
		
	
		






		
	
	
	
	
	
	
	
	

