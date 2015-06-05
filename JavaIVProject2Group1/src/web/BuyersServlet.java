package web;
import java.io.*;
import java.util.*;

	import javax.servlet.*;
import javax.servlet.http.*;

import repo.BuyerRepo;
	import repo.dummyrepo;
import model.*;
import repo.*;

public class BuyersServlet extends HttpServlet 
	{
/*	public static void main(String[] args){
		BuyersServlet bs = new BuyersServlet();
		BuyerRepo buyerRepo = new BuyerRepo();
		buyerRepo.newBuyer( new Person("A",2) ) ;
		
	} */

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
		        List<Person> buyers = buyerRepo.getBuyerList();
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
		        List<Person> buyers = buyerRepo.getBuyerList();
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
		        
		        
		       // Person BuyerRepo = new Person(requestedName, 0);
	        	
	        }
	       
	     
		    out.println("</body>");
	        out.println("</html>");
	        
	    }
		public void doPost(HttpServletRequest request, HttpServletResponse response)
	    	    throws IOException, ServletException
	    {
			BuyerRepo buyerRepo = new BuyerRepo();
	    	System.out.println("Accessed post method");
	    	response.setContentType("text/plain");
	        PrintWriter out = response.getWriter();
	        
	        
	        String requestedName = request.getParameter( "name" );
	        
	        if ( requestedName!=null)
	        {
	        	System.out.println("Found name");
	        	Person player = new Person( requestedName, 2000 );
	        	if ( buyerRepo.newBuyer( player ) ){
	        		out.println("Buyer added!");
	        	}
	        	else{
	        		out.println("Error creating player");
	        	}
	        }
	        else{
	        	out.println("No name was given.");
	        }
	    }
	}

