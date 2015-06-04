package repo;

import java.sql.*;
import java.util.ArrayList;
import model.Person;
import model.Stock;

public class BuyerRepo {




	ArrayList<Person> buyersList;


		



		public BuyerRepo() throws ClassNotFoundException{
			buyersList = new ArrayList<Person>();
			buildBuyerList();
			
			
		}
		public ArrayList<Person> getBuyerList(){
			return buyersList;
		}
		public void buildBuyerList() throws ClassNotFoundException{
				Connection  connection;
				
				
				// String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
			  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
			   //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
				Class.forName("org.postgresql.Driver");
				 String url = "jdbc:postgresql://localhost/stock market";
			     String user = "postgres";
			     String password = "password";
				 ResultSet rs;
				 ResultSet result;
				  try 
			        {
			        	connection = DriverManager.getConnection(url, user, password);
			        
				        Statement db = connection.createStatement();
				        rs = db.executeQuery("Select \"name\",\"bank\"from \"people\"");
				        while(rs.next()){  	
				        	String name = rs.getString(1);
				        	double purse = rs.getDouble(2);
				        	buyersList.add(new Person(name,purse));
				        //	System.out.println(name +" : "+ purse);
				        	//System.out.println(rs.getString(1)+ " : "+rs.getString(2));
				        	
				        	
				        	
				        }
				        for(Person buyer: buyersList){
				        	String name = buyer.getName();
				        	String query = "select \"stock_name\"from \"owned stocks\" where \"player_name\"='"+name+"'";
				        	rs = db.executeQuery(query);
				        	//System.out.println(query);
				        	while(rs.next()){
				        	String stock=rs.getString(1);
				        	result=db.executeQuery("select \"name\",\"ticker\" from \"stocks\" where \"name\"='"+stock+"'");
				        	if(result.next()){
				        	buyer.addStock(new Stock(result.getString(1),result.getString(2)));;
				        	
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
		
		
	}


