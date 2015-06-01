package databases;

public interface iStocksOwnedTable {
	public boolean create(iStocksOwned stocksOwned);
	//public void read();
	public boolean update(iStocksOwned stocksOwned);
	public boolean delete(iStocksOwned stocksOwned);
}
