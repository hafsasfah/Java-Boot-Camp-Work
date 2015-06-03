package repo;

import java.util.ArrayList;

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

}
