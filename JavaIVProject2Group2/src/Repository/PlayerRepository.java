package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import models.Stock;

public class PlayerRepository {
	
	private Connection connection;

	public PlayerRepository( Connection connection )
	{
		this.connection = connection;
	}
	
	public boolean create( Player player )
	{
		
	}
	
	public List<Player> get()
	{
		List<Player> stocks = new ArrayList<Player>();
		try {
			
			Statement statement = connection.createStatement();
			String query = String.format("select \"Player\"" );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stocks;
	}
	
	public Player get( String player )
	{
		try {
			
			Statement statement = connection.createStatement();
			String query = String.format( player );
			ResultSet results = statement.executeQuery(query);
			if ( results.next() )
			{
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}