package controllers;

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
		gameRepository = new GameRepository();
		playerRepository = new PlayerRepository();
		propertyRepository = new PropertyRepository();
	}
	
	@Override
	public IGameView startNewGame( String[] playerNames ) {
		Queue<AbstractPlayer> players = new LinkedList<AbstractPlayer>();
		for ( int count = 0; count < playerNames.length; count++ )
		{
			Player newPlayer = new Player(count, playerNames[count], 1500);
			players.add(newPlayer );
			playerRepository.create( newPlayer );
		}
		game = new Game(0, JOptionPane.showInputDialog("Please enter a name for this saved game"), propertyRepository.getAll(), players );
		
		gameRepository.create(game);
		
		gameView = new GameView( game, this );
		game.addObserver( gameView );
		
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
