package data;

import java.sql.*;

public class MonopolyConnectionProvider {
	public static Connection createConnection()
	{
		String url = "jdbc:postgresql://localhost/Monopoly";
		String username = "postgres";
		String password = "password";
		
		try {
			return DriverManager.getConnection( url, username, password );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
