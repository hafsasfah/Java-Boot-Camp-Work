package data;

import models.AbstractGame;

public interface IGameRepository {
	boolean create( AbstractGame game );
	AbstractGame get( int gameID );
	boolean update( AbstractGame game );
	boolean delete( AbstractGame game );
}
