package web;

import io.StockReader;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import models.*;
import data.*;

public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "Player" ) );
        out.println("<body>");
        
        String pathInfo = request.getPathInfo();
        
        if ( pathInfo == null || pathInfo.equals("/") )
        {
	        out.println("<h1>Player</h1>");
	        out.println("<table border='1'>");
	        List<Players> players = playerRepository.get();
	        if ( players.size() > 0 )
	        {
	        	out.println( "<tr><th>Player</th><th>Bank</th></tr>" );
	        }
	        for ( Players players : players )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + players.getPlayerName() + "</td>" );
	        	out.println( "<td>" + players.getCost() + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");
        }
        else
        {
        	
        	if (  )
        	{
        		
        	}
        	else
        	{
        		
        	}
        }
	    out.println("</body>");
        out.println("</html>");
    }
}