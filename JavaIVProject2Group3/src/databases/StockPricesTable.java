package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import models.iStockPrices;

/*
 * PK (Ticker, Date), Prices
 * 
 * Ticker = String
 * Date = String "6/1/15"
 * Price = double
 */

public class StockPricesTable implements iStockPricesTable {
	Connection connection;

	public StockPricesTable() {
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
	public boolean create(iStockPrices prices) {
		try {
			Statement statement = connection.createStatement();
			String createStockPriceRow = String.format
					("INSERT INTO \"StockPrices\" (\"Ticker\", \"Date\", \"Price\")"
							+ "VALUES ('%s', '%s', '%s');", 
							prices.getTicker(), prices.getDate(), prices.getPrice());
			statement.execute(createStockPriceRow);
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(iStockPrices prices) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(iStockPrices prices) {
		return false;
	}
	


}
