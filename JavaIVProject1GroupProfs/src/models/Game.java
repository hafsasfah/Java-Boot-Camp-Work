package models;

import java.util.*;

public class Game extends AbstractGame {
	
	private int id;
	private String name;
	private HashSet<AbstractProperty> properties;
	private Queue<AbstractPlayer> players;
	private AbstractPlayer currentPlayer;
	
	public Game( String name )
	{
		this.name = name;
		properties = new HashSet<AbstractProperty>();
		players = new LinkedList<AbstractPlayer>();
	}
	
	public Game( int id, String name, HashSet<AbstractProperty> properties, Queue<AbstractPlayer> players, AbstractPlayer currentPlayer )
	{
		this.id = id;
		this.name = name;
		this.properties = properties;
		this.players = players;
		this.currentPlayer = currentPlayer;
	}

	@Override
	public int getID() {
		return id;
	}
	
	@Override
	public void setID( int id )
	{
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public HashSet<AbstractProperty> getProperties() {
		return properties;
	}

	@Override
	public Queue<AbstractPlayer> getPlayers() {
		return players;
	}

	@Override
	public boolean hasWinner() {
		int playersStillInGame = 0;
		
		for ( AbstractPlayer player : players )
		{
			if ( !player.hasLostGame() )
			{
				playersStillInGame++;
			}
		}
		
		return playersStillInGame == 1;
	}

	@Override
	public AbstractPlayer getCurrentPlayer() {
		return currentPlayer;
	}

	@Override
	public void setCurrentPlayer(AbstractPlayer player) {
		currentPlayer = player;
	}

	@Override
	public void nextPlayersTurn( int roll ) {
		players.add( players.remove() );
		currentPlayer = players.peek();
		setChanged();
		notifyObservers();
	}
}
