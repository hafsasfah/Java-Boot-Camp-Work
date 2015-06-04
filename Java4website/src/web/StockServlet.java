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

public class StockServlet extends HttpServlet{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	   
		throws IOException, ServletException
			    {
		   			Connection connection = null;
		   			
					try
					{
						Class.forName("org.postgresql.Driver");
						
						String url = "jdbc:postgresql://localhost/Stocks";
						String username = "postgres";
						String password = "Citylost2";
						
						connection = DriverManager.getConnection(url, username, password);	
					}
					catch(Exception E)
					{
						E.printStackTrace();
						System.out.print("You messed up in the servlet.");
					}
			        
			    	response.setContentType("text/html");
			        PrintWriter out = response.getWriter();
			        out.println("<html><head><title>Stock Sheet Check</title>");
			        out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
			        out.println("</head>");
			        out.println("<body>");
			        
			        String pathInfo = request.getPathInfo();
			        
			        if ( pathInfo == null || pathInfo.equals("/") )
			        {
				        out.println("<h1>S&P 500 Stocks Check</h1>");
				        out.println("<div class=\"container\">");
				        out.println("<table class=\"table\">");
				        
				        
				        List<StockModel> stocks = new ArrayList<StockModel>();
				        
				        
				        try
				        {
							Statement statement = connection.createStatement();
							//String query = String.format("select \"Name\", \"CompanyName\" from \"StocksSecond\"" );
							
							String query = String.format("select \"Name\", \"CompanyName\" from \"Stocks\"" );
							ResultSet results = statement.executeQuery(query);
					        
					        while(results.next())
					        {
					        	stocks.add(new StockModel(results.getString(1), results.getString(2)));
					        }
					        
				        }
			    		catch (SQLException e) 
				        {
						e.printStackTrace();
				        }
				        
			        	out.println( "<tr>" );
			        	out.println( "<td>Ticker Symbol</td>" );
			        	out.println( "<td>Company Name</td>" );
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
