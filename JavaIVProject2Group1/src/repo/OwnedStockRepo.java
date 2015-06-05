package repo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import model.*;


public class OwnedStockRepo  {
ArrayList<Person> buyers;
ConnectionHelper connectionHelper;
ResultSet rs ;
Statement db;
Connection  connection;



	public static void main(String[] args){
	
	//	StockRepo sr = new StockRepo();
	//	OwnedStockRepo osr = new OwnedStockRepo();
	//	osr.newOwnedStock("Mario", "MMM", 10);
	}



	public OwnedStockRepo(){
		buyers = new ArrayList<Person>();
		connectionHelper = new ConnectionHelper();
		connection = connectionHelper.getconnection();
		
	}
	

	public ArrayList<Person> getStockList(String ticker){

		
			  try 
		        {
		       db= connection.createStatement();
			        rs = db.executeQuery("Select \"amount owned\",\"stock_name\",\"player_name\"from \"owned stocks\" where \"ticker\"='"+ticker+"'");
			        while(rs.next()){  	
			        	
			        	String playerName = rs.getString(3);
			        	Integer amountOwned = Integer.parseInt(rs.getString(1));
			        	String stockName = rs.getString(2);
			        	
			        	
			        	buyers.add(new Person(playerName,new Stock(ticker,stockName),amountOwned));
			        	
			        }
		        }
		
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        	System.err.println("Got an exception! "); 
		        }
			
			
			return buyers;
		}
	public boolean newOwnedStock(String name, String ticker, int amountOwned){	        
        Statement db;
		try {
			db = connection.createStatement();
			StockRepo stockRepo = new StockRepo();
			Stock stock = stockRepo.get(ticker)	;		
			
			
			
			
        db.executeUpdate("INSERT INTO \"owned stocks\" (\"stock_name\", \"player_name\", \"amount owned\") VALUES('"+stock.getTicker()+"','"+name+"','"+amountOwned+"')");
      System.out.println("Bought stock");
	    return true;   
	
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}
	
	
}
