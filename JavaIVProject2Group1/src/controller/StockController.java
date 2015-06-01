package controller;

import java.util.ArrayList;

public class StockController implements IStockController{
	
	 ArrayList<String> Stock; 
	 ArrayList<String> Transaction;
	 ArrayList<String> Person;

	
public void stockController()
{
	this.Stock = new ArrayList<String>();
	this.Transaction= new ArrayList<String>();
	this.Person = new ArrayList<String>();
	
}


@Override
public ArrayList<String> viewStock() {
	return this.Stock;
	// TODO Auto-generated method stub
	
}


@Override
public ArrayList<String> viewPerson() {
	return this.Person;
	// TODO Auto-generated method stub
	
}


@Override
public ArrayList<String> viewTransaction() {
	return this.Transaction;
	// TODO Auto-generated method stub
	
}

}