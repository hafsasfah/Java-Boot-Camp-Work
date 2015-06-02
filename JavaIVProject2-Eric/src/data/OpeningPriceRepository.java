package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.OpeningPrice;
import models.Stock;

public class OpeningPriceRepository {

	private Connection connection;

	public OpeningPriceRepository(Connection connection) {
		this.connection = connection;
	}

	public boolean create(OpeningPrice openingPrice) 
	{
		try {
			Statement statement = connection.createStatement();
			String insertSQL = String.format("insert into \"OpeningPrice\" ( \"Ticker\", \"Date\", \"Price\" ) values ( '%s', '%s', %.2f )", 
					openingPrice.getTicker(), openingPrice.getDate(), openingPrice.getPrice() );
			statement.executeUpdate(insertSQL);
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public List<OpeningPrice> get()
	{
		List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
		
		try {
		
		Statement statement = connection.createStatement();
		String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"OpeningPrice\"" );
		ResultSet results = statement.executeQuery(query);
		openingPrices.addAll( parseResults( results ) );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return openingPrices;
	}
	
	public List<OpeningPrice> getByTicker( String tickerName )
	{
		List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
		
		try {
		
		Statement statement = connection.createStatement();
		String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"OpeningPrice\" where \"Ticker\" = '%s'", tickerName );
		ResultSet results = statement.executeQuery(query);
		openingPrices.addAll( parseResults( results ) );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return openingPrices;
	}
	
	public List<OpeningPrice> getByDate( String date )
	{
		List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
		
		try {
		
		Statement statement = connection.createStatement();
		String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"OpeningPrice\" where \"Date\" = '%s'", date );
		ResultSet results = statement.executeQuery(query);
		openingPrices.addAll( parseResults( results ) );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return openingPrices;
	}
	
	public List<OpeningPrice> getByTickerAndDate( String ticker, String date )
	{
		List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
		
		try {
		
		Statement statement = connection.createStatement();
		String query = String.format("select \"Ticker\", \"Date\", \"Price\" from \"OpeningPrice\" where \"Ticker\" = '%s' and \"Date\" = '%s'", ticker, date );
		ResultSet results = statement.executeQuery(query);
		openingPrices.addAll( parseResults( results ) );
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return openingPrices;
	}
	
	private List<OpeningPrice> parseResults( ResultSet results )
	{
		List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			while ( results.next() )
			{
				openingPrices.add( new OpeningPrice( results.getString(1), formatter.format(results.getDate(2)), results.getDouble(3) ) );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return openingPrices;
	}
	
}
