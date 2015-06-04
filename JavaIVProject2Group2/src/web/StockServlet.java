package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Stock;
import Repository.StockConnectionProvider;
import Repository.StockRepository;

public class StockServlet extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	
    	StockRepository stockRepository = new StockRepository( StockConnectionProvider.createConnection() );
    	
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //out.println(ServletHelper.createHead( "Stock" ) );
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");
        
        String pathInfo = request.getPathInfo();
        
        if ( pathInfo == null || pathInfo.equals("/") )
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
        	String requestedTicker = pathInfo.substring( pathInfo.indexOf('/') + 1);
        	
        	Stock stock = stockRepository.get(requestedTicker) ;
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

