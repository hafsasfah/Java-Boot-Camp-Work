package Models;

import java.util.*;
public class Summary{

	private Player player;

	private List<OwnedStock> ownedStocks;
	private List<OpeningStock> todaysStockPrices;
	private HashMap<String,Double> priceMap;

	public Summary( Player player, List<OwnedStock> ownedStocks, List<OpeningStock> todaysStockPrices )

	{

		this.player = player;
		this.ownedStocks = ownedStocks;
		this.todaysStockPrices = todaysStockPrices;

		priceMap = new HashMap<String,Double>();

		for ( OpeningStock price : todaysStockPrices )
	{
	priceMap.put( price.getTicker(), price.getPrice() );
	}
	}

	public Player getPlayer() {

		return player;
	}

	public List<OwnedStock> getOwnedStocks() {

		return ownedStocks;
	}

	public List<OpeningStock> getTodaysStockPrices() {

		return todaysStockPrices;
	}

	public double getNetWorth()
	{	

		double netWorth = player.getMoney();

		for ( OwnedStock stock : ownedStocks )
		{

			netWorth += priceMap.get( stock.getTicker() );
		}

		return netWorth;
	}

	public Map<String,Double> getPriceMap()
	{

		return priceMap;
	}
}