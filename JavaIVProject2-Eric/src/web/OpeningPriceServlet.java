package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.*;

public class OpeningPriceServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		//OpeningPriceRepository openingPriceRepository = new OpeningPriceRepository( StockConnectionProvider.createConnection() );
    	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "OpeningPrice" ) );
        out.println("</html>");
    }
	
}
