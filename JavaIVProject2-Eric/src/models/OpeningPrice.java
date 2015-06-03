package models;

import java.util.Date;

public class OpeningPrice {

	private String ticker;
	private String date;
	private Double price;

	public OpeningPrice( String ticker, String date, Double price )
	{
		this.setTicker(ticker);
		this.setDate(date);
		this.setPrice(price);
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
