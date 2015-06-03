package model;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
public class StocksServlet extends HttpServlet {

public class StocksServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	    		throws IOException, ServletException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        ServletHelper.createHead("Stocks");
	        out.println("<body>" );
	        out.println("</html>");
	    }
}
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws IOException, ServletException {
        StocksTable stockRepository = new StocksTable();
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(ServletHelper.createHead("Stock"));
        out.println("<body>");
        
        String pathInfo = request.getPathInfo();
        
        if (pathInfo == null || pathInfo.equals("/")) {
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        
	        List<Stocks> stocks = stockRepository.get();
	        
	        if (stocks.size() > 0) {
	        	out.println( "<tr><th>Ticker</th><th>Name</th></tr>" );
	        }
	        
	        for (Stocks stock : stocks) {
	        	out.println("<tr>");
	        	out.println("<td>" + stock.getTicker() + "</td>");
	        	out.println("<td>" + stock.getStockName() + "</td>");
	        	out.println("</tr>");
	        }
	        
	        out.println("</table>");
        }
        







