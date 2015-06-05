package controller;

import java.util.ArrayList;

import repo.*;
import model.*;

public class StockController {
	
	 ArrayList<Stock> stocks; 
	 ArrayList<Transactions> Transaction;
	 ArrayList<Person> person;
	 BuyerRepo br;
	 StockRepo sr;	
<<<<<<< HEAD
=======
	 public static void main(String[] args){
			
			//StockController sc = new StockController();
			//sc.buyStock(Blair, MMM, 1)
		}
>>>>>>> origin/JavaIVProject2Group1
	
public StockController() {
	sr = new StockRepo();
	this.stocks = sr.getStockList();
	br = new BuyerRepo();
	this.person = br.getBuyerList();
}


public ArrayList<Stock> getStocks() {
	
	return this.stocks;
	// TODO Auto-generated method stub	
}

public Stock getStocks(String tickerOrName) {
	for(Stock stock:stocks ){	
		if (stock.getName().equals(tickerOrName)||stock.getTicker().equals(tickerOrName)){
			return stock;
		}
	}
	return null;
	
}

public ArrayList<Person> getPerson() {

	return this.person;
	// TODO Auto-generated method stub	
}
public boolean addBuyer(String name, int purse){
	if(br.newBuyer(new Person(name,purse))){
		return true;
	}
	else
		return false;
}

public Person getBuyer(String name){
	for(Person buyer:person ){	
		if (buyer.getName().equals(name)){
			return buyer;
		}
	}
	return null;
	}

public boolean buyStock(String buyerName, String stockNameOrTicker,int amount){
	OwnedStockRepo osr = new OwnedStockRepo();
	for(Person buyer: person){
		if(buyer.getName().equals(buyerName)){
			for(Stock stock:stocks){
				if(stock.getName().equals(stockNameOrTicker)||stock.getTicker().equals(stockNameOrTicker)){
					if (buyer.getPurse()<stock.getPrice()){
						return false;
						
					}else{
						buyer.buyStock(stock,amount);
						br.update(buyer);
						osr.newOwnedStock(buyerName, stockNameOrTicker, amount);
						return true;
					}
						
				}
			}
			
		}
	}
	return false;
}
public void sellStock(String buyerName, String stockNameOrTicker){
	for(Person buyer: person){
		if(buyer.getName().equals(buyerName)){
			for(Stock stock:stocks){
				if(stock.getName().equals(stockNameOrTicker)||stock.getTicker().equals(stockNameOrTicker)){
					//buyer.sellStock(stock);
					br.update(buyer);
					
				}
			}
			
		}
	}
}

//public boolean addTransaction(){
	
//}


public ArrayList<Transactions> viewTransaction() {
	// TODO Auto-generated method stub
	return Transaction;
}

}