package repo;

import java.util.ArrayList;

import model.Stock;

public interface IStockRepo {
	
	ArrayList<Stock> getStockList();
	void buildStockList();
	
}
