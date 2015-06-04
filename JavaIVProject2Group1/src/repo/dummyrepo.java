package repo;

import java.util.ArrayList;

import model.Person;
import model.Stock;
import model.Transactions;

public class dummyrepo 
{

	public ArrayList<Stock> getStockList() {
		 // Create an ArrayList to hold some names.
	      ArrayList<Stock> nameList = new ArrayList<Stock>();
	      
	      // Add some names to the ArrayList.
	      nameList.add(new Stock("Apple", "AAPL"));
	      nameList.add(new Stock ("Catherine", "DDP"));
	      nameList.add(new Stock("Bill", "STO"));
	      
	      return nameList;

	}

	
	public void buildStockList() {
		// TODO Auto-generated method stub
		
	}
	public Stock get(String string){
		return null;
	}
	public ArrayList<Person> getbuyers(){
		ArrayList<Person> buyers = new  ArrayList<Person>();
		
		buyers.add(new Person("Chris",20));
		buyers.add(new Person("Mario",20));
		buyers.add(new Person("Blaire",20));
		buyers.add(new Person("Tommie",20));
		
		return buyers;
		
	}
	
		public ArrayList<Transactions> getTransactions() {
			 // Create an ArrayList to hold some Transactions.
		      ArrayList<Transactions> TransactionList = new ArrayList<Transactions>();
		      
		      // Add some Transactions to the ArrayList.
		      TransactionList.add(new Transactions(new Person("Chris", 20),new Stock("Apple", "AAPL"), 0, null, 0));
		      TransactionList.add(new Transactions (null, null, 0, null, 0));
		      TransactionList.add(new Transactions(null, null, 0, null, 0));
		      
		      return TransactionList;
	}
	}

