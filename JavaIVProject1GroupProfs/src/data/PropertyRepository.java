package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import models.AbstractProperty;

public class PropertyRepository implements IPropertyRepository {

	private Connection connection;

	public PropertyRepository(Connection connection)
	{
		this.connection = connection;
	}
	
	@Override
	public boolean create(AbstractProperty property) {
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"Property\" ( \"Name\", \"PurchasePrice\", \"RentalPrice\", \"Game_ID\" ) "
					+ " values ( '%s', %d, %d, %d )", property.getName(), property.getPurchasePrice(), 
					property.getRentalPrice(), property.getGameID() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public int getPropertyID(String name, int gameID) {
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
	public AbstractProperty get(int propertyID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(AbstractProperty property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<AbstractProperty> getAllPropertiesInGame(int gameID) {
		// TODO Auto-generated method stub
		return null;
	}
}
