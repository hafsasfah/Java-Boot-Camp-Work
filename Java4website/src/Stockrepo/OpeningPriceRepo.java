package Stockrepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
	
}
