package controller;

import java.util.ArrayList;

import repo.*;
import model.*;

public class StockController {
	
	 ArrayList<Stock> stock; 
	 ArrayList<Transactions> Transaction;
	 ArrayList<Person> person;
	 BuyerRepo br;
	 StockRepo sr;	

	
public StockController() {
	sr = new StockRepo();
	this.stock = sr.getStockList();
	br = new BuyerRepo();
	this.person = br.getBuyerList();
	
}


public ArrayList<Stock> getStocks() {
	
	return this.stock;
	// TODO Auto-generated method stub	
}


public ArrayList<Person> getPerson() {

	return this.person;
	// TODO Auto-generated method stub	
}
public Person getBuyer(String name){
	for(Person buyer:person ){	
		if (buyer.getName().equals(name)){
			return buyer;
		}
	}
	return null;
	}



public ArrayList<Transactions> viewTransaction() {
	// TODO Auto-generated method stub
	return Transaction;
}

}