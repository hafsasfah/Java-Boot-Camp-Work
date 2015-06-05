package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PlayerModel.PlayerModel;
import PlayerRepo.PlayerRepo;
import StockModel.OwnedStock;
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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		OwnedStockRepo ownedstockrepo = new OwnedStockRepo(StockConnectionProvider.createConnection());
		//PlayerRepo playerRepository = new PlayerRepo(StockConnectionProvider.createConnection());
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        try
        {
        	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        	String data = br.readLine();
        	
        	String[] keyValuePairs = data.split("&");
        	
        	
        	Map<String,String> putData = new HashMap<String,String>();
        	
        	for (String keyValuePair : keyValuePairs)
        	{
        		String[] splitLine = keyValuePair.split("=");
        		putData.put(splitLine[0], splitLine[1]);
        	}
        	
        	if (putData.containsKey("name") && putData.containsKey("ticker") && putData.containsKey("numberOwned"))
        	{
        		if(ownedstockrepo.addStockToDatabase(new OwnedStock(putData.get("ticker"), putData.get("name"), Integer.parseInt(putData.get("numberOwned")))))
        		{
        			out.println("Owned Stock Recorded!");
        		}
        		else
        		{
        			out.println("Couldn't record stock transaction!");
        		}
        	}
        	
        	else if (putData.containsKey("name") && putData.containsKey("ticker") || putData.containsKey("numberOwned"))
        	{
        		out.println("Ya got something at least.");
        	}
        	
        	else
        	{
        		
        		out.println("Can't read all fields!");
        	}
        		
        	
        }
        catch ( Exception e )
        {
        	out.println( "Couldn't get requested info." );
        }
		
	}
}
