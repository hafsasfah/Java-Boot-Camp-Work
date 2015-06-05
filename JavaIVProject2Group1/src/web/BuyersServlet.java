package web;
import java.io.*;
import java.util.*;

	import javax.servlet.*;
import javax.servlet.http.*;

	import repo.dummyrepo;
import model.*;
import repo.*;

public class BuyersServlet extends HttpServlet 
	{

	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException
	    {
	    	dummyrepo stockRepository = new dummyrepo();
	            	
	    	response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>" );
	        out.println("<body>");
	        
	        
	        String requestedName = request.getParameter( "name" );
	        if ( requestedName == null )
	        {
	        
		        out.println("<h1>S&P 500 Stocks</h1>");
		        out.println("<table border='1'>");
		        List<Person> buyers = stockRepository.getbuyers();
		        if ( buyers.size() > 0 )
		        {
		        	out.println( "<tr><th>Name</th><th>Bank</th></tr>" );
		        }
		        for ( Person buyer : buyers )
		        {
		        	out.println( "<tr>" );
		        	out.println( "<td>" + buyer.getName() + "</td>" );
		        	out.println( "<td>" + buyer.getPurse() + "</td>" );
		        	out.println( "</tr>" );
		        }
		        
		        out.println("</table>");
		        
		        
		       
	        }
	        else if( requestedName != null ){
	        	
	        	out.println("<h1>S&P 500 Stocks</h1>");
		        out.println("<table border='1'>");
		        List<Person> buyers = stockRepository.getbuyers();
		        if ( buyers.size() > 0 )
		        {
		        	out.println( "<tr><th>Name</th><th>Bank</th></tr>" );
		        }
		        for ( Person buyer : buyers ) {
		        	if(buyer.getName().equals(requestedName)){
		        	out.println( "<tr>" );
		        	out.println( "<td>" + buyer.getName() + "</td>" );
		        	out.println( "<td>" + buyer.getPurse() + "</td>" );
		        	out.println( "</tr>" );
		        }
		        }
		        
		        out.println("</table>");
		        
		        
		        Person BuyerRepo = new Person(requestedName, 0);
	        	
	        }
	        else
	        {
	     
	        		out.println( requestedName + " was not found" );
	     
	        }
		    out.println("</body>");
	        out.println("</html>");
	        
	    }
	}

