package data;

import java.sql.*;
import java.util.*;

import models.AbstractPlayer;

public class PlayerRepository implements IPlayerRepository {

	private Connection connection;

	public PlayerRepository(Connection connection)
	{
		this.connection = connection;
	}
	@Override
	public boolean create(AbstractPlayer player) {
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"Player\" ( \"Name\", \"Money\", \"Game_ID\" ) values ( '%s', %d, %d )", 
					player.getName(), player.getMoney(), player.getGameID() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public int getPlayerID(String name, int gameID) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"ID\" from \"Player\" where \"Name\" = '%s' and \"Game_ID\" = %d",
					name, gameID );
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
	public AbstractPlayer get(int playerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(AbstractPlayer player) {
		try {
			Statement statement = connection.createStatement();
			String update = String.format("update \"Player\" set \"Money\" = %d, ParkedProperty_ID = %d "
					+ "where \"ID\" = '%D' ", player.getMoney(), player.getCurrentLocation().getID(), player.getID() );
			statement.executeUpdate(update);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Queue<AbstractPlayer> getPlayersInGame(int gameID) {
		// TODO Auto-generated method stub
		return null;
	}
}
