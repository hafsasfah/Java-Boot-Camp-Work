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
	        
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(1, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(2, \"Coney Island\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(3, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(4, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(5, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(6, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(7, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(8, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(9, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(10, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(11, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(12, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(13, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(14, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(15, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(16, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(17, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(18, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(19, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(20, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(21, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(22, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(23, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(24, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(25, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(26, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(27, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(28, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(29, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(30, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(31, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(32, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(33, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(33, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(34, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(35, \"GO\",0,0, 200 )");
	        db.executeUpdate("INSERT INTO \"Property\" (\"ID\", \"name\", \"owned\", \"rent\", \"buyPrice\") VALUES(36, \"GO\",0,0, 200 )");
	        

	        /**
	        INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(2, 'Coney
	        		Island',-1,200, 50 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(3, 'Pawn Shop',-1,500, 100 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(4, 'White Castle',-1,100,30 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(5, 'Hacienda',-1,100, 15 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(6, 'Marcs Loft',-1,1500, 500 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(7, 'Keke House',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(8, 'The Trap',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(9, 'The Slammer',0,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(10, 'A Dark Alley',-1,200, 10 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(11, 'The Holiday Inn',-1,500, 150);
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(12, 'Palmer Park',-1,800, 70 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(13, 'The Rave House',-1,400, 60 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(14, 'The Stoop',-1,100, 50 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(15, 'Joey Roach Motel',-1,200, 40 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(16, '7 Mile and Ryan',-1,200, 10 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(17, 'Free Parking',-1,0,200);
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(18, 'GO',0,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(19, 'Eastside Coney Island',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(20, 'The Cartel Compoound',-1,1200, 200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(21, 'Biker Gand Hideout',-1,500, 80 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(22, 'Latin After Hours',-1,400, 30 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(23, 'Jamaican After Hours',-1,300, 20 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(24, 'Family Dollar',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(25, 'Liquor Store',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(26, 'Used Tire Shop',-1,600, 100 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(27, 'Tasha Salon',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(28, 'Social Services',-1,700, 120);
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(29, 'Belle Isle Strip',-1,600, 60 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(30, 'Under the Ambassador Bridge',-1,200, 20 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(31, 'J',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(32, 'J',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(33, 'J',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(34, 'J',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(35, 'J',-1,200 );
			INSERT INTO Property(id, name, owned, rent, buyPrice) VALUES(36, 'J',-1,200 );
			*/
	        
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        	System.err.println("Got an exception! "); 
        }
	}
	

}
