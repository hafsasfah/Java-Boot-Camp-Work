package data;

import java.util.Queue;

import models.AbstractPlayer;

public interface IPlayerRepository {
	boolean create( AbstractPlayer player );
	AbstractPlayer get( int playerID );
	int getPlayerID( String name, int gameID );
	Queue<AbstractPlayer> getPlayersInGame( int gameID );
	boolean update( AbstractPlayer player );
}
