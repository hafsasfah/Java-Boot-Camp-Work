package data;

import java.sql.*;
import java.util.List;

import models.aPlayers;
import models.aProperty;

public class PlayerRepository implements iPlayerRepository {
	
	private Connection connection;
	
	public PlayerRepository() {
		
		try {
			String url = "jdbc:postgresql://localhost/Monopoly";
			String username = "postgres";
			String password = "password";
			
			connection = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean create(aPlayers player) {
		try {
			Statement statement = connection.createStatement();
			String createPlayerRow = String.format
					("INSERT INTO \"Player\" (\"Name\", \"Cash\")"
							+ "VALUES ('%s', '%s');", 
							player.getName(), player.getCash());
			statement.execute(createPlayerRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
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
	public boolean delete(aPlayers player) { // will not implement
		return false;
	}

}
