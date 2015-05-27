package data;

import java.sql.*;
import java.util.List;
import models.aPlayers;
import models.aProperty;

public class PlayerRepository implements iPlayerRepository {

	@Override
	public boolean create(aPlayers player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public aPlayers get(int playerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<aPlayers> playersParkedAtThisLocation(aProperty location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(aPlayers player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(aPlayers player) {
		// TODO Auto-generated method stub
		return false;
	}

}
