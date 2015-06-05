package web;

import IO.ImportStockReader;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.*;
import databases.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.*;
import databases.*;

public class UserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
    {
        UserTable userTable = new UserTable( );
            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( ServletHelper.createHead( "Stock" ) );
        out.println("<body>");
        
        String pathInfo = request.getPathInfo();
        
        if ( pathInfo == null || pathInfo.equals("/") )
        {
	        out.println("<h1>Users</h1>");
	        out.println("<table border='1'>");
	        List<User> users = userTable.get();
	        if ( users.size() > 0 )
	        {
	        	out.println( "<tr><th>Name</th><th>Money</th></tr>" );
	        }
	        for ( User user : users )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + user.getUserName() + "</td>" );
	        	out.println( "<td>" + String.format( "%.2f", user.getCash()) + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");
        }
        else
        {
        	String requestedUser = pathInfo.substring( 1 );
        	
        	User user = userTable.getSingleUser(requestedUser) ;
        	if ( user == null )
        	{
        		out.println( requestedUser + " was not found" );
        	}
        	else
        	{
        		out.println( user.getUserName() + " " + user.getCash() );
        	}
        }
	    out.println("</body>");
        out.println("</html>");
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    {
		UserTable userTable = new UserTable();
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        
        Map<String, String[]> parameterMap = request.getParameterMap();
        
        if ( parameterMap.containsKey("name") )
        {
        	User user = new User( parameterMap.get("name")[0], Integer.parseInt(parameterMap.get("userID")[0]));
        	if ( userTable.create(user))
        	{
        		out.println("User Created! (Hopefully)");
        	}
        	else
        	{
        		out.println("Something bad happened!!!");
        	}
        }
        else
        {
        	out.println("You have to have a name parameter!");
        }
    }
	
	
}