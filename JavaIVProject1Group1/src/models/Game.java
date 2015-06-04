package models;
import java.sql.Connection;
import java.sql.Statement;

import java.util.HashSet;
import java.util.Queue;


public class Game extends aGame {
	private int gameID;
	private String gameName;
	private Connection connection;

	private int id;
	private String name;
	private HashSet<aProperty> properties;
	//private Queue<aPlayer> players;
	//private aPlayer currentPlayer;
	
	public Game(int gameID, String gameName) {
		
		this.gameID = gameID;
		this.gameName = gameName;
	}

	
	public Game( int id, String name, HashSet<aProperty> properties, Queue<aPlayer> players )
	{
		this.id = id;
		this.name = name;
		this.properties = properties;
		this.players = players;
		currentPlayer = players.peek();
	}
	
	@Override
	public int getID() 
	{
		return id;
	}
	
	@Override
	public void setID( int id )
	{
		this.id = id;
	}

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public HashSet<aProperty> getProperties() 
	{
		return properties;
	}

	/*
	@Override
	public Queue<aPlayer> getPlayers() 
	{
		return players;
	}

	@Override
	public boolean hasWinner() 
	{
		int playersStillInGame = 0;
		
		for ( aPlayer player : players )
		{
			if ( !player.hasLostGame() )
			{
				playersStillInGame++;
			}
		}
		
		return playersStillInGame == 1;
	}
	

	@Override
	public aPlayer getCurrentPlayer() {
		return currentPlayer;
	}
*/
	@Override
	public void nextPlayersTurn( int roll ) {
		players.add( players.remove() );
		currentPlayer = players.peek();
		setChanged();
		notifyObservers();
	}	

}
