package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StockModel.OwnedStock;
import StockModel.StockModel;
import Stockrepo.OpeningPriceRepo;
import Stockrepo.OwnedStockRepo;
import Stockrepo.StockConnectionProvider;

public class OwnedStockServlet extends HttpServlet 
{
/**
 * 
 */
private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		OwnedStockRepo ownedstockrepo = new OwnedStockRepo(StockConnectionProvider.createConnection());
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
	    out.println("</head>");
	    out.println("<body>");
	    
	    Map<String, String[]> parameterMap = request.getParameterMap();
	
	    List<OwnedStock> prices = new ArrayList<OwnedStock>();
	    
	    String ticker = "ticker";
	    String player = "player";
	    
	    boolean requestByTicker = parameterMap.containsKey(ticker);
	    boolean requestPlayer = parameterMap.containsKey(player);
	    
	    
	    if (requestByTicker)
	    {
	    	out.println("request ticker");
	    	prices.addAll(ownedstockrepo.getOwnedStocksForTicker(parameterMap.get(ticker)[0]));
	    	
	    }
	    else if ( requestPlayer )
	    {
	    	out.println("request date");
	    	prices.addAll(ownedstockrepo.getOwnedStocksForSinglePlayer(parameterMap.get(player)[0]));
	    }
	    else
	    {
	    	out.println("request all");
	    	prices.addAll(ownedstockrepo.get());
	    }
	    
	    out.println (buildOpeningPriceTable(prices));
	    
	    out.println("</body>");
	    out.println("</html>");
	}
	
	private String buildOpeningPriceTable(List<OwnedStock> prices)
	{
		StringBuilder output = new StringBuilder();
		
		output.append("<table border='1'>");
		output.append( "<tr><th>Ticker</th><th>Player</th><th>Amount Owned</th></tr>" );
		
	    
	    for ( OwnedStock price : prices )
	    {
	    	output.append( "<tr>" );
	    	output.append( "<td>" + price.getPlayer() + "</td>" );
	    	output.append( "<td>" + price.getTicker() + "</td>" );
	    	output.append( "<td>" + price.getOwned() + "</td>" );
	    	output.append( "</tr>" );
	    }
	    output.append("</table>");
	    
	    return output.toString();
	}
	
}
