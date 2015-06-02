package controller;

import java.util.ArrayList;

import repo.StockRepo;
import model.*;

public class StockController implements IStockController{
	
	 ArrayList<Stock> Stock; 
	 ArrayList<Transactions> Transaction;
	 ArrayList<Person> Person;
	 
	 StockRepo sr;
	 TransactionRepo tr;
	 PersonRepo pr;

	
public void stockController()
{
	sr = new StockRepo();
	this.Stock = sr.getStockList();
	
	tr= new TransactionRepo();
	this.Transaction= tr.getTransactionList();
	
	pr= new PersonRepo();
	this.Person = pr.getPersonRepoList();
}


@Override
public ArrayList<Stock> viewStock() {
	
	return this.Stock;
	// TODO Auto-generated method stub	
}


@Override
public ArrayList<Person> viewPerson() {
	return this.Person;
	// TODO Auto-generated method stub	
}

@Override
public ArrayList<Transactions> viewTransaction() {
	// TODO Auto-generated method stub
	return Transaction;
}

}