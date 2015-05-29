package repo;
import java.sql.*;

import javax.swing.JOptionPane;

import model.Property;
public class practice {
 Connection connection;
     
     String url ;
     String user ;
     String password ;
     public static void main(String args[]){
    	 practice p = new practice();
    	 p.buildProps();
     }
     public Property[] buildProps(){
	 String url = "jdbc:postgresql://localhost/Monopoly";
     String user = "postgres";
     String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
			
	
	Property[] props = new Property[37];
	ResultSet rs;
	  try 
        {
        	connection = DriverManager.getConnection(url, user, password);
        
	        Statement db = connection.createStatement();
	        rs = db.executeQuery("Select * from \"Property\"");
	        while(rs.next()){
	     //   	props[rs.getInt(1)] = new Property(rs.getString(2));
	        //	props[rs.getInt(1)] = new Property(rs.getString(2),rs.getInt(4), rs.getInt(3),rs.getInt(5));
	        	System.out.println(rs.getRow());
	        }
	        
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        	System.err.println("Got an exception! "); 
        }
	
	
	return props;
}
}
