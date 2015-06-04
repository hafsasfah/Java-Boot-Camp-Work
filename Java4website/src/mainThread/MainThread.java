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
		
		
		stockcontroller.stockrepo.buildStockTable();
		
		//**** CHANGE FILE PATHS BEFORE BUILDING ****\\
		
		File stockNameFile = new File("C:\\Users\\F01000154.CORP-7VMCZW1\\Desktop\\s_p500stocks.csv");
		File stockPriceFile = new File("C:\\Users\\F01000154.CORP-7VMCZW1\\Desktop\\s_p500-2015-06-01.csv");
		
		
		Scanner scannerName = new Scanner(stockNameFile);
		Scanner scannerPrice = new Scanner(stockPriceFile);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		
		//******** Add Names To Database ********\\
		
		while(scannerName.hasNextLine()) //add names
		{
			String line = scannerName.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			String price = (line.substring(line.indexOf(',') + 1));
			stockcontroller.stockrepo.addStockNamesToDatabase(ticker,price, dateFormat.format(date));
		}
		
		//******** Add Prices To Database ********\\
		
		
		while(scannerPrice.hasNextLine()) //add prices
		{
			String line = scannerPrice.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			double price = (Double.parseDouble(line.substring(line.indexOf(',') + 1)));
			stockcontroller.stockrepo.addStockPricesToDatabase(ticker,price);
		}


		scannerName.close();
		scannerPrice.close();
		
		System.out.println("Completed without incident." + dateFormat.format(date));
	}
	
		
}