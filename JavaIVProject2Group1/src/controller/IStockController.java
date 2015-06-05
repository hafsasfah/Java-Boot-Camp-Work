package controller;
import java.util.*;

import model.*;

public interface IStockController {
	
	ArrayList<Stock> viewStock(); //Display Todays StockPrices
	ArrayList<Person> viewPerson(); //Display Person
	ArrayList<Transactions> viewTransaction();//Person Transaction [buy or sell stock]
}
