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
	
	public boolean createPlayer(Player player)
	{
		try
		{
			Statement statement = connection.createStatement();
			
			String createPlayerInSQL = String.format("insert into \"Player\" (\"Name\" character varying(100) ", " \"Cash\" )  VALUES ( '%s', '%.2f')" , 
					player.getThePlayerName(), player.getThePlayerCash());  
			
			statement.executeQuery(createPlayerInSQL);
			return true;
			
		}catch(Exception e)
		{
			System.out.println("There is a problem in createPlayer!");
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	
	
	
	
}
