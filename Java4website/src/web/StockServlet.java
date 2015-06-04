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
import java.sql.Date;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StockModel.StockModel;

public class StockServlet extends HttpServlet{
	
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	   
		throws IOException, ServletException
			    {
		   			Connection connection = null;
		   			
					try
					{
						Class.forName("org.postgresql.Driver");
						
						String url = "jdbc:postgresql://localhost/Stocks";
						String username = "postgres";
						String password = "dragon";
						
						connection = DriverManager.getConnection(url, username, password);	
					}
					catch(Exception E)
					{
						E.printStackTrace();
						System.out.print("You messed up now.");
					}
			        
			    	response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html><head><title>Stock Sheet</title>");
			        out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
			        out.println("</head>");
			        out.println("<body>");
			        
			        String pathInfo = request.getPathInfo();
			        
			        if ( pathInfo == null || pathInfo.equals("/") )
			        {
				        out.println("<h1>S&P 500 Stocks</h1>");
				        out.println("<div class=\"container\">");
				        out.println("<table class=\"table-condensed\">");
				        List<StockModel> stocks = new ArrayList<StockModel>();
				        try
				        {
							Statement statement = connection.createStatement();
							//String query = String.format("select \"Name\", \"CompanyName\" from \"StocksSecond\"" );
							
							String query = String.format("select \"Name\", \"CompanyName\", \"CurrentPrice\", \"Date\" from \"Stocks\"" );
							ResultSet results = statement.executeQuery(query);
					        
					        while(results.next())
					        {
					        	stocks.add(new StockModel(results.getString(1), results.getString(2), results.getInt(3), results.getString(4)));
					        }
				        }
			    		catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        	out.println( "<tr>" );
			        	out.println( "<td>Ticker Symbol</td>" );
			        	out.println( "<td>Company Name</td>" );
			        	out.println( "<td>Stock Price</td>" );
			        	out.println( "<td>Date</td>" );
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
