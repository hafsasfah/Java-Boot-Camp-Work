package Repository;

import java.sql.*;

import Models.StockModel;
public class StockRepository
	{
	Connection connection;
	public StockRepository() // build a connection in the constructor
	{
try
	{
	String url = "jdbc:postgresql://localhost/Stocks";
	String username = "postgres";
	String password = "gamemaster";
	connection = DriverManager.getConnection(url, username, password);
	}
catch(SQLException E)
	{
	E.printStackTrace();
	System.out.print("You messed up now.");
	}
}


void buildStockTable()
{

	try
{
	Statement statement = connection.createStatement();
	String buildstocktable = " CREATE TABLE \"Stocks\""
	+ " ("
	+ " \"Name\" character varying(100) NOT NULL PRIMARY KEY,"
	+ " \"CompanyName\" character varying(100),"
	+ " \"CurrentPrice\" integer,"
	+ " \"Date\" integer "
	+ " )";
	statement.execute(buildstocktable);
	}
	
	catch(SQLException E)
	{
	E.printStackTrace();
	}
}

boolean addStockManual(String name,String companyname) //create in CRUD
{
	try
	{
	Statement statement = connection.createStatement();
	String createStock = String.format(" INSERT INTO \"Stocks\""
	+ "("
	+ "\"Name\","
	+ "\"CompanyName\""
	+ ")"
	+ "VALUES"
	+ "("
	+ "'%s',"
	+ "'%s'"
	+ ");",
	name, companyname);
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

boolean addStockPrices(String name,double stockprice) //create in CRUD
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

int getStockPrice(StockModel stock)
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