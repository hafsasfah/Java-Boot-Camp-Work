package web;

import io.StockReader;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import models.*;
import data.*;

public class StockServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        StockRepository stockRepository = new StockRepository( StockConnectionProvider.createConnection() );
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "Stock" ) );
        out.println("<body>");
        
        
        String requestedTicker = request.getParameter( "ticker" );
        if ( requestedTicker == null )
        {
        
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        List<Stock> stocks = stockRepository.get();
	        if ( stocks.size() > 0 )
	        {
	        	out.println( "<tr><th>Ticker</th><th>Name</th></tr>" );
	        }
	        for ( Stock stock : stocks )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + stock.getTicker() + "</td>" );
	        	out.println( "<td>" + stock.getName() + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");
        }
        else
        {
        	Stock stock = stockRepository.get( requestedTicker );
        	if ( stock == null )
        	{
        		out.println( requestedTicker + " was not found" );
        	}
        	else
        	{
        		out.println( stock.getTicker() + " " + stock.getName() );
        	}
        }
	    out.println("</body>");
        out.println("</html>");
    }
}