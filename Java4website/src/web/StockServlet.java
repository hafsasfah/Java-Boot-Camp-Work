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
			        out.println("<html><head><title>Lonnie is your daddy</title></head>");
			        out.println("<body>");
			        
			        String pathInfo = request.getPathInfo();
			        
			        if ( pathInfo == null || pathInfo.equals("/") )
			        {
				        out.println("<h1>S&P 500 Stocks</h1>");
				        out.println("<table border='1'>");
				        List<StockModel> stocks = new ArrayList<StockModel>();
				        try
				        {
							Statement statement = connection.createStatement();
							String query = String.format("select \"Name\", \"CompanyName\", \"CurrentPrice\", \"Date\" from \"StocksSecond\"" );
							ResultSet results = statement.executeQuery(query);
					        
					        while(results.next())
					        {
					        	stocks.add(new StockModel(4, results.getString(2), 8));
					        }
				        }
			    		catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				        for ( StockModel stock : stocks )
				        {
				        	out.println( "<tr>" );
				        	out.println( "<td>" + stock.getStockName() + "</td>" );
				        	out.println( "<td>" + stock.getStockName() + "</td>" );
				        	out.println( "</tr>" );
				        }
				        
				        out.println("</table>");
			        }

				    out.println("</body>");
			        out.println("</html>");
			    }

}
