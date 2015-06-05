package web;



import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import repo.dummyrepo;
import model.*;
import repo.*;

public class StockServlet extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	StockRepo stockRepository = new StockRepo();
    //	dummyrepo stockRepository = new dummyrepo();
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>" );
        out.println("<body>");
        
        
        String requestedTicker = request.getParameter( "ticker" );
        if ( requestedTicker == null )
        {
        
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        List<Stock> stocks = stockRepository.getStockList();
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
        else if( requestedTicker != null ){
        	 out.println("<h1>S&P 500 Stocks</h1>");
 	        out.println("<table border='1'>");
 	        List<Stock> stocks = stockRepository.getStockList();
 	        if ( stocks.size() > 0 )
 	        {
 	        	out.println( "<tr><th>Ticker</th><th>Name</th></tr>" );
 	        }
 	        for ( Stock stock : stocks ) {
 	        	if(stock.getTicker().equals(requestedTicker)){
 	        	out.println( "<tr>" );
 	        	out.println( "<td>" + stock.getTicker() + "</td>" );
 	        	out.println( "<td>" + stock.getName() + "</td>" );
 	        	out.println( "</tr>" );
 	        	}
 	        }
 	        
 	        out.println("</table>");
        }
       
	    out.println("</body>");
        out.println("</html>");
    }
    
    public StringBuilder createTable(List<Stock> stocks){
    	StringBuilder output = new StringBuilder();
    	if ( stocks.size() > 0 )
        {
        	output.append( "<tr><th>Ticker</th><th>Name</th></tr>" );
        }
        for ( Stock stock : stocks )
        {
        	output.append( "<tr>" );
        	output.append( "<td>" + stock.getTicker() + "</td>" );
        	output.append( "<td>" + stock.getName() + "</td>" );
        	output.append( "</tr>" );
        }
        
        output.append("</table>");
        return output;
    }
}