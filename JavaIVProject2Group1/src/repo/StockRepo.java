package repo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Stock;


public class StockRepo  {
ArrayList<Stock> stocksList;
ConnectionHelper connectionHelper;
ResultSet rs ;
Statement db;
Connection  connection;



	public static void main(String[] args){
	
	//	StockRepo sr = new StockRepo();
	}



	public StockRepo(){
		stocksList = new ArrayList<Stock>();
		connectionHelper = new ConnectionHelper();
		connection = connectionHelper.getconnection();
		buildStockList();
	}
	public ArrayList<Stock> getStockList(){
		return stocksList;
	}
	/*
	public Stock getStockList(String tickerOrName){
		for (Stock stock: stocksList){
			if (stock.getName().equals(tickerOrName)||stock.getTicker().equals(tickerOrName)){
				return stock;
			}
		}
		return null;
		}
		*/
	public Stock get(String tickerOrName) {
		for(Stock stock:stocksList ){	
			if (stock.getName().equals(tickerOrName)||stock.getTicker().equals(tickerOrName)){
				return stock;
			}
		}
		return null;
		
	}
	
	public void buildStockList(){
			
			
			
			// String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
		  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
		   //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
		
			  try 
		        {
		       db= connection.createStatement();
			        rs = db.executeQuery("Select \"ticker\",\"name\"from \"stocks\"");
			        while(rs.next()){  	
			        	String ticker = rs.getString(1);
			        	String name = rs.getString(2);
			        	stocksList.add(new Stock(ticker,name));
			        	//System.out.println(rs.getString(1)+ " : "+rs.getString(2));
			        	
			        	
			        	
			        }
			        for(Stock stock: stocksList){
			        	String ticker = stock.getTicker();
			        	String query = String.format("Select \"price\"from \"opening price\" where \"ticker\" = '%s' AND \"date\" = '%s'", ticker, dateFormat.format(date));
			        	//String query = String.format("Select \"price\"from \"opening price\" where \"ticker\" = '%s'", ticker);
			        	rs = db.executeQuery(query);
			        	//System.out.println(query);
			        	if(rs.next()){
			        	stock.setPrice(rs.getDouble(1));
			        	//System.out.println(stock.getname()+" : "+stock.getPrice());
			        	}
			        }
			        
		        }
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        	System.err.println("Got an exception! "); 
		        }
			
			
			
		}
	
	
}
