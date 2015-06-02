package Models;

import Repository.StockRepository;

public class StockController
{

	StockRepository stockrepo;
	

public StockController()
	{
	stockrepo = new StockRepository();
	}

public void createStockListing(StockModel stock)
	{
	//stockrepo.addStock(stock);
	}

public void updateDaily(StockModel stock)
	{
	stockrepo.updateStockPrice(stock);
	}
}