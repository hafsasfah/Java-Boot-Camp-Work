package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Player;
import Models.Stock;
import Repository.PlayerRepository;
import Repository.StockConnectionProvider;
import Repository.StockRepository;

public class PlayerServlet extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	
    	PlayerRepository pRepository = new PlayerRepository( StockConnectionProvider.createConnection() );
    	
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(ServletHelper.createHead( "Player" ) );
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");
        
        String pathInfo = request.getPathInfo();
        
        if ( pathInfo == null || pathInfo.equals("/") )
        {
	        out.println("<h1>S&P 500 Stocks</h1>");
	        out.println("<table border='1'>");
	        List<Player> player = PlayerRepository.get();
	        
	        if ( player.size() > 0 )
	        {
	        	out.println( "<tr><th>Money</th><th>Name</th></tr>" );
	        }
	        for ( Player name : player )
	        {
	        	out.println( "<tr>" );
	        	out.println( "<td>" + ((Player) player).getMoney() + "</td>" );
	        	out.println( "<td>" + ((Player) player).getName() + "</td>" );
	        	out.println( "</tr>" );
	        }
	        
	        out.println("</table>");
        }
        else
        {
        	String requestedTicker = pathInfo.substring( pathInfo.indexOf('/') + 1);
        	
        	 player = PlayerRepository.get(player) ;
        	if ( player == null )
        	{
        		out.println( requestedTicker + " was not found" );
        	}
        	else
        	{
        		out.println( stock.getTicker() + " " + player.getName() );
        	}
        }
	    out.println("</body>");
        out.println("</html>");
    }

}