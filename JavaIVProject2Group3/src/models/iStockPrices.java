package models;

public interface iStockPrices {
	
	String getTicker();
	void setTicker(String ticker);
	int getDate();
	void setDate(int date);
	double getPrice();
	void setPrice(int price);
	
}
