package data;

import java.sql.*;

import models.aGame;

public class GameRepository implements iGameRepository {
	private String url = "jdbc:postgresql://localhost/Monopoly";
	private String username = "postgres";
	private String password = "password";
	
	public GameRepository() {
	}
	
	@Override
	public boolean create(aGame game) {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE Game (\"Name\" character varying(50)) WITH (OIDS=FALSE); ALTER TABLE \"Game\" OWNER TO postgres;";
			statement.execute(insertsql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public aGame get(int gameID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(aGame game) {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String insertsql = "UPDATE TABLE Game";
			statement.execute(insertsql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(aGame game) {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String insertsql = "DELETE TABLE Game";
			statement.execute(insertsql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
