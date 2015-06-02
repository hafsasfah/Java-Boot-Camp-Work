package stockcontroller;

import StockModel.StockModel;
import Stockrepo.StockRepo;

public class StockController
{
	StockRepo stockrepo;
	
	public StockController()
	{
		stockrepo = new StockRepo();
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
