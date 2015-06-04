package repo;

import java.util.ArrayList;

import model.Person;
import model.Stock;

public class dummyrepo implements IStockRepo 
{

	@Override
	public ArrayList<Stock> getStockList() {
		 // Create an ArrayList to hold some names.
	      ArrayList<Stock> nameList = new ArrayList<Stock>();
	      
	      // Add some names to the ArrayList.
	      nameList.add(new Stock("Apple", "AAPL"));
	      nameList.add(new Stock ("Catherine", "DDP"));
	      nameList.add(new Stock("Bill", "STO"));
	      
	      return nameList;

	}

	@Override
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

}
