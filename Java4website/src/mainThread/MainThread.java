package mainThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import stockcontroller.StockController;
import Stockrepo.StockRepo;

public class MainThread 
{
	
	public static void main(String[] args) throws FileNotFoundException
	{

		StockController stockcontroller = new StockController();
		
		//**** DO NOT BUILD TABLE IF IT ALREADY EXISTS ****\\
		
		
		//stockcontroller.pricerepo.buildStockTable();
		
		//**** CHANGE FILE PATHS BEFORE BUILDING ****\\
		
		File stockNameFile = new File("C:\\Users\\F01000154.CORP-9ML9LV1\\Documents\\GitHub\\gecjdss\\Java4website\\stockinfo\\stockprices2.csv");
		
		
		Scanner scannerPrice = new Scanner(stockNameFile);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		
		//******** Add Names To Database ********\\
		/*
		while(scannerName.hasNextLine()) //add names
		{
			String line = scannerName.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			String price = (line.substring(line.indexOf(',') + 1));
			stockcontroller.stockrepo.addStockNamesToDatabase(ticker,price); //, dateFormat.format(date)
		}
		*/
		//******** Add Prices To Database ********\\
		
		
		while(scannerPrice.hasNextLine()) //add prices
		{
			String line = scannerPrice.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			double price = (Double.parseDouble(line.substring(line.indexOf(',') + 1)));
			stockcontroller.pricerepo.addStockPricesToDatabase(ticker,price, "02/06/2015");
		}


		scannerPrice.close();
		
		System.out.println("Completed without incident." + dateFormat.format(date));
	}
	
		
}