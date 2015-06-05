package PlayerRepo;
import java.sql.*;

import PlayerModel.Player;

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
			String password = "dragon";
			
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
	
	
	
	
	public boolean buildPlayer(Player player)
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
