package databases;

import models.iStockPrices;

public interface iStockPricesTable {
	public boolean create(iStockPrices prices);
	//public void read();
	public boolean update(iStockPrices prices);
	public boolean delete(iStockPrices prices);
}
