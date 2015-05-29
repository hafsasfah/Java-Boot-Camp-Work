package data;

import models.AbstractGame;
import models.AbstractPlayer;
import models.Game;

import java.sql.*;

public class GameRepository implements IGameRepository {
	
	Connection connection;
	IPlayerRepository playerRepository;
	IPropertyRepository propertyRepository;
	
	public GameRepository(Connection connection)
	{
		this.connection = connection;
		playerRepository = new PlayerRepository(connection);
		propertyRepository = new PropertyRepository(connection);
	}
	
	@Override
	public boolean create(AbstractGame game) {
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"Game\" ( \"Name\", \"Completed\" ) values ( '%s', false )", game.getName() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public int getGameID(String name) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"ID\" from \"Game\" where \"Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				return results.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public AbstractGame get(String name) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"ID\", \"Name\", \"CurrentPlayer\" from \"Game\" where \"Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				int gameID = results.getInt(1);
				String gameName = results.getString(2);
				AbstractPlayer currentPlayer = playerRepository.get( results.getInt(3) );
				
				Game savedGame = new Game( gameID, gameName, propertyRepository.getAll(), playerRepository.getPlayersInGame(gameID), currentPlayer );
				return savedGame;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean update(AbstractGame game) {
		// TODO Auto-generated method stub
		return false;
	}
}
