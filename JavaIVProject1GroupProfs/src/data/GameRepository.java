package data;

import models.AbstractGame;
import models.Game;

import java.sql.*;

public class GameRepository implements IGameRepository {
	
	Connection connection;
	
	public GameRepository()
	{
		String url = "jdbc:postgresql://localhost/Monopoly";
		String username = "postgres";
		String password = "password";
		try {
			connection = DriverManager.getConnection( url, username, password );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean create(AbstractGame game) {
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"Game\" ( \"Name\" ) values ( '%s' )", game.getName() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public AbstractGame get(int gameID) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"Name\" from \"Game\" where \"ID\" = %d", gameID );
			ResultSet results = statement.executeQuery(query);
			
			while ( results.next() )
			{
				String gameName = results.getString(1);
				
				Game savedGame = new Game();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean update(AbstractGame game) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(AbstractGame game) {
		// TODO Auto-generated method stub
		return false;
	}

}
