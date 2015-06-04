package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;





import models.StockPrices;
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
	public boolean create(StockPrices prices) {
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
	
	public List<StockPrices> get() {
		List<StockPrices> stockPrices = new ArrayList<StockPrices>();
		
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"StockPrices\"" );
			ResultSet results = statement.executeQuery(query);
			stockPrices.addAll( parseResults( results ) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stockPrices;
	}

	public List<StockPrices> getByTickerAndDate(String ticker, String date) {
		List<StockPrices> openingPrices = new ArrayList<StockPrices>();
		
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"StockPrices\" where \"Ticker\" = '%s' and \"Date\" = '%s'", ticker, date );
			ResultSet results = statement.executeQuery(query);
			openingPrices.addAll( parseResults( results ) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return openingPrices;
	}

	public List<StockPrices> getByTicker(String tickerName) {
		List<StockPrices> openingPrices = new ArrayList<StockPrices>();
	
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"StockPrices\" where \"Ticker\" = '%s'", tickerName );
			ResultSet results = statement.executeQuery(query);
			openingPrices.addAll(parseResults(results));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return openingPrices;
	}

	public List<StockPrices> getByDate(String date) {
		List<StockPrices> openingPrices = new ArrayList<StockPrices>();
		
		try {
			Statement statement = connection.createStatement();
			String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"StockPrices\" where \"Date\" = '%s'", date );
			ResultSet results = statement.executeQuery(query);
			openingPrices.addAll(parseResults(results));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return openingPrices;
	}
	
	private List<StockPrices> parseResults (ResultSet results) {
		List<StockPrices> openingPrices = new ArrayList<StockPrices>();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			while (results.next()) {
				openingPrices.add(new StockPrices(results.getString(1), formatter.format(results.getDate(2)), results.getDouble(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return openingPrices;
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

	@Override
	public boolean create(iStockPrices prices) {
		// TODO Auto-generated method stub
		return false;
	}
}
