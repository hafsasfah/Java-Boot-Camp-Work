package controller;

public class StockController implements IStockController{
	
	private IPersonRepo PersonRepo;
	private IStockRepo StockRepo;
	private ITransactionRepo TransactionRepo;
	
	private IMarketView marketView;
	
public void stockController()
{
	PersonRepo = new PersonRepo();
	StockRepo = new StockRepo();
	TransactionRepo = new TransactionRepo();
}


public void IMarketView() {
	// TODO Auto-generated method stub
	
}

public void IStockRepo() {
	// TODO Auto-generated method stub
	
}

public void IPersonRepo() {
	// TODO Auto-generated method stub
	
}


public void ITransactionRepo() {
	// TODO Auto-generated method stub
	
}

}
