package controller;

import java.util.ArrayList;

import repo.*;
import model.*;

public class StockController implements IStockController{
	
	 ArrayList<Stock> stock; 
	 ArrayList<Transactions> Transaction;
	 ArrayList<Person> person;
	 BuyerRepo pr;
	 StockRepo sr;
public static void main(String[] args) throws ClassNotFoundException{
	StockController sc = new StockController();
	sc.viewPerson();
	// TransactionRepo tr;
	

	
}
	
public StockController() throws ClassNotFoundException
{
	sr = new StockRepo();
	this.stock = sr.getStockList();
	pr = new BuyerRepo();
	this.person = pr.getBuyerList();
	
	

	
	
	//tr= new TransactionRepo();
	//this.Transaction= tr.getTransactionList();
	
	
	
}


@Override
public ArrayList<Stock> viewStock() {
	
	return this.stock;
	// TODO Auto-generated method stub	
}


@Override
public ArrayList<Person> viewPerson() {
	for(Person buyer: person){
	System.out.println(buyer.getName());
	}
	return this.person;
	// TODO Auto-generated method stub	
}

@Override
public ArrayList<Transactions> viewTransaction() {
	// TODO Auto-generated method stub
	return Transaction;
}

}