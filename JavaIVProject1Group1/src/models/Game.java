package models;
import java.sql.Connection;
import java.sql.Statement;

public class Game extends aGame {

	private int gameID;
	private String gameName;
	private Connection connection;

	public Game(int gameID, String gameName) {
		
		this.gameID = gameID;
		this.gameName = gameName;
		
		try {
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE \"Game\" (\"ID\" serial NOT NULL,\"Name\" character varying(50), \"Completed\" boolean, \"CurrentPlayer\" integer, CONSTRAINT \"PK\" PRIMARY KEY (\"ID\")) WITH ( OIDS=FALSE ); ALTER TABLE \"Game\" OWNER TO postgres;";
			statement.execute(insertsql);
		}
			catch (Exception e) {
				e.printStackTrace();
		}
	}
}
