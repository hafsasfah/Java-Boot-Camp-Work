package repo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


import model.Person;
import model.Stock;

public class BuyerRepo {
	ArrayList<Person> buyersList;
	Connection  connection;
	ConnectionHelper conectionHelper;
	ResultSet rs ;
	Statement db;
	DateFormat dateFormat;
	Date date;
	public BuyerRepo() {
		dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		 date = new Date();
			buyersList = new ArrayList<Person>();
			conectionHelper = new ConnectionHelper();
			connection = conectionHelper.getconnection();
			buildBuyerList();
		}
	public static void main(String[] args){
		BuyerRepo br = new BuyerRepo();
		br.newBuyer(new Person("Kody",2000));
	}
	
	public ArrayList<Person> getBuyerList(String name){
		ArrayList<Person> result = new ArrayList<Person>();
		for(Person buyer: this.buyersList){
			if (buyer.getName().equals(name)){
				result.add(buyer);
			}
		}
		return result;
	}
	
	
	public void update(Person buyer){	        
        Statement db;
		try {
			db = connection.createStatement();

        db.executeUpdate("UPDATE\"people\" set (\"bank\"='"+ buyer.getPurse() +"' where \"name\"='"+buyer.getName()+"')");
	   
	    for(Stock stock: buyer.getStocks().keySet()){
	    	
	    db.executeUpdate("UPDATE\"owned stocks\" set (\"amount\"='"+ buyer.getPurse() +"' where \"name\"='"+buyer.getName()+"')");
	    }
	    
	
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
   
	
	
	
	
	
	
		public ArrayList<Person> getBuyerList(){
			return buyersList;
		}
		public void buildBuyerList() {
				
			  // String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
			  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
			  //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
		
				  try 
			        {
			     
			            db = connection.createStatement();
				        rs = db.executeQuery("Select \"name\",\"bank\"from \"people\"");
				        while(rs.next()){  	
				        	String name = rs.getString(1);
				        	double purse = rs.getDouble(2);
				        	buyersList.add(new Person(name,purse));
				        }
				        for(Person buyer: buyersList){
				        	String name = buyer.getName();
				        	String query = "select \"stock_name\", \"amount owned\"from \"owned stocks\" where \"player_name\"='"+name+"'";
				        	rs = db.executeQuery(query);
				        	//System.out.println(query);
				        	while(rs.next()){
				        	String stockName = rs.getString(1);
				        	int amountOwned = rs.getInt(2);
				        	buyer.addStock(new Stock(stockName),amountOwned);
				        	
				        	}
				        					        	}
				         for(Person buyer: buyersList){
				        	for(Stock stock: buyer.getStocks().keySet()){
				        		String name = stock.getName();
				        	String query = "select \"ticker\" from \"stocks\" where \"name\"='"+name+"'";
				        	rs = db.executeQuery(query);
				        	
				        
				        	while(rs.next()){
				        	String stockTicker = rs.getString(1);
				          	stock.setTicker(stockTicker);
				          	
				          	}
				        	}
				        }
				         for(Person buyer: buyersList){
					        	for(Stock stock: buyer.getStocks().keySet()){
					        		String ticker = stock.getTicker();
					        	String query = "select \"price\" from \"opening price\" where \"ticker\"='"+ticker+"' AND \"date\"='"+dateFormat.format(date)+"'";
					        	rs = db.executeQuery(query);
					        	
					        
					        	while(rs.next()){
					        	double price = Double.parseDouble(rs.getString(1));
					          	stock.setPrice(price);
					          	//System.out.println("Stock price: "+ price);
					          	}
					        	}
					        }
				        
			        }
			        catch(SQLException e)
			        {
			        	e.printStackTrace();
			        	System.err.println("Got an exception! "); 
			        }
		}
		
		
		
		
		public boolean newBuyer(Person buyer){	        
		        Statement db;
				try {
					db = connection.createStatement();
		        db.executeUpdate("INSERT INTO \"people\" (\"name\", \"bank\") VALUES('"+buyer.getName()+"','"+buyer.getPurse()+"')");
		        System.out.println("Created Buyer");
			    return true;   
			
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	
	
}

