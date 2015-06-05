package Stockrepo;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import PlayerModel.PlayerModel;
import StockModel.OwnedStock;
import StockModel.StockModel;

public class OwnedStockRepo
{

	private Connection connection;

	public OwnedStockRepo( Connection connection )
	{
		this.connection = connection;
	}
	
	public boolean create(StockModel ownedStock, PlayerModel player, Integer buyingNumber)
	{
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"StocksOwned\" ( \"Name\", \"ticker\", \"NumberOwned\" ) values ( '%s', '%s', '%d' )", 
					player.getThePlayerName(), ownedStock.getStockName(), buyingNumber);
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
		try 
		{
			
			Statement statement = connection.createStatement();
			String query = String.format("select\"Name\", \"ticker\", \"NumberOwned\"  from \"StocksOwned\"" );
			ResultSet results = statement.executeQuery(query);
			while (results.next())
			{
				ownedStocks.add(new OwnedStock( results.getString(1), results.getString(2), results.getInt(3)));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return ownedStocks;
	}
	
	public List<OwnedStock> getOwnedStocksForSinglePlayer(String name)
	{
		List<OwnedStock> ownedStocks = new ArrayList<OwnedStock>();
		try 
		{
			Statement statement = connection.createStatement();
			String query = String.format("select\"Name\", \"ticker\", \"NumberOwned\"  from \"StocksOwned\" where \"Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				ownedStocks.add( new OwnedStock( results.getString(1), results.getString(2), results.getInt(3) ) );
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return ownedStocks;
	}
	
	public List<OwnedStock> getOwnedStocksForTicker(String name)
	{
		List<OwnedStock> ownedStocks = new ArrayList<OwnedStock>();
		try 
		{
			Statement statement = connection.createStatement();
			String query = String.format("select\"Name\", \"ticker\", \"NumberOwned\"  from \"StocksOwned\" where \"ticker\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				ownedStocks.add( new OwnedStock( results.getString(1), results.getString(2), results.getInt(3) ) );
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return ownedStocks;
	}
	
	public boolean addStockToDatabase(OwnedStock stock) //create in CRUD
	{
		try
		{
			Statement statement = connection.createStatement();
			String createStock = String.format(" INSERT INTO \"StocksOwned\""
					+ "("
					+ "\"Name\","
					+ "\"ticker\","
					+ "\"NumberOwned\""
					+ ")"
					+ "VALUES"
					+ "("
					+ "'%s',"
					+ "'%s',"
					+ "'%d'"
					+ ");",
					stock.getPlayer(), stock.getTicker(), stock.getOwned());
			
			statement.execute(createStock);
			return true;
		}
		catch(SQLException E)
		{
			System.out.println("You griffithed up");
			E.printStackTrace();
			return false;
		}
		
		
	}
	
	public boolean update( OwnedStock ownedStock )
	{
		try 
		{
			Statement statement = connection.createStatement();
			String insertSQL = String.format("update \"StocksOwned\" set \"NumberOwned\" = %d where \"Name\" = '%s' and \"ticker\" = '%s'", 
					ownedStock.getOwned(), ownedStock.getPlayer(), ownedStock.getTicker() );
			statement.executeUpdate(insertSQL);
			
			return true;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
