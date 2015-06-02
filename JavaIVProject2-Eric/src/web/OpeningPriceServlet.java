package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.OpeningPrice;
import data.*;

public class OpeningPriceServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OpeningPriceRepository openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "OpeningPrice" ) );
        
        String requestedTicker = request.getParameter( "ticker" );

        List<OpeningPrice> prices = new ArrayList<OpeningPrice>();
        
        if ( requestedTicker == null )
        {
        	prices.addAll(openingPriceRepository.get());
        }
        else
        {
        	prices.addAll(openingPriceRepository.get(requestedTicker));
        }
        
        buildOpeningPriceTable( prices );
        
        out.println("</body>");
        out.println("</html>");
    }
	
	private String buildOpeningPriceTable( List<OpeningPrice> prices )
	{
		StringBuilder output = new StringBuilder();
		
		output.append("<table border='1'>");
		output.append( "<tr><th>Ticker</th><th>Date</th><th>Price</th></tr>" );
        
        for ( OpeningPrice price : prices )
        {
        	output.append( "<tr>" );
        	output.append( "<td>" + price.getTicker() + "</td>" );
        	output.append( "<td>" + price.getDate() + "</td>" );
        	output.append( "<td>" + price.getPrice() + "</td>" );
        	output.append( "</tr>" );
        }
        output.append("</table>");
        
        return output.toString();
	}
	
}
