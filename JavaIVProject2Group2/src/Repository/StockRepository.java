package Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Models.Stock;
public class StockRepository {

private Connection connection;
	
public StockRepository( Connection connection )
	
	{
	this.connection = connection;
	}

	public boolean create( Stock stock )
	{
	try {
	Statement statement = connection.createStatement();
	String insertSQL = String.format("insert into \"Stock\" ( \"Ticker\", \"Price\" ) values ( '%s', '%s' )", stock.getTicker(), stock.getName().replace("'","''") );
	statement.executeUpdate(insertSQL);
	return true;
	} 
	
	catch (SQLException e) 
	{
	e.printStackTrace();
	}

	return false;
}

	public List<Stock> get()
	{
	List<Stock> stocks = new ArrayList<Stock>();
	
	try 
	{
	Statement statement = connection.createStatement();
	String query = String.format("select \"Ticker\", \"Name\" from \"Stock\"" );
	ResultSet results = statement.executeQuery(query);
	
	while ( results.next() )
	{
	stocks.add( new Stock( results.getString(1), results.getString(2) ) );
	}
} 
	catch (SQLException e) 
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	return stocks;
	}
	public Stock get( String ticker )
	{

		try
		{
	Statement statement = connection.createStatement();
	String query = String.format("select \"Ticker\", \"Name\" from \"Stock\" where \"Ticker\" = '%s'", ticker );
	ResultSet results = statement.executeQuery(query);

	if ( results.next() )

	{

		return new Stock( results.getString(1), results.getString(2) );
	}
} 
		catch (SQLException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		return null;
}
}