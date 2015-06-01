package databases;

import models.iStocks;

public interface iStocksTable {
	public boolean create(iStocks stocks);
	//public void read();
	public boolean update(iStocks stocks);
	public boolean delete(iStocks stocks);
}
