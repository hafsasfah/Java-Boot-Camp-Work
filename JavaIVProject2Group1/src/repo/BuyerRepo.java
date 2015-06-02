package repo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Person;
import model.Stock;

public class BuyerRepo {




	ArrayList<Person> buyersList;


		public static void main(String[] args){
			BuyerRepo br = new BuyerRepo();
			br.buildBuyerList();
		
		}



		public BuyerRepo(){
			buyersList = new ArrayList<Person>();
			
		}
		public ArrayList<Person> getBuyerList(){
			return buyersList;
		}
		public void buildBuyerList(){
				Connection  connection;
				
				
				// String url = "jdbc:postgresql://localhost/"+JOptionPane.showInputDialog("Enter Database to read from ");
			  //   String user = JOptionPane.showInputDialog("Enter Username for "+ url);
			   //  String password = JOptionPane.showInputDialog("Enter Database password for user \""+user+"\"");
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date date = new Date();
			     
				 String url = "jdbc:postgresql://localhost/stock market";
			     String user = "postgres";
			     String password = "password";
				 ResultSet rs;
				  try 
			        {
			        	connection = DriverManager.getConnection(url, user, password);
			        
				        Statement db = connection.createStatement();
				        rs = db.executeQuery("Select \"name\",\"bank\"from \"people\"");
				        while(rs.next()){  	
				        	String name = rs.getString(1);
				        	double purse = rs.getDouble(2);
				        	buyersList.add(new Person(name,purse));
				        	System.out.println(name +" : "+ purse);
				        	//System.out.println(rs.getString(1)+ " : "+rs.getString(2));
				        	
				        	
				        	
				        }
				       /* for(Stock stock: stocksList){
				        	String ticker = stock.getTicker();
				        	String Query = "";
				        	rs = db.executeQuery(query);
				        	System.out.println(query);
				        	if(rs.next()){
				        	stock.setPrice(rs.getDouble(1));
				        	System.out.println(stock.getname()+" : "+stock.getPrice());
				        	}
				        }*/
				        
			        }
			        catch(SQLException e)
			        {
			        	e.printStackTrace();
			        	System.err.println("Got an exception! "); 
			        }
				
				
				
			}
		
		
	}


