package io;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import models.*;
import data.*;


public class OpeningPriceReader {
	
	public static void main(String[] args)
	{
		new OpeningPriceReader( "C:\\Users\\Eric\\Desktop\\S&P500-2015-06-02.csv", "2015-06-02" );
	}

	private OpeningPriceRepository openingPriceRepository;
	private String filename;
	private String date;
	
	public OpeningPriceReader( String filename, String date )
	{
		this.filename = filename;
		this.date = date;
		
		openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
		
		for ( OpeningPrice openingPrice : read( ) )
		{
			openingPriceRepository.create( openingPrice );
		}
	}
	
	public List<OpeningPrice> read( )
	{
		File stockFile = new File( filename );
		Scanner scanner;
		try 
		{
			scanner = new Scanner(stockFile);
			List<OpeningPrice> openingPrices = new ArrayList<OpeningPrice>();
			if ( scanner.hasNext() )
			{
				String headerLineToIgnore = scanner.nextLine();
			}
			while ( scanner.hasNext() )
			{
				String line = scanner.nextLine();
				int firstCommaIndex = line.indexOf(',');
				String ticker = line.substring(0, firstCommaIndex );
				double price = Double.parseDouble( line.substring(firstCommaIndex + 1) );
				openingPrices.add( new OpeningPrice( ticker, date, price) );
			}
			scanner.close();
			return openingPrices;
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
