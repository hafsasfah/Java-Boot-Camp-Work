package data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.OpeningPrice;

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
	
}
