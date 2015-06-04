package Stockrepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import StockModel.StockModel;

public class StockRepo 
{

	Connection connection;
	
	public StockRepo() // build a connection in the constructor
	{
		
		try
		{
			String url = "jdbc:postgresql://localhost/Stocks";
			String username = "postgres";
			String password = "Citylost2";
			connection = DriverManager.getConnection(url, username, password);
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			System.out.print("You messed up building the repo.");
		}
			
	}
	
	public StockRepo(Connection connection)
	{
		this.connection = connection;
	}
	
	public void buildStockTable()
	{
		
		try
		{
			Statement statement = connection.createStatement();
			String buildstocktable = " CREATE TABLE \"StocksRepo\""
					+ " ("
					+ " \"ticker\" character varying(100) NOT NULL PRIMARY KEY ,"
					+ " \"CompanyName\" character varying(100)"
					+ " )";
			
			statement.execute(buildstocktable);
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		
	}
	
	public boolean addStockNamesToDatabase(String ticker,String companyname) //create in CRUD
	{
		try
		{
			Statement statement = connection.createStatement();
			String createStock = String.format(" INSERT INTO \"StocksRepo\""
					+ "("
					+ "\"ticker\","
					+ "\"CompanyName\""
					+ ")"
					+ "VALUES"
					+ "("
					+ "'%s',"
					+ "'%s'"
					+ ");",
					ticker, companyname);
			
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
	
	
	public List<StockModel> getallStocks()
	{
		
		
		List<StockModel> stocks = new ArrayList<StockModel>();
		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"ticker\" , \"CompanyName\" FROM \"StocksRepo\"");
			
			ResultSet results = statement.executeQuery(getStockSym);
			while(results.next())
			{
				stocks.add( new StockModel( results.getString(1), results.getString(2) ) );
			}
			
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		
		return stocks;
	}
	
	public StockModel get(String ticker)
	{
		
		StockModel tempStock = new StockModel("Error","Error");

		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"ticker\" , \"CompanyName\" FROM \"StocksRepo\" WHERE \"ticker\" = '%s';",ticker);
			
			ResultSet results = statement.executeQuery(getStockSym);
			while(results.next())
			{
				tempStock = ( new StockModel( results.getString(1), results.getString(2) ) );
			}
			
		return tempStock;	
		}
		
		catch(SQLException E)
		{
			E.printStackTrace();
			return null;
		}
		
		
	}
	
	boolean deleteStocks(String stock)
	{
		try
		{
			Statement statement = connection.createStatement();
			String deleteStock = String.format("DELETE FROM \"StocksRepo\" WHERE \"ticker\" = '%s';", stock);
			
			statement.execute(deleteStock);
			return true;
			
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			return false;
			
		}
		
	}
	
}
