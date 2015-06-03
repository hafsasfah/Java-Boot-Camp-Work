package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StockModel.StockModel;

public class StockServlet extends HttpServlet{
	
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	   
			    throws IOException, ServletException
			    {
			            	
			    	response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html><head><title>Retreiving items from database</title></head>");
			        out.println("<body>");
			        
			        String pathInfo = request.getPathInfo();
			        
			        if ( pathInfo == null || pathInfo.equals("/") )
			        {
				        out.println("<h1>S&P 500 Stocks</h1>");
				        out.println("<table border='1'>");
				        List<StockModel> stocks = new ArrayList<StockModel>();
				        //if ( stocks.size() > 0 )
				        //{
				        	//out.println( "<tr><th>Ticker</th><th>Name</th></tr>" );
				       // }
				        for ( StockModel stock : stocks )
				        {
				        	out.println( "<tr>" );
				        	out.println( "<td>" + stock.getStockName() + "</td>" );
				        	out.println( "</tr>" );
				        }
				        
				        out.println("</table>");
			        }

				    out.println("</body>");
			        out.println("</html>");
			    }

}
