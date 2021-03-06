package data;

import java.sql.*;

import models.Game;
import models.aGame;
import models.aPlayers;

public class GameRepository implements iGameRepository {	
	Connection connection;
	iPlayerRepository playerRepo;
	iPropertyRepository propertyRepo;
	
	public GameRepository() {
		
		try {
			String url = "jdbc:postgresql://localhost/Monopoly";
			String username = "postgres";
			String password = "password";
			
			playerRepo = new PlayerRepository();
			propertyRepo = new PropertyRepository();
			
			connection = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void buildGameTable() {
		try {
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE \"Game\" (\"ID\" serial NOT NULL,\"Name\" character varying(50), "
					+ "\"Completed\" boolean, \"CurrentPlayer\" integer, CONSTRAINT \"PK\" PRIMARY KEY (\"ID\")) "
					+ "WITH ( OIDS=FALSE ); ALTER TABLE \"Game\" OWNER TO postgres;";
			statement.execute(insertsql);
		}
			catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	@Override
	public boolean create(aGame game) {
		try {
			Statement statement = connection.createStatement();
			String createGameRow = String.format
					("INSERT INTO \"Game\" (\"Name\", \"Completed\") VALUES ('%s', false);", 
							game.getName());
			statement.execute(createGameRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int getGameID(String name) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT \"ID\" FROM \"Game\" WHERE \"Name\" = '%s';", name);
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				int gameID = results.getInt(1);
				String gameName = results.getString(2);
				aPlayers currentPlayer = playerRepo.get(results.getInt(3));
				
				Game savedGame = new Game(gameID, gameName);		
				
				return gameID;
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public boolean update(aGame game) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("UPDATE \"Game\" SET \"Completed\" = true WHERE \"Name\" = '%s';", game.getName());
			statement.execute(query);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(aGame game) { // will not implement
		return false;
	}

	@Override
	public aGame getGame(int gameID) { // cannot do until Game class is completed
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT \"Name\" FROM \"Game\" WHERE \"ID\" = %d", gameID );
			ResultSet results = statement.executeQuery(query);
			
			while ( results.next() )
			{
				String gameName = results.getString(1);
				
				//Game savedGame = new Game();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return null;
	}	
}