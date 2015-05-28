package repo;

import java.sql.*;

public class PropertyRepo {
	
	public static void main(String [] args)
	{
		
        Connection connection;
       
        String url = "jdbc:postgresql://localhost/monopoly";
        String user = "postgres";
        String password = "p4ad7pfs";
        try 
        {
        	connection = DriverManager.getConnection(url, user, password);
        
	        Statement db = connection.createStatement();
	        
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(0, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(1, \"Coney Island\",-1,50, 500 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(2, \"Pawn Shop\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(3, \"White Castle\",-1,70, 700 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(4, \"Hacienda\",-1,40, 400 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(5, \"Marcs Loft\",-1,200, 2000 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(6, \"Keke House\",-1,60, 600 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(7, \"The Trap\",-1,10, 100 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(8, \"A Dark Alley\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(9, \"Jail\",0,30,0 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(10, \"The Holiday Inn\",-1,60, 600 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(11, \"Palmer Park\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(12, \"The Rave House\",-1,40, 400 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(13, \"The Stoop\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(14, \"Joey Roach Motel\",-1,70, 700 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(15, \"7 Mile and Ryan\",-1,90, 900 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(16, \"Biker Gang Hideout\",-1,80, 800 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(17, \"Eastside Coney Island\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(18, \"The Cartel Compoound\",-1,30, 300 )");  
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(19, \"Free Parking\",0,200,0 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(20, \"Latin After Hours\",0,40, 400 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(21, \"Jamaican After Hours\",0,50, 500 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(22, \"Liquor Store\",-1,30, 300 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(23, \"Family Dollar\",-1,20, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(24, \"Tasha Salon\",-1,40, 400 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(25, \"Belle Isle Strip\",-1,80, 800 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(26, \"Under the Ambassador Bridge\",-1,10, 100 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(27, \"Used Tire Shop\",-1,60, 600 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(28, \"The Slammer\",0,80, 0 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(29, \"The Works\",0,40, 400 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(30, \"Club Fanatasy\",0,30, 300 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(31, \"Springfield and Vernor\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(32, \"The Train Station\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(33, \"The Rooster Tail \",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(34, \"The Thai Spot\",0,10, 100 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(35, \"Starters\",0,30, 300 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(36, \"Mack and Bewick\",0,100, 1000 )");
	        	        
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        	System.err.println("Got an exception! "); 
        }
	}
	

}
