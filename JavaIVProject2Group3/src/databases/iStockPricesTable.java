package databases;

import models.StockPrices;
import models.iStockPrices;

public interface iStockPricesTable {
	public boolean create(iStockPrices prices);
	//public void read();
	public boolean update(iStockPrices prices);
	public boolean delete(iStockPrices prices);
	boolean create(StockPrices prices);
}
