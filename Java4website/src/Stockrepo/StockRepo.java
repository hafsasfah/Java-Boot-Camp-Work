package Stockrepo;

import java.sql.*;

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
			String password = "dragon";
			
			connection = DriverManager.getConnection(url, username, password);
			
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			System.out.print("You messed up now.");
		}
		
		
	}
	
	
	public void buildStockTable()
	{
		
		try
		{
			Statement statement = connection.createStatement();
			String buildstocktable = " CREATE TABLE \"Stocks\""
					+ " ("
					+ " \"Name\" character varying(100) ,"
					+ " \"CompanyName\" character varying(100),"
					+ " \"CurrentPrice\" double precision ,"
					+ " \"Date\" date "
					+ " )";
			
			statement.execute(buildstocktable);
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		
	}
	public boolean addStockNamesToDatabase(String name,String companyname, String date) //create in CRUD
	{
		try
		{
			Statement statement = connection.createStatement();
			String createStock = String.format(" INSERT INTO \"Stocks\""
					+ "("
					+ "\"Name\","
					+ "\"CompanyName\","
					+ "\"Date\""
					+ ")"
					+ "VALUES"
					+ "("
					+ "'%s',"
					+ "'%s',"
					+ "'%s'"
					+ ");",
					name, companyname, date);
			
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
	
	
	public boolean addStockPricesToDatabase(String name,double stockprice) //create in CRUD
	{
		try
		{
			Statement statement = connection.createStatement();
			String createStock = String.format(" UPDATE \"Stocks\""
					+ " SET \"CurrentPrice\" = '%f'"
					+ " WHERE \"Name\" = '%s';",
					stockprice, name);
			
			statement.execute(createStock);
			return true;
		}
		catch(SQLException E)
		{
			System.out.println("You messed up");
			E.printStackTrace();
			return false;
		}
		
		
	}
	
	public String getCompanyName(String companyName)
	{
		String sqlErrorTemp = "Sql problem";
		try
		{
			Statement statement = connection.createStatement();
			
			String getStockSym = String.format("SELECT \"Name\", \"CompanyName\" FROM \"StocksSeceond\" WHERE \"Name\" = '%s';", companyName);
			
			ResultSet results = statement.executeQuery(companyName);
			while(results.next())
			{
				String stockName = results.getString(1);
				
				return stockName;
			}
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		return sqlErrorTemp;	
	}
	public String getStockSymbol(String Name)
	{
		String sqlErrorTemp = "Sql problem";
		try
		{
			Statement statement = connection.createStatement();
			
			String getStockSym = String.format("SELECT \"CompanyName\" FROM \"StocksSeceond\" WHERE \"Name\" = '%s';", Name);
			
			ResultSet results = statement.executeQuery(Name);
			while(results.next())
			{
				String stockName = results.getString(1);
				
				return stockName;
			}
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		return sqlErrorTemp;		
	}
	
	public String getStockName(String Name)
	{
		String sqlErrorTemp = "Sql problem";
		try
		{
			Statement statement = connection.createStatement();
			
			String getStockName = String.format("SELECT \"Name\" FROM \"StocksSeceond\" WHERE \"Name\" = '%s';", Name);
			
			ResultSet results = statement.executeQuery(Name);
			while(results.next())
			{
				String stockName = results.getString(1);
				
				return stockName;
			}
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		return sqlErrorTemp;
		
		
	}
	public int getStockPrice(StockModel stock)
	{
		try
		{
			Statement statement = connection.createStatement();
			String getstockprice = String.format("SELECT \"CurrentPrice\" FROM \"Stocks\" WHERE \"Name\" = '%s';", stock.getStockName());
			
			ResultSet results = statement.executeQuery(getstockprice);
			
			while(results.next())
			{
				int stockprice = results.getInt(1);
				return stockprice;
			}
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		return 0;

	}
	
	public boolean updateStockPrice(StockModel stock)
	{
		try
		{
			Statement statement = connection.createStatement();
			String updateStock = String.format("UPDATE \"CurrentPrice\" FROM \"Stocks\" WHERE \"Name\" = '%s';", stock.getStockName());
			
			statement.execute(updateStock);
			return true;
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			return false;	
		}
		
		
	}
	
	boolean deleteStocks(StockModel stock)
	{
		try
		{
			Statement statement = connection.createStatement();
			String deleteStock = String.format("DELETE FROM \"Stocks\" WHERE \"Name\" = '%s';", stock.getStockName());
			
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
