package databases;

import models.iStockOwned;

public interface iStockOwnedTable {
	public boolean create(iStockOwned stocksOwned);
	//public void read();
	public boolean update(iStockOwned stocksOwned);
	public boolean delete(iStockOwned stocksOwned);
}
