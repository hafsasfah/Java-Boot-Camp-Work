package PlayerRepo;


import java.sql.*;
import java.util.List;
import java.util.ArrayList;



import PlayerModel.PlayerModel;


public class PlayerRepo 
{

	Connection connection;
	
	public PlayerRepo(Connection connection)
	{
		
		this.connection = connection;
		
	}
	
	
	public PlayerRepo()
	{
		
		try
		{
			String url = "jdbc:postgresql://localhost/Stocks";
			String username = "postgres";
			String password = "Silver99";
			
			connection = DriverManager.getConnection(url, username, password);
			
			
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			System.out.print("You messed up now.");
		}
		
		
	}
	

	
	
	public void buildPlayerTable()
	{
		
		try
		{
			
			
			Statement statement = connection.createStatement();
			String buildPlayerTable = " CREATE TABLE \"Player\" " 
										+"  \"Name\" character varying(100), " 
										+ "  \"Cash\" double precision, " + ")"; 
			
			statement.executeQuery(buildPlayerTable);
			
			
			
		}catch(SQLException E)
		{
			
			System.out.println("There is a problem building the player table");
			E.printStackTrace();
			
		}
		
		
	}
	

	
	
	
	public boolean buildPlayer(PlayerModel player)
	{
		try
		{
			Statement statement = connection.createStatement();
			
			String createPlayerInSQL = String.format("insert into \"Player\" (\"Name\" ", " \"Cash\" )  VALUES ( '%s', '%.2f')" , 
					player.getThePlayerName(), player.getThePlayerCash());  
			
			statement.executeQuery(createPlayerInSQL);
			return true;
			
		}catch(SQLException E)
		{
			System.out.println("There is a problem in createPlayer!");
			E.printStackTrace();
			return false;
		}
		
		
	}
	
	
	public List<PlayerModel> getAllPlayers()
	{
		List<PlayerModel> players = new ArrayList<PlayerModel>();
		try
		{
			Statement statement = connection.createStatement();
			String getPlayerNameAndCash = String.format("SELECT \"Name\" , \"Cash\" FROM \"Player\"");
			
			ResultSet results = statement.executeQuery(getPlayerNameAndCash);
			while(results.next())
			{
				players.add( new PlayerModel( results.getString(1), results.getDouble(2) ) );
			}
			
		
			
			
			
		}catch(SQLException E)
		{
			E.printStackTrace();
		
		}
		
		
		return players;
		
	}
	
	
	public PlayerModel getASinglePlayer( String name )
	{
		try {
			
			Statement statement = connection.createStatement();
			String SinglePlayerInQuery = String.format("select \"Name\", \"Cash\" from \"Player\" where \"Name\" = '%s'", name );
			ResultSet results = statement.executeQuery(SinglePlayerInQuery);
			while ( results.next() )
			{
				return new PlayerModel( results.getString(1), results.getDouble(2) );
			}
			
		} catch (SQLException E) {
			
			E.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public boolean update(PlayerModel player)
	{
		
		try
		{
			
			Statement statement = connection.createStatement();
			String insert = String.format(" update \"PlayerModel\" , set \"Cash\" = %.2f where \"Name\" = '%s' ;" 
					, player.getThePlayerName(), player.getThePlayerCash() );  
		
			
			statement.executeQuery(insert);
			
			return true;
			
		}catch(SQLException E)
		{
			
			E.printStackTrace();
			return false;
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
