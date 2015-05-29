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
	
	public void buildPlayerTable() {
		try {
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE \"Players\" (\"ID\" serial NOT NULL, "
					+ "\"Name\" character varying(50), \"Money\" integer, \"Game_ID\" integer, "
					+ "\"ParkedProperty_ID\" integer,"
					+ "CONSTRAINT \"Player_PK\" PRIMARY KEY (\"ID\"),"
					+ "CONSTRAINT \"Player_Game_ID_FK\" FOREIGN KEY (\"Game_ID\") "
					+ "REFERENCES \"Game\" (\"ID\") MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION)"
					+ "WITH ( OIDS=FALSE ); ALTER TABLE \"Player\" OWNER TO postgres;"
					+ "ALTER TABLE \"Game\" ADD CONSTRAINT \"Game_CurrentPlayer_FK\" FOREIGN KEY "
					+ "(\"CurrentPlayer\") REFERENCES \"Player\" (\"ID\") "
					+ "MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION;";
		
			statement.execute(insertsql);
		}
			catch (Exception e) {
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
