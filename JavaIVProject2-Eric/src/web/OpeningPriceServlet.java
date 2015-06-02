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

import models.OpeningPrice;
import data.*;

public class OpeningPriceServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OpeningPriceRepository openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "OpeningPrice" ) );
        
        Map<String, String[]> parameterMap = request.getParameterMap();

        List<OpeningPrice> prices = new ArrayList<OpeningPrice>();
        String ticker = "ticker";
        String date = "date";
        boolean requestByTicker = parameterMap.containsKey(ticker);
        boolean requestByDate = parameterMap.containsKey(date);
        
        if ( requestByTicker && requestByDate )
        {
        	prices.addAll(openingPriceRepository.getByTickerAndDate( parameterMap.get(ticker)[0], parameterMap.get(date)[0] ) );
        }
        else if ( requestByTicker )
        {
        	prices.addAll(openingPriceRepository.getByTicker(parameterMap.get(ticker)[0]));
        	
        }
        else if ( requestByDate )
        {
        	prices.addAll(openingPriceRepository.getByDate(parameterMap.get(date)[0]));
        }
        else
        {
        	prices.addAll(openingPriceRepository.get());
        }
        
        out.println ( buildOpeningPriceTable( prices ) );
        
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
