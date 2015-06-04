package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Stocks;
import databases.StockPricesTable;

public class ImportStockPrices {
	public static void main(String []args){
		new ImportStockPrices("C:\\Users\\F01000154.CORP-GT0N8W1\\Documents\\GitHub\\gecjdss\\JavaIVProject2Group3\\s_p500-2015-06-01.csv","2015-06-02");
			}
	
private StockPricesTable prices;
private String filename;
private String date;
	
	public ImportStockPrices( String filename, String date){
		this.filename=filename;
		this.date
		
		prices=new StockPricesTable();
		for (Stocks stock: read( filename))
		{
			prices.create( stock );
		}
	}

		public List<Stocks>read ( String filename1 ){
			File filename = new File( filename1 );
			Scanner scanner;
			try 
			{
				scanner = new Scanner(filename);
				List<Stocks> stocks = new ArrayList<Stocks>();
				if ( scanner.hasNext() )
				{
					String headerLineToIgnore = scanner.nextLine();
				}
				while ( scanner.hasNext() )
				{
					String line = scanner.nextLine();
					int firstCommaIndex = line.indexOf(',');
					String ticker = line.substring(0, firstCommaIndex );
					String name = line.substring(firstCommaIndex + 1).replace("\"", "");
					stocks.add( new Stocks(ticker, name) );
				}
				scanner.close();
				return stocks;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;
		}
		
}


}
