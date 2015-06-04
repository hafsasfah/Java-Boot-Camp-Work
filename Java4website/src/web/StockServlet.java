package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StockModel.StockModel;
import Stockrepo.StockConnectionProvider;
import Stockrepo.StockRepo;

public class StockServlet extends HttpServlet{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	   
		throws IOException, ServletException
			    {
					StockRepo stockRepository = new StockRepo( StockConnectionProvider.createConnection() );
		   			
			        
			    	response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html><head><title>Stock Sheet Check</title>");
			        out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
			        out.println("</head>");
			        out.println("<body>");
			        
			        String pathInfo = request.getPathInfo();
			        
			        if ( pathInfo == null || pathInfo.equals("/") )
			        {
				        out.println("<h1>S&P 500 Stocks <br></h1>");
				        out.println("<div class=\"container\">");
				        out.println("<table class=\"table\">");
				        
				        
				        List<StockModel> stocks = stockRepository.getallStocks();
				        
			        	out.println( "<tr>" );
			        	out.println( "<td><b>Company Name</b></td>" );
			        	out.println( "<td><b>Ticker Symbol</b></td>" );
			        	out.println( "</tr>" );
			        	
				        for ( StockModel stock : stocks )
				        {
				        	out.println( "<tr>" );
				        	out.println( "<td>" + stock.getStockName() + "</td>" );
				        	out.println( "<td>" + stock.getCompanyName() + "</td>" );
				        	out.println( "</tr>" );
				        }
				        
				        out.println("</table>");
				        out.println("</div>");
			        }

				    out.println("</body>");
			        out.println("</html>");
			    }

	
	
	
}
