package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class FileIO {
 
  public static void main(String[] args) {
 
	FileIO obj = new FileIO();
	obj.run();
 
  }
 
  public void run() {
 
	String csvFile = "S&P500Stocks.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String[] stocks = line.split(cvsSplitBy);
 
			System.out.println("Stocks [Ticker Symbol = " + stocks[0] 
                                 + " , name=" + stocks[1] + "]");
 
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
 
	System.out.println("Done");
  }
 
}