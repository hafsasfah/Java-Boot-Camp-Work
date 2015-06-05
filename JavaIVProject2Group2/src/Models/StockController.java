package Models;

import Repository.PlayerRepository;

public class StockController
{

	PlayerRepository stockrepo;
	

public StockController()
	{
	stockrepo = new PlayerRepository(null);
	}

public void createStockListing(StockModel stock)
	{

	}

public void updateDaily(StockModel stock)
	{
	stockrepo.updateStockPrice(stock);
	}
}