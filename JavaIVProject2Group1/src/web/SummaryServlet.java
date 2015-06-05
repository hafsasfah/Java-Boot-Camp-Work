package web;
import java.io.*;
import java.util.*;

	import javax.servlet.*;
import javax.servlet.http.*;

	import repo.dummyrepo;
import model.*;
import repo.*;

public class SummaryServlet extends HttpServlet{
	int stocksOwned;
	double value;
	Map<Stock,Integer> stockMap;
	List<Person> buyers;
	

	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException
	    {
	    	BuyerRepo buyerRepo = new BuyerRepo();
	            	
	    	response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>" );
	        out.println("<body>");
	        
	        
	        String requestedName = request.getParameter( "name" );
	        if ( requestedName == null )
	        {
	        
		        out.println("<h1>S&P 500 Stocks</h1>");
		        out.println("<table border='1'>");
		        buyers = buyerRepo.getBuyerList();
		        if ( buyers.size() > 0 )
		        {
		        	out.println( "<tr><th>Name</th><th>Bank</th><th># Stocks Owned</th><th>Value</th><th>Estimated Networth</th></tr>" );
		        }
		        for ( Person buyer : buyers ){
		        	Map<Stock,Integer> stockMap = buyer.getStocks();
	        	int stocksOwned = 0;
	        	double value = 0;
	        	for(Stock stock:stockMap.keySet()){
	        		stocksOwned++;
	        		value+= stockMap.get(stock);
	        		
	        	}
	        	double networth = buyer.getPurse()+value;
	        	
	        	
	        	
	        	
	        	out.println( "<tr>" );
	        	out.println( "<td>" + buyer.getName() + "</td>" );
	        	out.println( "<td>" + buyer.getPurse() + "</td>" );
	        	out.println( "<td>" + stocksOwned + "</td>" );
	        	out.println( "<td>" + value + "</td>" );
	        	out.println( "<td>" + networth + "</td>" );
	        	out.println( "</tr>" );
	        	
     }
		        
		        out.println("</table>");
		        
		        
		        
		        
		       
	        }
	        else if( requestedName != null ){
	        	
	        	out.println("<h1>S&P 500 Stocks</h1>");
		        out.println("<table border='1'>");
		        buyers = buyerRepo.getBuyerList(requestedName);
		        if ( buyers.size() > 0 )
		        {
		        	out.println( "<tr><th>Name</th><th>Bank</th><th># Stocks Owned</th><th>Value</th><th>Estimated Networth</th></tr>" );
		        }
		        for ( Person buyer : buyers ) {
		        	stockMap = buyer.getStocks();
		        	stocksOwned = 0;
		        	value = 0;
		        	for(Stock stock:stockMap.keySet()){
		        		stocksOwned++;
		        		value+= stockMap.get(stock);
		        		
		        	}
		        	double networth = buyer.getPurse()+value;
		        	
		        	
		        	
		        	if(buyer.getName().equals(requestedName)){
		        	out.println( "<tr>" );
		        	out.println( "<td>" + buyer.getName() + "</td>" );
		        	out.println( "<td>" + buyer.getPurse() + "</td>" );
		        	out.println( "<td>" + stocksOwned + "</td>" );
		        	out.println( "<td>" + value + "</td>" );
		        	out.println( "<td>" + networth + "</td>" );
		        	out.println( "</tr>" );
		        }
		        }
		        
		        out.println("</table>");
		        
		        
		   
	        	
	        }
	   
		    out.println("</body>");
	        out.println("</html>");
	        
	    }
	}
	
