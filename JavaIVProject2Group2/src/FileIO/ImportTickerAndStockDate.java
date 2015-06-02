package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportTickerAndStockDate {
	
	public static void ImportTickerAndStockDate () throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("s&p500-2015-06-01.csv"));
		scanner.useDelimiter(",");
		while(scanner.hasNext()){
		System.out.print(scanner.next()+"|");
		}

		scanner.close();

		}
		
		public static void main (String args[]) throws FileNotFoundException{
			ImportTickerAndStockDate();
		}
}


