package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * PK (UserID, Ticker), Shares
 * 
 * UserID = int
 * Ticker = String
 * Shares = int
 */

public class StocksOwnedTable implements iStocksOwnedTable {
	Connection connection;

	public StocksOwnedTable() {
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
	public boolean create(iStocksOwned stocksOwned) {
		try {
			Statement statement = connection.createStatement();
			String createStocksOwnedRow = String.format
					("INSERT INTO \"StocksOwned\" (\"UserID\", \"Ticker\", \"Shares\")"
							+ "VALUES ('%s', '%s', '%s');", 
							stocksOwned.getUserID(), stocksOwned.getTicker(), stocksOwned.getShares());
			statement.execute(createStocksOwnedRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(iStocksOwned stocksOwned) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(iStocksOwned stocksOwned) {
		return false;
	}
	
	
}
