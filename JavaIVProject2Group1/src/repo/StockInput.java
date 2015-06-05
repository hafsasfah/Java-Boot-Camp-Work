package repo;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.sql.*;

import javax.swing.JOptionPane;


public class StockInput {
	ArrayList<String> dataArray;
	public StockInput(){
		dataArray = new ArrayList<String>();
	}
	public static void main(String[] args){
		StockInput si = new StockInput();
		
	//	si.addStockstoDatabase();
		si.readInTodaysPrice();
	}
	
	public  void fileReader(String filename){
		//String fileName = "S&P500Stocks.csv";
		File file = new File(filename);
		//File file = new File(JOptionPane.showInputDialog("Enter file name"));
		Scanner infile;
		try {
			infile = new Scanner(file);
			while(infile.hasNextLine()){
				//System.out.println(infile.nextLine());
				dataArray.add(infile.nextLine());
			}
			} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	
	}
	public void readInTodaysPrice(){
		String filename = "S&P500-2015-06-04.csv";// TODO make sure to delete the fake Friday prices before adding new ones. 
		//S&P500-2015-06-01.csv
		fileReader( filename);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
	   	Connection connection;  
        String url = "jdbc:postgresql://localhost/stock market";
        String user = "postgres";
        String password = "password";
        String yesterday = "2015-06-05";
        try 
        {
        	connection = DriverManager.getConnection(url, user, password);
        
	        Statement db = connection.createStatement();
	     // db.executeUpdate("DELETE FROM \"opening price\" where \"date\"= '" + yesterday+"'" );
	      
	       for(int i = 1;i<dataArray.size()-1;i++){ 
	    	
	    	   String str =  dataArray.get(i);
	    	   if(str.contains("'")){
	    		  String temp[]= str.split("'");
	    		  str = temp[0]+temp[1];
	    		   
	    	   }
	    	   String[] tokens = str.split(",");
	    	   if(tokens.length> 2){
	    		   tokens[1] = tokens[1]+","+tokens[2];
	    	   }
	    	   System.out.println(tokens[0]+" : "+tokens[1]);
	      // db.executeUpdate("INSERT INTO \"opening price\" (\"ticker\", \"price\",\"date\") VALUES('"+tokens[0]+"','"+tokens[1]+"','"+dateFormat.format(date)+"')");
	    	   db.executeUpdate("INSERT INTO \"opening price\" (\"ticker\", \"price\",\"date\") VALUES('"+tokens[0]+"','"+tokens[1]+"','"+yesterday+"')");
	       }
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        	System.err.println("Got an exception! "); 
        }
}
	
	public void addStockstoDatabase(){
		String fileName = "S&P500Stocks.csv";
		fileReader(fileName);
			   	Connection connection;  
		        String url = "jdbc:postgresql://localhost/stock market";
		        String user = "postgres";
		        String password = "password";
		        try 
		        {
		        	connection = DriverManager.getConnection(url, user, password);
		        
			        Statement db = connection.createStatement();
			        db.executeUpdate("DELETE FROM \"stocks\"");
			      
			       for(int i = 1;i<dataArray.size()-1;i++){ 
			    	
			    	   String str =  dataArray.get(i);
			    	   if(str.contains("'")){
			    		  String temp[]= str.split("'");
			    		  str = temp[0]+temp[1];
			    		   
			    	   }
			    	   String[] tokens = str.split(",");
			    	   if(tokens.length> 2){
			    		   tokens[1] = tokens[1]+","+tokens[2];
			    	   }
			    	   System.out.println(tokens[0]+" : "+tokens[1]);
			       db.executeUpdate("INSERT INTO \"stocks\" (\"ticker\", \"name\") VALUES('"+tokens[0]+"','"+tokens[1]+"')");
			       }
		        }
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        	System.err.println("Got an exception! "); 
		        }
	}
	
	/*public void readdatabase(){
		
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
			        	props[rs.getInt(1)] = new Property(rs.getString(2),rs.getInt(4), rs.getInt(3),rs.getInt(5));
			        	
			        }
			        
		        }
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        	System.err.println("Got an exception! "); 
		        }
			
			
			return props;
		}
	}*/
	
	
	
	
}
