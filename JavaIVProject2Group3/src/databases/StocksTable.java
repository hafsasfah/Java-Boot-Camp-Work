package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Stocks;
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
	public List<Stocks> get() {
		List<Stocks> stocks = new ArrayList<Stocks>(); 
		
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT \"Ticker\", \"Name\" FROM \"Stock\"" );
			ResultSet results = statement.executeQuery(query);
			
			while (results.next()) {
				stocks.add(new Stocks(results.getString(1), results.getString(2)) );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stocks;
	}
	
	@Override
	public Stocks get(String ticker) {
		try {
			Statement statement = connection.createStatement();
			String query = String.format("SELECT \"Ticker\", \"Name\" FROM \"Stock\" "
					+ "WHERE \"Ticker\" = '%s'", ticker);
			ResultSet results = statement.executeQuery(query);
			
			if (results.next()) {
				return new Stocks(results.getString(1), results.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public boolean update(iStocks stocks) {
		return false;
	}

	@Override
	public boolean delete(iStocks stocks) {
		return false;
	}	
}
