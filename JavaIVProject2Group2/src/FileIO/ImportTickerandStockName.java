package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
	
public class ImportTickerandStockName {

	public static void ImportTickerandStockName () throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("s&p500stocks.csv"));
	scanner.useDelimiter(",");
	while(scanner.hasNext()){
	System.out.print(scanner.next()+"|");
	}

	scanner.close();

	}
	
	public static void main (String args[]) throws FileNotFoundException{
	ImportTickerandStockName();
	}
	}