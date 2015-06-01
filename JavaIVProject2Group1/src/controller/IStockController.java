package controller;
import java.util.*;

public interface IStockController {
	
	void IMarketView(); //Display MarketView
	void IStockRepo(); //Display Todays StockPrices
	void IPersonRepo(); //Display Person
	void ITransactionRepo();//Person Transaction [buy or sell stock]
}
