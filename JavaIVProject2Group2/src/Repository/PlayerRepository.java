package Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Models.*;

public class PlayerRepository
{

	private Connection connection;

	public PlayerRepository( Connection connection )
	{
	this.connection = connection;
	}

	public boolean create( Player player )
	{
		try {
		Statement statement = connection.createStatement();
		String insertSQL = String.format("insert into \"Player\" ( \"Name\", \"Money\" ) values ( '%s', '%.2f' )", player.getUserName(), player.getCash() );
		statement.executeUpdate(insertSQL);
		return true;
		} 
		catch (SQLException e) {
		e.printStackTrace();
		}

		return false;
}

	public List<Player> get()
	{
	List<Player> players = new ArrayList<Player>();

	try {
	Statement statement = connection.createStatement();
	String query = String.format("select \"Name\", \"Money\" from \"Player\"" );
	ResultSet results = statement.executeQuery(query);
	while ( results.next() )
	{

		players.add( new Player(query, 0  ) );
}

	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

	}
return players;
}
	
	public Player getSinglePlayer( String name )
	
	{
	
		try {
		Statement statement = connection.createStatement();
		String query = String.format("select \"Name\", \"Money\" from \"Player\" where \"Name\" = '%s'", name );
		ResultSet results = statement.executeQuery(query);
		while ( results.next() )
	{
	
			return new Player(name, 0  );
	}
	}
		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return null;
	}
	
	public boolean update( Player player )
	
	{
	
		try {
		Statement statement = connection.createStatement();
		String insertSQL = String.format(" update \"Player\" set \"Money\" = %.2f where \"Name\" = '%s';", player.getCash(), player.getUserName() );
		statement.executeUpdate(insertSQL);
		return true;
	} 
		catch (SQLException e) {
		e.printStackTrace();
		}
	
		return false;
	}
	
}