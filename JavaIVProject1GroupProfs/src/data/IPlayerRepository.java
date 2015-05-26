package data;

import models.AbstractPlayer;

public interface IPlayerRepository {
	boolean create( AbstractPlayer player );
	AbstractPlayer get( int playerID );
	boolean update( AbstractPlayer player );
	boolean delete( AbstractPlayer player );
}
