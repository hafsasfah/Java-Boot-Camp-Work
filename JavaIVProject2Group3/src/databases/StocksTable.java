package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import models.iStocks;

/*
 * PK (Ticker), StockName
 * 
 * Ticker = String
 * StockName = String
 */

public class StocksTable implements iStocksTable {
	Connection connection;
	
	public StocksTable() {
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
	public boolean create(iStocks stocks) {
		try {
			Statement statement = connection.createStatement();
			String createStockRow = String.format
					("INSERT INTO \"Stocks\" (\"Ticker\", \"StockName\")"
							+ "VALUES ('%s', '%s');", 
							stocks.getTicker(), stocks.getStockName());
			statement.execute(createStockRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(iStocks stocks) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(iStocks stocks) {
		return false;
	}

	
}
