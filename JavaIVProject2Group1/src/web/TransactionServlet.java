package web;
import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;
import model.Transactions;
import repo.dummyrepo;

public class TransactionServlet extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws IOException, ServletException
			    {
			    	dummyrepo stockRepository = new dummyrepo();
			            	
			    	response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html>" );
			        out.println("<body>");
			        
			        
			        String requestedTicker = request.getParameter( "ticker" );
			        if ( requestedTicker == null )
			        {
			        
				        out.println("<h1>S&P 500 Stocks</h1>");
				        out.println("<table border='1'>");
				        List<Transactions> Transactions = stockRepository.getTransactions();
				        if ( Transactions.size() > 0 )
				        {
				        	out.println( "<tr><th>Transactions</th><th>Dates</th></tr>" );
				        }
				        for ( Transactions trasactions : Transactions )
				        {
				        	out.println( "<tr>" );
				        	out.printf( "<td>" + Transactions,(requestedTicker) + "</td>" );
				        	out.printf( "<td>" + Transactions,(requestedTicker)+ "</td>" );
				        	out.println( "</tr>" );
				        }
				        
				        out.println("</table>");
			        }
}
}
