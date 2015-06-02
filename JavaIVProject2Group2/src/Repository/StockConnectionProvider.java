package Repository;

import java.sql.*;
	
public class StockConnectionProvider {
	
	
	public static Connection createConnection()
		{
		try {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost/Stocks";
		String username = "postgres";
		String password = "gamemaster";
		
		return DriverManager.getConnection( url, username, password );
		
		} 
		
		catch (Exception e) 
		
		{
	
			e.printStackTrace();
		}
	return null;
	}
	
}
	

