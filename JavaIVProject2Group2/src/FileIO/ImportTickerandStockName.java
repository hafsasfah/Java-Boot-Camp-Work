package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Repository.StockConnectionProvider;
import Repository.PlayerRepository;
import Models.Stock;

public class ImportTickerandStockName
	{

	public static void main(String[] args)
	{

		new ImportTickerandStockName( "S&P500Stocks.csv" );
	}
	private Repository.PlayerRepository stockRepository;
	public ImportTickerandStockName( String filename )
	{

		stockRepository = new PlayerRepository( StockConnectionProvider.createConnection() );

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
	} 
	catch (FileNotFoundException e) 
	{
// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	return null;
	}
	}