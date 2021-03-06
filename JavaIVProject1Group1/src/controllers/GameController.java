package controllers;

import java.util.*;

import data.*;
import models.*;
import views.*;

public class GameController implements iGameController {
	
	private aGame game;
	private iGameRepository gameRepository;
	private iPlayerRepository playerRepository;
	private iPropertyRepository propertyRepository;
	private Random random;
	
	private iGameView gameView;
	
	public GameController()
	{
		random = new Random();
		gameRepository = new GameRepository();
		playerRepository = new PlayerRepository();
		propertyRepository = new PropertyRepository();
	}
	
	@Override
	public iGameView startNewGame( String[] playerNames ) 
	{
		Queue<AbstractPlayer> players = new LinkedList<AbstractPlayer>();
		for ( int count = 0; count < playerNames.length; count++ )
		{
			Players newPlayer = new Player(count, playerNames[count], 1500);
			players.add(newPlayer );
			playerRepository.create( newPlayer );
		}
		
		game = new Game(0, "unsavedGame", propertyRepository.getAll(), players );
		
		gameRepository.create(game);
		
		gameView = new GameView( game, this );
		game.addObserver( gameView );
		
		return gameView;
	}

	@Override
	public iGameView loadGame(int gameID) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveGame() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void nextPlayerRolls() 
	{
		game.nextPlayersTurn( random.nextInt(6) + random.nextInt(6) + 2 );
	}
}
