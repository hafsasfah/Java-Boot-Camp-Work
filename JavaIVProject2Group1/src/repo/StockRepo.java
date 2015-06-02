package repo;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Stock;


public class StockRepo {
ArrayList<Stock> stocksList;


	public static void main(String[] args){
	
	//	StockRepo sr = new StockRepo();
	}



	public StockRepo(){
		stocksList = new ArrayList<Stock>();
		buildStockList();
	}
	public ArrayList<Stock> getStockList(){
		return stocksList;
	}
	public void buildStockList(){
			Connection  connection;
			
			
			// String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
		  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
		   //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
			 
		     
			 String url = "jdbc:postgresql://localhost/stock market";
		     String user = "postgres";
		     String password = "password";
			 ResultSet rs;
			  try 
		        {
		        	connection = DriverManager.getConnection(url, user, password);
		        
			        Statement db = connection.createStatement();
			        rs = db.executeQuery("Select \"ticker\",\"name\"from \"stocks\"");
			        while(rs.next()){  	
			        	String ticker = rs.getString(1);
			        	String name = rs.getString(2);
			        	stocksList.add(new Stock(ticker,name));
			        	System.out.println(rs.getString(1)+ " : "+rs.getString(2));
			        	
			        }
			        
		        }
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        	System.err.println("Got an exception! "); 
		        }
			
			
			
		}
	
	
}
