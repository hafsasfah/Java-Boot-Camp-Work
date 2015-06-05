package web;



import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import controller.StockController;
import repo.BuyerRepo;
import repo.dummyrepo;
import model.*;
import repo.*;

public class StocksOwnedServlet extends HttpServlet 
{
	Map<Stock,Integer> ownedStocks;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	BuyerRepo buyerRepo = new BuyerRepo();
    	//dummyrepo stockRepository = new dummyrepo();
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>" );
        out.println("<body>");
        
        
        String requestedTicker = request.getParameter( "ticker" );
        String requestedName = request.getParameter( "buyerName" );
        if ( requestedTicker == null && requestedName == null)
        {
        
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        List<Person> buyers = buyerRepo.getBuyerList();
	        if ( buyers.size() > 0 )
	        {
	        	out.println( "<tr><th>Ticker</th><th>Stock Name</th><th>Buyer Name</th><th>Amount owned</th></tr>" );
	        }
	        for ( Person buyer : buyers ){
	        	ownedStocks = buyer.getStocks();
	        	for(Stock stock:ownedStocks.keySet())
		        
		        
		        {
		        	out.println( "<tr>" );
		        	out.println( "<td>" + stock.getTicker() + "</td>" );
		        	out.println( "<td>" + stock.getName() + "</td>" );
		        	out.println( "<td>" + buyer.getName() + "</td>" );
		        	out.println( "<td>" + ownedStocks.get(stock) + "</td>" );
		        	out.println( "</tr>" );
		        }
	        }
		        
		        out.println("</table>");
        }
       if(requestedTicker != null && requestedName == null){

           
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        List<Person> buyers = buyerRepo.getBuyerList();
	        if ( buyers.size() > 0 )
	        {
	        	out.println( "<tr><th>Ticker</th><th>Stock Name</th><th>Buyer Name</th><th>Amount owned</th></tr>" );
	        }
	        for ( Person buyer : buyers ){
	        	ownedStocks = buyer.getStocks();
	        	for(Stock stock:ownedStocks.keySet()){
	        		if(stock.getTicker().equals(requestedTicker)){
		        
		        
		        
			        	out.println( "<tr>" );
			        	out.println( "<td>" + stock.getTicker() + "</td>" );
			        	out.println( "<td>" + stock.getName() + "</td>" );
			        	out.println( "<td>" + buyer.getName() + "</td>" );
			        	out.println( "<td>" + ownedStocks.get(stock) + "</td>" );
			        	out.println( "</tr>" );
	        		}
		        }
		      }
		        
		        out.println("</table>");
        
        
	        
       }
       if(requestedTicker == null &&requestedName != null){
    	   out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	    List<Person> buyers = buyerRepo.getBuyerList(requestedName);
	    if ( buyers.size() > 0 )
	    {
	    	
	    	out.println( "<tr><th>Ticker</th><th>Stock Name</th><th>Buyer Name</th><th>Amount owned</th></tr>" );
	    }
	    for ( Person buyer : buyers ){
	    	ownedStocks = buyer.getStocks();
	    	for(Stock stock:ownedStocks.keySet())
	        
	        
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + stock.getTicker() + "</td>" );
	        	out.println( "<td>" + stock.getName() + "</td>" );
	        	out.println( "<td>" + buyer.getName() + "</td>" );
	        	out.println( "<td>" + ownedStocks.get(stock) + "</td>" );
	        	out.println( "</tr>" );
	        }}
	        
	        out.println("</table>");
	   
	}

        if(requestedName != null && requestedTicker != null ){
        	  out.println("<h1>S&P 500 Stocks</h1>");
  	        out.println("<table border='1'>");
       List<Person> buyers = buyerRepo.getBuyerList(requestedName);
	    if ( buyers.size() > 0 )
	    {
	    	out.println( "<tr><th>Ticker</th><th>Stock Name</th><th>Buyer Name</th><th>Amount owned</th></tr>" );
	    }
	    for ( Person buyer : buyers ){
	    	ownedStocks = buyer.getStocks();
	    	for(Stock stock:ownedStocks.keySet()){
	    		if (stock.getTicker().equals(requestedTicker)){
	        	out.println( "<tr>" );
	        	out.println( "<td>" + stock.getTicker() + "</td>" );
	        	out.println( "<td>" + stock.getName() + "</td>" );
	        	out.println( "<td>" + buyer.getName() + "</td>" );
	        	out.println( "<td>" + ownedStocks.get(stock) + "</td>" );
	        	out.println( "</tr>" );
	    		}
	        }
	    }
	        
	        out.println("</table>");}
	    out.println("</body>");
        out.println("</html>");
    } 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    {
		StockController sc = new StockController();
    	System.out.println("Accessed post method");
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        
        String requestedName = request.getParameter( "name" );
        String requestedTicker = request.getParameter( "ticker" );
        String requestedNumberOwned = request.getParameter( "numberOwned" );
        
        if ( requestedName!=null && requestedTicker!=null && requestedNumberOwned!=null)
        {
        	System.out.println("Found name");
        	Person player = new Person( requestedName, 2000 );
        	if ( sc.buyStock(requestedName, requestedTicker, Integer.parseInt(requestedNumberOwned))){
        		out.println("Stock Bought!");
        	}
        	else{
        		out.println("Error buying Stock");
        	}
        }
        else{
        	out.println("No name was given.");
        }
    }
}