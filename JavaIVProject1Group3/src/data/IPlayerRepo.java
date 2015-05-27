package data;

import models.AbstractPlayer;

public interface IPlayerRepo {
	boolean create(AbstractPlayer player);
	AbstractPlayer get( int playerId);
	boolean update(AbstractPlayer player);

}
