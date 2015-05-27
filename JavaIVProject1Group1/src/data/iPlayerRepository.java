package data;

import java.sql.*;
import java.util.List;

import models.aProperty;
import models.aPlayers;

public interface iPlayerRepository {
	boolean create(aPlayers player);
	aPlayers get(int playerID);
	List<aPlayers> playersParkedAtThisLocation(aProperty location);
	boolean update(aPlayers player);
	boolean delete(aPlayers player);
}	
