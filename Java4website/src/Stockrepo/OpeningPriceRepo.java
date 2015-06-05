package Stockrepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import StockModel.StockModel;

public class OpeningPriceRepo 
{
	Connection connection;
	
	public OpeningPriceRepo() // build a connection in the constructor
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
	
	
	
	public OpeningPriceRepo(Connection connection)
	{
		this.connection = connection;
	}
	
	public void buildStockTable()
	{
		
		try
		{
			Statement statement = connection.createStatement();
			String buildstocktable = " CREATE TABLE \"OpeningPriceRepo\""
					+ " ("
					+ " \"ticker\" character varying(100) NOT NULL PRIMARY KEY ,"
					+ " \"Price\" double precision ,"
					+ " \"Date\" date"
					+ " )";
			
			statement.execute(buildstocktable);
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		
	}
	
	
	public boolean addStockPricesToDatabase(String name,double stockprice, String date) //create in CRUD
	{
		try
		{
			Statement statement = connection.createStatement();
			String createStock = String.format(" INSERT INTO \"OpeningPriceRepo\""
					+ "("
					+ "\"ticker\","
					+ "\"Price\","
					+ "\"Date\""
					+ ")"
					+ "VALUES"
					+ "("
					+ "'%s',"
					+ "'%.2f',"
					+ "'%s'"
					+ ");",
					name, stockprice, date);
			
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
	
	public List<StockModel> get()
	{
		
		List<StockModel> stocks = new ArrayList<StockModel>();
		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"Price\" , \"ticker\" , \"Date\" FROM \"OpeningPriceRepo\"");
			
			ResultSet results = statement.executeQuery(getStockSym);
			while(results.next())
			{
				stocks.add(new StockModel(Double.parseDouble(results.getString(1)),results.getString(2), results.getString(3)));
			}
			
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
		}
		
		return stocks;
	}
	
	public List<StockModel> getByTicker(String ticker)
	{
		
		List<StockModel> stocks = new ArrayList<StockModel>();

		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"Price\" , \"ticker\" , \"Date\" FROM \"OpeningPriceRepo\" WHERE \"ticker\" = '%s';",ticker);
			
			ResultSet results = statement.executeQuery(getStockSym);  
			while(results.next())
			{
				stocks.add(new StockModel(Double.parseDouble(results.getString(1)),results.getString(2), results.getString(3)));
			}
			
		return stocks;	
		}
		
		catch(SQLException E)
		{
			E.printStackTrace();
			return null;
		}
		
		
	}

	public List<StockModel> getByDate(String date)
	{
		
		List<StockModel> stocks = new ArrayList<StockModel>();

		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"Price\" , \"ticker\" , \"Date\" FROM \"OpeningPriceRepo\" WHERE \"Date\" = '%s';",date);
			
			ResultSet results = statement.executeQuery(getStockSym);  
			while(results.next())
			{
				stocks.add(new StockModel(Double.parseDouble(results.getString(1)),results.getString(2), results.getString(3)));
			}
			
		return stocks;	
		}
		
		catch(SQLException E)
		{
			E.printStackTrace();
			return null;
		}
		
		
	}
	
	public double getTickerPrice(String ticker)
	{

		double tempprice = 0;
		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"Price\" FROM \"OpeningPriceRepo\" WHERE \"ticker\" = '%s';",ticker);
			
			ResultSet results = statement.executeQuery(getStockSym);  
			while(results.next())
			{
				tempprice = Double.parseDouble(results.toString());
				
			}
			
			return tempprice;
		}
		
		catch(SQLException E)
		{
			E.printStackTrace();
			return 0;
		}
		
		
	}
	
	
	public List<StockModel> getByTickerAndDate(String ticker,String date)
	{
		
		List<StockModel> stocks = new ArrayList<StockModel>();

		try
		{
			Statement statement = connection.createStatement();
			String getStockSym = String.format("SELECT \"Price\" , \"ticker\" , \"Date\" FROM \"OpeningPriceRepo\" WHERE \"ticker\" = '%s' AND \"Date\" = '%s';",ticker,date);
			
			ResultSet results = statement.executeQuery(getStockSym);  

			stocks.addAll(parseResults(results));
			
		}
		
		catch(SQLException E)
		{
			E.printStackTrace();
			return null;
		}
		
		return stocks;	
	}


	private List<StockModel> parseResults( ResultSet results )
	{
		List<StockModel> stocks = new ArrayList<StockModel>();
		try
		{
			while ( results.next() )
			{
				stocks.add(new StockModel(Double.parseDouble(results.getString(1)),results.getString(2), results.getString(3)));
			}
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		return stocks;
	}
	
	
	
	
}
