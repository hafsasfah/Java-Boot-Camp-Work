package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import data.StockConnectionProvider;
import data.StockRepository;
import models.Stock;

public class StockReader 
{
	public static void main(String[] args)
	{
		new StockReader( "C:\\Users\\Eric\\Desktop\\S&P500Stocks.csv" );
	}

	private StockRepository stockRepository;
	
	public StockReader( String filename )
	{
		stockRepository = new StockRepository( StockConnectionProvider.createConnection() );
		
		for ( Stock stock : read( filename ) )
		{
			stockRepository.create( stock );
		}
	}
	
	public List<Stock> read( String filename )
	{
		File stockFile = new File( filename );
		Scanner scanner;
		try 
		{
			scanner = new Scanner(stockFile);
			List<Stock> stocks = new ArrayList<Stock>();
			if ( scanner.hasNext() )
			{
				String headerLineToIgnore = scanner.nextLine();
			}
			while ( scanner.hasNext() )
			{
				String line = scanner.nextLine();
				int firstCommaIndex = line.indexOf(',');
				String ticker = line.substring(0, firstCommaIndex );
				String name = line.substring(firstCommaIndex + 1);
				stocks.add( new Stock(ticker, name) );
			}
			scanner.close();
			return stocks;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
