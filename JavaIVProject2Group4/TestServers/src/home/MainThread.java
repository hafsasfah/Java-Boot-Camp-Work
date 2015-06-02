package home;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainThread 
{
	
	StockRepo testRepo;
	
	public static void main(String[] args) throws FileNotFoundException
	{

		StockRepo testRepo = new StockRepo();
		
		testRepo.buildStockTable();	
		
		File scorefile = new File("C:\\Users\\F01000154.CORP-9ML9LV1\\Documents\\GitHub\\gecjdss\\JavaIVProject2Group4\\TestServers\\stockinfo\\stocknames.csv");
		//File scorefile2 = new File("C:\\Users\\F01000154.CORP-9ML9LV1\\Documents\\GitHub\\gecjdss\\JavaIVProject2Group4\\TestServers\\stockinfo\\stockprices.csv");
		//change file based on operation
		Scanner scanner = new Scanner(scorefile);
		//Scanner scanner2 = new Scanner(scorefile2);
		
		while(scanner.hasNextLine()) //add names
		{
			String line = scanner.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			String price = (line.substring(line.indexOf(',') + 1));
			testRepo.addStockManual(ticker,price);

		}
		
/*
		while(scanner2.hasNextLine()) //add prices
		{
			String line = scanner.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			double price = Double.parseDouble(line.substring(line.indexOf(',') + 1));
			testRepo.addStockPrices(ticker,price);

		}
		*/

		scanner.close();
	}
	
	
	
}
