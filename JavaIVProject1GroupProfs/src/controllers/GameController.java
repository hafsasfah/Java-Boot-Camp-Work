package controllers;

import java.sql.Connection;
import java.util.*;

import javax.swing.JOptionPane;

import data.*;
import models.*;
import views.*;

public class GameController implements IGameController {
	
	private AbstractGame game;
	private IGameRepository gameRepository;
	private IPlayerRepository playerRepository;
	private IPropertyRepository propertyRepository;
	private Random random;
	
	private IGameView gameView;
	
	public GameController()
	{
		random = new Random();
		Connection connection = MonopolyConnectionProvider.createConnection();
		gameRepository = new GameRepository( connection );
		playerRepository = new PlayerRepository( connection );
		propertyRepository = new PropertyRepository( connection );
	}
	
	@Override
	public IGameView startNewGame( String[] playerNames ) {
		String gameName = JOptionPane.showInputDialog("Please enter a name for this saved game");
		game = new Game( gameName );
		gameRepository.create(game);
		game.setID( gameRepository.getGameID(gameName) );
		
		AbstractProperty start = null;
		
		ArrayList<AbstractProperty> properties = game.getProperties();
		for ( int count = 0; count < 36; count++ )
		{
			AbstractProperty newProperty = new Property(count, count, "Name: " + count, 200, 50, null, new LinkedList<AbstractPlayer>(), 0);
			if ( count == 0 )
			{
				start = newProperty;
			}
			properties.add( newProperty );
		}
		
		
		Queue<AbstractPlayer> players = game.getPlayers();
		for ( int count = 0; count < playerNames.length; count++ )
		{
			Player newPlayer = new Player( playerNames[count], 1500, game.getID(), start );
			playerRepository.create( newPlayer );
			newPlayer.setID( playerRepository.getPlayerID( newPlayer.getName(), newPlayer.getGameID() ) );
			players.add( newPlayer );
			start.addParkedPlayer( newPlayer );
		}		
		
		game.setCurrentPlayer( players.peek() );
		
		gameView = new GameView( game, this );
		
		return gameView;
	}

	@Override
	public IGameView loadGame(int gameID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveGame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void currentPlayerRolls() {
		AbstractPlayer currentPlayer = game.getCurrentPlayer();
		int roll = random.nextInt(6) + random.nextInt(6) + 2;
		int nextPropertySequenceID = ( currentPlayer.getCurrentLocation().getSequenceNumber() + roll ) % game.getProperties().size();
		currentPlayer.getCurrentLocation().removeParkedPlayer( currentPlayer );
		
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
			currentPlayer.spendMoney( rent );
			if ( !currentPlayer.hasLostGame() )
			{
				owner.addMoney( rent );
			}
		}
		
		if ( currentPlayer.hasLostGame() )
		{
			for ( AbstractProperty property : currentPlayer.getOwnedProperties() )
			{
				property.setOwner(null);
			}
			
			propertyLandedOn.removeParkedPlayer( currentPlayer );
		}
		
		game.nextPlayersTurn( );
	}

}
