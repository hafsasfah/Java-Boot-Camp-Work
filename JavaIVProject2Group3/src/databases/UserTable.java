package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.User;
import models.iUser;

/*
 * PK (UserID), UserName, Cash
 * 
 * UserID = int
 * UserName = String
 * Cash = double
 */

public class UserTable implements iUserTable {
	Connection connection;
	
	public UserTable() {
		try {
			String url = "jdbc:postgresql://localhost/StockGame";
			String username = "postgres";
			String password = "password";
			
			connection = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean create(User user) {
		try {
			Statement statement = connection.createStatement();
			String createUserRow = String.format
					("INSERT INTO \"User\" (\"UserID\", \"UserName\", \"Cash\")"
							+ "VALUES ('%s', '%s', '%s');", 
							user.getUserID(), user.getUserName(), user.getCash());
			statement.execute(createUserRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<User> get() {
		
		List<User> users = new ArrayList<User>();
		try {
			
			Statement statement = connection.createStatement();
			String query = String.format("select \"Name\", \"Money\" from \"User\"" );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				users.add( new User( results.getString(1), results.getInt(2) ) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
	
	@Override
	public User getSingleUser(String name) {
		try 
		{
			Statement statement = connection.createStatement();
			String query = String.format("select \"Name\", \"Money\" from \"User\" where \"Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(query);
			while ( results.next() )
			{
				return new User( results.getString(1), results.getInt(2) );
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean update(iUser user) {
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format(" update \"Player\" set \"Money\" = %.2f where \"Name\" = '%s';", user.getCash(), user.getUserName() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean delete(iUser user) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
