package Stockrepo;

import java.sql.Connection;
import java.sql.DriverManager;

public class StockConnectionProvider
{
	public static Connection createConnection()
	{
		try 
		{
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/Stocks";
			String username = "postgres";
			String password = "Citylost2";
			return DriverManager.getConnection( url, username, password );
		} 
		catch (Exception E) 
		{
			E.printStackTrace();
		}
		return null;
	}
}
