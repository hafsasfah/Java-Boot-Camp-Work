package repo;

import java.util.ArrayList;

import model.Stock;
import model.Transactions;

public interface IStockRepo {
	
	ArrayList<Stock> getStockList();
	void buildStockList();
	ArrayList<Transactions>getTransactions();
	void buildTransactionsList();
	
}
