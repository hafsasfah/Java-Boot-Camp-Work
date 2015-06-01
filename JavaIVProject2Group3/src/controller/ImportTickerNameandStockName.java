package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportTickerNameandStockName {
	
	public static void ImportTickerNameandStockName () throws FileNotFoundException {
	        Scanner scanner = new Scanner(new File("s_p500stocks.csv"));
	        scanner.useDelimiter(",");
	        while(scanner.hasNext()){
	            System.out.print(scanner.next()+"|");
	        }
	        scanner.close();
	    }
	public static void main (String args[]) throws FileNotFoundException{
		ImportTickerNameandStockName();
}
}
