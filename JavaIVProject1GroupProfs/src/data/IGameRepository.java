package data;

import models.AbstractGame;

public interface IGameRepository {
	boolean create( AbstractGame game );
	AbstractGame get( String name );
	int getGameID( String name );
	boolean update( AbstractGame game );
}
