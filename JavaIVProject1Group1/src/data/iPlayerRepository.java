package data;

import models.aPlayers;

public interface iPlayerRepository {
	boolean create(aPlayers player);
	aPlayers get(int playerID);
	boolean update(aPlayers player);
	boolean delete(aPlayers player);
}	
