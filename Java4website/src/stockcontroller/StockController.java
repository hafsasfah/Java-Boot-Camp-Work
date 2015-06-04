package stockcontroller;

import StockModel.StockModel;
import Stockrepo.OpeningPriceRepo;
import Stockrepo.StockRepo;

public class StockController
{
	public StockRepo stockrepo;
	public OpeningPriceRepo pricerepo;
	
	public StockController()
	{
		stockrepo = new StockRepo();
		pricerepo = new OpeningPriceRepo();
	}

	public void createStockListing(StockModel stock)
	{
		//stockrepo.addStock(stock);
	}
	

}
