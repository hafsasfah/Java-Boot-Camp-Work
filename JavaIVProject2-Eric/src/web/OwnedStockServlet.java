package web;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.*;
import data.*;

public class OwnedStockServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OwnedStockRepository ownedStockRepository = new OwnedStockRepository( StockConnectionProvider.createConnection() );
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "Stock" ) );
        out.println("<body>");
        
        String pathInfo = request.getPathInfo();
        
        if ( pathInfo == null || pathInfo.equals("/") )
        {
	        out.println("<h1>Players</h1>");
	        out.println("<table border='1'>");
	        List<OwnedStock> ownedStocks = ownedStockRepository.get();
	        out.println( "<tr><th>Player</th><th>Ticker</th><th>Number Owned</th></tr>" );
	        
	        for ( OwnedStock ownedStock : ownedStocks )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + ownedStock.getPlayerName() + "</td>" );
	        	out.println( "<td>" + ownedStock.getTicker() + "</td>" );
	        	out.println( "<td>" + ownedStock.getNumberOwned() + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");
        }
        else
        {
        	/*String requestedPlayer = pathInfo.substring( 1 );
        	
        	Player player = playerRepository.getSinglePlayer(requestedPlayer) ;
        	if ( player == null )
        	{
        		out.println( requestedPlayer + " was not found" );
        	}
        	else
        	{
        		out.println( player.getName() + " " + player.getMoney() );
        	}*/
        }
	    out.println("</body>");
        out.println("</html>");
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    {
		OwnedStockRepository ownedStockRepository = new OwnedStockRepository( StockConnectionProvider.createConnection() );
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        
        Map<String, String[]> parameterMap = request.getParameterMap();
        
        if ( parameterMap.containsKey("ticker") && parameterMap.containsKey("playerName")  && parameterMap.containsKey("numberOwned") )
        {
        	PlayerRepository playerRepository = new PlayerRepository( StockConnectionProvider.createConnection() );
        	Player player = playerRepository.getSinglePlayer( parameterMap.get("playerName")[0] );
        	
        	OpeningPriceRepository openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
        	Date date = Calendar.getInstance().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String today = sdf.format(date);
        	List<OpeningPrice> openingPrice = openingPriceRepository.getByTickerAndDate(parameterMap.get("ticker")[0], today ); 	
        	
        	if ( openingPrice.size() > 0 )
        	{
        		double todaysOpeningPrice = openingPrice.get(0).getPrice();
        		double costOfStock = todaysOpeningPrice * Integer.parseInt(parameterMap.get("numberOwned")[0] );
        		if ( player.getMoney() > costOfStock )
        		{
	        		if ( ownedStockRepository.create( new OwnedStock( parameterMap.get("playerName")[0], parameterMap.get("ticker")[0],
	            			Integer.parseInt(parameterMap.get("numberOwned")[0] ) ) ) )
	            	{
	            		out.println("Created OwnedStock!");
	            		player.setMoney( player.getMoney() - costOfStock );
	            		playerRepository.update(player);
	            	}
	            	else
	            	{
	            		out.println("Something bad happened!!!");
	            	}
        		}
        		else
        		{
        			out.println("Player does not have enough money to buy " + parameterMap.get("ticker")[0] );
        		}
        	}
        	else
        	{
        		out.println("No price data found for stock: " + parameterMap.get("ticker")[0] );
        	}
        }
        else
        {
        	out.println("You have to have a ticker and playerName and numberOwned parameter!");
        }
    }
	
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OwnedStockRepository ownedStockRepository = new OwnedStockRepository( StockConnectionProvider.createConnection() );
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        String playerName;
        String ticker;
        int numberOwned;
        
        try
        {
        	BufferedReader br = new BufferedReader( new InputStreamReader( request.getInputStream() ) );
        	String data = br.readLine();
        	
        	String[] keyValuePairs = data.split("&");
        	
        	Map<String,String> putData = new HashMap<String,String>();
        	
        	for ( String keyValuePair : keyValuePairs )
        	{
        		String[] splitLine = keyValuePair.split("=");
        		putData.put(splitLine[0], splitLine[1]);
        	}
        	
        	if ( putData.containsKey("playerName") && putData.containsKey("ticker") && putData.containsKey("numberOwned") )
        	{
        		ownedStockRepository.update( new OwnedStock( putData.get("playerName"), 
        				putData.get("ticker"), Integer.parseInt( putData.get("numberOwned") ) ) );
        	}
        	
        	else
        	{
        		
        		out.println( "You must provide a playerName, ticker and numberOwned!");
        	}
        		
        	
        }
        catch ( Exception e )
        {
        	out.println( "Couldn't real input stream request params" );
        }
        
    }
	
}
