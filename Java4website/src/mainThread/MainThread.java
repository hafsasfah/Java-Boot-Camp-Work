package mainThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Stockrepo.StockRepo;

public class MainThread 
{
	
	StockRepo testRepo;
	
	public static void main(String[] args) throws FileNotFoundException
	{

		StockRepo testRepo2 = new StockRepo();
		testRepo2.buildStockTable();
		
		File scorefile = new File("C:\\Users\\F01000154.CORP-7VMCZW1\\Documents\\GitHub\\gecjdss\\Java4website\\stockinfo\\stocknames.csv");
		//change file based on operation
		Scanner scanner = new Scanner(scorefile);
		
		while(scanner.hasNextLine()) //add names
		{
			String line = scanner.nextLine();
			String ticker = line.substring(0, line.indexOf(','));
			String price = (line.substring(line.indexOf(',') + 1));
			//testRepo2.addStockManual(ticker,price);
			System.out.println(ticker + price);

		}

		scanner.close();
	}
	
		
}