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

import StockModel.StockModel;
import Stockrepo.OpeningPriceRepo;
import Stockrepo.StockConnectionProvider;


public class PriceServlet extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		OpeningPriceRepo openingPriceRepository = new OpeningPriceRepo(StockConnectionProvider.createConnection());
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
        out.println("</head>");
        out.println("<body>");
        
        Map<String, String[]> parameterMap = request.getParameterMap();

        List<StockModel> prices = new ArrayList<StockModel>();
        
        String ticker = "ticker";
        String date = "date";
        
        boolean requestByTicker = parameterMap.containsKey(ticker);
        boolean requestByDate = parameterMap.containsKey(date);
        
        
        if ( requestByTicker && requestByDate )
        {
        	out.println("Double values went this far.");
        	prices.addAll(openingPriceRepository.getByTickerAndDate(parameterMap.get(ticker)[0], parameterMap.get(date)[0] ) );
        	
        }
        else if (requestByTicker)
        {
        	out.println("request ticker");
        	prices.addAll(openingPriceRepository.getByTicker(parameterMap.get(ticker)[0]));
        	
        }
        else if ( requestByDate )
        {
        	out.println("request date");
        	prices.addAll(openingPriceRepository.getByDate(parameterMap.get(date)[0]));
        }
        else
        {
        	out.println("request all");
        	prices.addAll(openingPriceRepository.get());
        }
        
        out.println (buildOpeningPriceTable(prices));
        
        out.println("</body>");
        out.println("</html>");
    }
	
	private String buildOpeningPriceTable(List<StockModel> prices)
	{
		StringBuilder output = new StringBuilder();
		
		output.append("<table border='1'>");
		output.append( "<tr><th>Ticker</th><th>Date</th><th>Price</th></tr>" );
		
        
        for ( StockModel price : prices )
        {
        	output.append( "<tr>" );
        	output.append( "<td>" + price.getStockName() + "</td>" );
        	output.append( "<td>" + price.getDate() + "</td>" );
        	output.append( "<td>" + price.getCurrentPrice() + "</td>" );
        	output.append( "</tr>" );
        }
        output.append("</table>");
        
        return output.toString();
	}
	
}
