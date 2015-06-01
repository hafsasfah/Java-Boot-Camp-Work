package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
	public boolean create(iUser user) {
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
	public boolean update(iUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(iUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
