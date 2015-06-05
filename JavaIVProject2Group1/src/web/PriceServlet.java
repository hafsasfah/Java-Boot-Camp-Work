package web;
import java.io.*; 
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import model.*;
import repo.*;


//Add code to add Price to list
public class PriceServlet extends HttpServlet 

{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
		    	StockRepo stockRepository = new StockRepo();
		            	
		    	response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>" );
		        out.println("<body>");
		        
		        //Add price and Date, and be able to search by price and date
		        String requestedTicker = request.getParameter( "ticker" );
		        String requestedDate = request.getParameter( "date" );
		        if ( requestedTicker == null && requestedDate == null )
		        {
		        
			        out.println("<h1>S&P 500 Stocks</h1>");
			        out.println("<table border='1'>");
			        List<Stock> stocks = stockRepository.getStockList();
			        if ( stocks.size() > 0 )
			        {
			        	out.println( "<tr><th>Ticker</th><th>Name</th><td>Price</td></tr>" );
			        }
			        for ( Stock stock : stocks )
			        {
			        	out.println( "<tr>" );
			        	out.printf( "<td>" + stock.getTicker() + "</td>" );
			        	out.printf( "<td>" + stock.getName() + "</td>" );
			        	out.printf( "<td>" + stock.getPrice() + "</td>");
			        	
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
