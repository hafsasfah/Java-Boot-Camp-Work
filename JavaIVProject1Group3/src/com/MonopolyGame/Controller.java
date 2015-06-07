package com.MonopolyGame;


	import java.sql.Connection;
import java.util.*;

	import javax.swing.JOptionPane;

	import data.*;
import models.*;
import views.*;

	public class Controller implements IController {
		
		
		private AbstractGame game;
		private IPropertyRepository gameRepository;
		private IPlayerRepo playerRepository;
		private IPropertyRepository propertyRepository;
		private Random random;
		

		public Controller( )
		{
			random = new Random();
		}
		
		public void currentPlayerRolls() {
			
			int die1 = random.nextInt(6) + 1;
			int die2 = random.nextInt(6) + 1;
			int roll = die1 + die2;
			
			
			
			AbstractPlayer currentPlayer = (AbstractPlayer) game.getCurrentPlayer();
			currentPlayer.getCurrentLocation();
			
			
				int nextPropertySequenceID = currentPlayer.getCurrentLocation()+ roll  ;
				
				AbstractProperty propertyLandedOn = game.getProperties().get( nextPropertySequenceID );
				
					propertyLandedOn.addParkedPlayer( currentPlayer );
					currentPlayer.setCurrentLocation( propertyLandedOn );
					
					AbstractPlayer owner = propertyLandedOn.getOwner();
					
					if ( owner == null )
					{
						currentPlayer.purchaseProperty( propertyLandedOn );
						propertyLandedOn.setOwner( currentPlayer );
					}
					else
					{
						int rent = propertyLandedOn.getRentalPrice();
						if ( propertyLandedOn.getPropertyGroup())
						{
							rent *= roll;
						}
						currentPlayer.spendMoney( rent );
						
					}
					
					
						
		}
				
					
			
			
		
		
		
	}

