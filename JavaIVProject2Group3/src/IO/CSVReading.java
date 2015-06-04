package IO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Stocks;

public class CSVReading {
	  Scanner scanner;
	  public static void main(String[] args) {
	 
		CSVReading obj = new CSVReading();
		obj.run();
	 
	  }
	 
	  public List<Stocks> run() {
	 
		String csvFile = "S&P500Stocks.csv";
		BufferedReader br = null;
		String linek = "";
		String csvSplitBy = ",";
	 
		try {
			scanner = new Scanner(csvFile);
			List<Stocks> stocks = new ArrayList<Stocks>();
			
			if (scanner.hasNext())
			{
				String headerLineToIgnore = scanner.nextLine();
			}
			
			while (scanner.hasNext())
			{
				String line = scanner.nextLine();
				int firstCommaIndex = line.indexOf(',');
				String ticker = line.substring(0, firstCommaIndex );
				String name = line.substring(firstCommaIndex + 1).replace("\"", "");
				stocks.add( new Stocks(ticker, name) );
			}
			scanner.close();
			return stocks;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		/*
		
		
		try {
	 
			br = new BufferedReader(new FileReader(csvFile));
			while ((linek = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] country = linek.split(csvSplitBy);
	 
				System.out.println("Country [code= " + country[4] 
	                                 + " , name=" + country[5] + "]");
	 
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	 
		
	  }
	  */
	  }
}