package data;

import java.sql.*;

import models.Game;
import models.aPlayers;
import models.aProperty;

public class PropertyRepository implements iPropertyRepository {
	Connection connection;
	
	public PropertyRepository() {
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
	
	public void buildPropertyTable() {
		try {
			Statement statement = connection.createStatement();
			String insertsql = "CREATE TABLE \"Property\" (\"ID\" serial NOT NULL,"
					+ "\"Name\" character varying(50), \"PurchasePrice\" integer, "
					+ "\"RentalPrice\" integer, \"Owner_Player_ID\" integer, "
					+ "\"Game_ID\" integer)";
					/*+ CONSTRAINT \"Property_PK\" PRIMARY KEY (\"ID\") ";
					+ "CONSTRAINT \"Property_Game_ID_FK\" FOREIGN KEY (\"Game_ID\") "
					+ "REFERENCES \"Game\" (\"ID\") MATCH SIMPLE ON UPDATE NO ACTION ON DELETE "
					+ "NO ACTION, ";
					+ "CONSTRAINT \"Property_Owner_Player_ID_FK\" FOREIGN KEY (\"Owner_Player_ID\")"
					+ "REFERENCES \"Player\" (\"ID\") MATCH SIMPLE "
					+ "ON UPDATE NO ACTION ON DELETE NO ACTION) "
					+ "WITH ( OIDS=FALSE ); ALTER TABLE \"Property\" OWNER TO postgres;";*/
			
			statement.execute(insertsql);
		}
			catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	@Override
	public boolean create(aProperty property) {
		try {
			Statement statement = connection.createStatement();
			String createPropertyRow = String.format
					("INSERT INTO \"Property\" (\"Name\", \"RentalPrice\", \"PurchasePrice\")"
							+ "VALUES ('%s', '%s', '%s');", 
							property.getName(), property.getRentalPrice(), property.getPurchasePrice());
			statement.execute(createPropertyRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int getPropertyID(String propertyName) {
	
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT \"ID\" FROM \"Property\" WHERE \"Name\" = '%s';", propertyName);
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				int propertyID = results.getInt(1);
				return propertyID;
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public boolean update(aProperty property) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("UPDATE \"Property\" SET \"Owner_Player_ID\" = '%s' "
					+ "WHERE \"Name\" = '%s';", property.getOwnerID(), property.getName());
			statement.execute(query);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(aProperty property) {// will not implement
		return false;
	}

}
