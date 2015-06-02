package controller;

import java.util.ArrayList;

import repo.StockRepo;
import model.*;

public class StockController implements IStockController{
	
	 ArrayList<Stock> stock; 
	 ArrayList<Transactions> Transaction;
	 ArrayList<Person> Person;
	 StockRepo sr;
public static void main(String[] args){
	StockController sc = new StockController();

	
}
	
public StockController()
{
	sr = new StockRepo();
	this.stock = sr.getStockList();
	this.Transaction= new ArrayList<Transactions>();
	this.Person = new ArrayList<Person>();
	
	
	for(Stock stocks:stock){
		System.out.println(stocks.getname());
	}
	
	
}


@Override
public ArrayList<Stock> viewStock() {
	
	return this.stock;
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