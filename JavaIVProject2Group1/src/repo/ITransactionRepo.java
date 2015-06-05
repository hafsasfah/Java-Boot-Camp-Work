package repo;

import java.util.ArrayList;

import model.Transactions;

public interface ITransactionRepo {
	
	ArrayList<Transactions> getTransactionList();
	void buildTransactionList();

}
