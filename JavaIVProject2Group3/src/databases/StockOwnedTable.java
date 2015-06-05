package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import models.StockOwned;
import models.iStockOwned;

/*
 * PK (UserID, Ticker), Shares
 * 
 * UserID = int
 * Ticker = String
 * Shares = int
 */

public class StockOwnedTable implements iStockOwnedTable {
	Connection connection;

	public StockOwnedTable() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/StockGame";
			String username = "postgres";
			String password = "password";
			
			connection = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean create(iStockOwned stocksOwned) {
		try {
			Statement statement = connection.createStatement();
			//String createStocksOwnedRow = String.format
			//		("INSERT INTO \"StocksOwned\" (\"UserID\", \"Ticker\", \"Shares\")"
			//				+ "VALUES ('%s', '%s', '%s');", 
			//				stocksOwned.getUserID(), stocksOwned.getTicker(), stocksOwned.getShares());
			//statement.execute(createStocksOwnedRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(iStockOwned stocksOwned) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(iStockOwned stocksOwned) {
		return false;
	}

	public List<StockOwned> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
