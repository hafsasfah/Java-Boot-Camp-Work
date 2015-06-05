package web;




import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import Models.Player;
import Repository.FakePlayerRepo;
import Repository.StockConnectionProvider;
import Models.*;
import data.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {

            	
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //out.println( ServletHelper.createHead( "Player" ) );
        out.println("<body>");
        
        String pathInfo = request.getPathInfo();
        
        if ( Player.size() > 0 )
        {
        	FakePlayerRepo playerRepository = new FakePlayerRepo ();
	        out.println("<h1>Player</h1>");
	        out.println("<table border='1'>");
	        List<Player> players = FakePlayerRepo.get();
	        if ( players.size() > 0 )
	        {
	        	out.println( "<tr><th>Player</th><th>Bank</th></tr>" );
	        }
	        for ( Player player : players )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + player.getUserName() + "</td>" );
	        	out.println( "<td>" + player.getCash() + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");}
        
        else
        {
        	String requestedPlayer = pathInfo.substring( 1 );
        	
        	List<Player> player = FakePlayerRepo.get() ;
        	if ( player == null )
        	{
        		out.println( requestedPlayer + " was not found" );
        	}
        	else
        	{
        		out.println( ((Player) player).getUserName() + " " + ((Player) player).getCash() );
        	}
        }
	    out.println("</body>");
        out.println("</html>");
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    {
		FakePlayerRepo playerRepository = new FakePlayerRepo( );
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        
        Map<String, String[]> parameterMap = request.getParameterMap();
        
        if ( parameterMap.containsKey("name") )
        {
        	Player player = new Player( parameterMap.get("name")[0], 1500 );

        	if ( playerRepository.create( player ) )
        	{
        		out.println("Created Player!");
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

