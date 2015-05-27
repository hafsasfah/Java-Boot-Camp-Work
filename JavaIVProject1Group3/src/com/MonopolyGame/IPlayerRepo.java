package com.MonopolyGame;

public interface IPlayerRepo {
	boolean create(AbstractPlayer player);
	AbstractPlayer get( int playerId);
	boolean update(Abstract Player player);

}
