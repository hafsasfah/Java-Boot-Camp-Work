package repo;

import java.sql.*;
import java.util.ArrayList;

import model.Person;
import model.Stock;

public class BuyerRepo {
	ArrayList<Person> buyersList;
	Connection  connection;
	ConnectionHelper conectionHelper;
	ResultSet rs ;
	Statement db;
	public BuyerRepo() {
			buyersList = new ArrayList<Person>();
			conectionHelper = new ConnectionHelper();
			connection = conectionHelper.getconnection();
			buildBuyerList();
		}
	public static void main(String[] args){
		BuyerRepo br = new BuyerRepo();
	}
	
	
	
	
	public boolean update(Person buyer){	        
        Statement db;
		try {
			db = connection.createStatement();

        db.executeUpdate("UPDATE\"people\" set (\"bank\"='"+ buyer.getPurse() +"' where \"name\"='"+buyer.getName()+"')");
	    return true;   
	    
	
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
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
				        	buyer.addStock(new Stock(stockName,amountOwned));;
				        	}
				        					        	}
				         for(Person buyer: buyersList){
				        	for(Stock stock: buyer.getStocks()){
				        		String name = stock.getName();
				        	String query = "select \"ticker\" from \"stocks\" where \"name\"='"+name+"'";
				        	rs = db.executeQuery(query);
				        
				        	while(rs.next()){
				        	String stockTicker = rs.getString(1);
				          	stock.setTicker(stockTicker);
				          	}
				        	}
				        	System.out.println(buyer.getName());
				        	for(Stock ownedstock:buyer.getStocks()){
				        		System.out.println(ownedstock.getTicker()+" : "+ownedstock.getName()+" : "+ownedstock.getAmountOwned());
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
			    return true;   
			
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	        


		
			
			
			
			
			
			
		
				  
				/*(  
				  public void getBuyerList(Person buyer ) {
						
					  // String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
					  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
					  //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
				
						        	String name = buyer.getName();
						        	String query = "select \"stock_name\", \"amount owned\"from \"owned stocks\" where \"player_name\"='"+name+"'";
						        	try {
										rs = db.executeQuery(query);
									
						        	//System.out.println(query);
						        	while(rs.next()){
							        	String stockName = rs.getString(1);
							        	int amountOwned = rs.getInt(2);
							        	buyer.addStock(new Stock(stockName,amountOwned));;
						        	}
						        	for(Stock stock: buyer.getStocks()){
						        		String stockName = stock.getName();
						        		String stockQuery = "select \"ticker\" from \"stocks\" where \"name\"='"+stockName+"'";
						        		rs = db.executeQuery(stockQuery);
						        		while(rs.next()){
						        			String stockTicker = rs.getString(1);
						        			stock.setTicker(stockTicker);
						        		}
						        	}
						        	} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
						        						        	
						        } */
}

