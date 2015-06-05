package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionHelper {
	Connection connection;

	public ConnectionHelper(){
		try {
		   	 Class.forName("org.postgresql.Driver");
			 String url = "jdbc:postgresql://localhost/stock market";
		     String user = "postgres";
		     String password = "password";
			 connection = DriverManager.getConnection(url, user, password);
		    
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getconnection(){
		return connection;}
	
}
