package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.*;

public class OwnedStockRepository {
	private Connection connection;

	public OwnedStockRepository( Connection connection )
	{
		this.connection = connection;
	}
	
	public boolean create( OwnedStock ownedStock )
	{
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"StocksOwned\" ( \"Player_Name\", \"Stock_Ticker\", \"NumberOwned\" ) values ( '%s', '%s', '%d' )", 
					ownedStock.getPlayerName(), ownedStock.getTicker(), ownedStock.getNumberOwned() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<OwnedStock> get()
	{
		List<OwnedStock> ownedStocks = new ArrayList<OwnedStock>();
		try {
			
			Statement statement = connection.createStatement();
			String query = String.format("select\"Player_Name\", \"Stock_Ticker\", \"NumberOwned\"  from \"StocksOwned\"" );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				ownedStocks.add( new OwnedStock( results.getString(1), results.getString(2), results.getInt(3) ) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ownedStocks;
	}
	
	public List<OwnedStock> getOwnedStocksForSinglePlayer( String name )
	{
		List<OwnedStock> ownedStocks = new ArrayList<OwnedStock>();
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select\"Player_Name\", \"Stock_Ticker\", \"NumberOwned\"  from \"StocksOwned\" where \"Player_Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				ownedStocks.add( new OwnedStock( results.getString(1), results.getString(2), results.getInt(3) ) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ownedStocks;
	}
	
	public boolean update( OwnedStock ownedStock )
	{
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("update \"StocksOwned\" set \"NumberOwned\" = %d where \"Player_Name\" = '%s' and \"Stock_Ticker\" = '%s'", 
					ownedStock.getNumberOwned(), ownedStock.getPlayerName(), ownedStock.getTicker() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
