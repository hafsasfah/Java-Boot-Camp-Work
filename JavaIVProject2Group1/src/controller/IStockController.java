package controller;
import java.util.*;

public interface IStockController {
	
	
	ArrayList<String> viewStock(); //Display Todays StockPrices
	ArrayList<String> viewPerson(); //Display Person
	ArrayList<String> viewTransaction();//Person Transaction [buy or sell stock]
}
