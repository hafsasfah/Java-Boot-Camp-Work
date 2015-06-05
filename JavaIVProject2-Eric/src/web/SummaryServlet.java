package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import models.*;
import data.*;

public class SummaryServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OpeningPriceRepository openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
		PlayerRepository playerRepository = new PlayerRepository( StockConnectionProvider.createConnection() );
		OwnedStockRepository ownedStockRepository = new OwnedStockRepository( StockConnectionProvider.createConnection() );
		
		List<Summary> summaries = new ArrayList<Summary>();
		List<OpeningPrice> todayPrices = openingPriceRepository.getByDate( ServletHelper.todaysDate() );
		
		for ( Player player : playerRepository.get() )
		{
			summaries.add( new Summary( player, ownedStockRepository.getOwnedStocksForSinglePlayer( player.getName() ), todayPrices ) );
		}
		
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "Summary" ) );
        out.println("<body>");
        
	    out.println("<h1>Summary</h1>");
	    
	    for ( Summary summary : summaries )
	    {
		    out.println("<h2>Player: " + summary.getPlayer().getName() + " - Net Worth: " + String.format("%.2f", summary.getNetWorth()) + "</h2>");
		    out.println("<h4>Cash: " + String.format("%.2f", summary.getPlayer().getMoney() ) + "</h4>");
		    
		    out.println("<table border='1'>");
		    out.println("<tr>"
		    		+ "<th>Ticker</th>"
		    		+ "<th>Number Owned</th>"
		    		+ "<th>Today's Price per stock</th>"
		    		+ "<th>Total Value</th>"
		    		+ "</tr>");
		    for ( OwnedStock stock : summary.getOwnedStocks() )
		    {
		    	String ticker = stock.getTicker();
		    	int numberOwned = stock.getNumberOwned();
		    	double currentStockPrice = summary.getPriceMap().get( ticker );
		    	
		    	out.println("<tr>");
		    	out.println("<td>" + ticker + "</td>" );
		    	out.println("<td>" + numberOwned + "</td>" );
		    	out.println("<td>" + currentStockPrice + "</td>" );
		    	out.println("<td>" + String.format( "%.2f", currentStockPrice * numberOwned ) + "</td>" );
		    	out.println("</tr>");
		    }
		    
		    out.println("</table>");
	    }
	    
	    out.println("</body>");
        out.println("</html>");
    }
}
