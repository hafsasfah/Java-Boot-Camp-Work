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
		
		HashSet<AbstractProperty> properties = game.getProperties();
		for ( int count = 0; count < 36; count++ )
		{
			AbstractProperty newProperty = new Property(count, count, "Name: " + count, 100, 25, null, new LinkedList<AbstractPlayer>(), 0);
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
	public void nextPlayerRolls() {
		game.nextPlayersTurn( random.nextInt(6) + random.nextInt(6) + 2 );
	}

}
