package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PlayerModel.PlayerModel;
import PlayerRepo.PlayerRepo;
import Stockrepo.StockConnectionProvider;

public class PlayerServlet 
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		
		PlayerRepo playerRepository = new PlayerRepo(StockConnectionProvider.createConnection() );
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<link rel=\"stylesheet\" href=\"../../bootstrap.min.css\" />");
        out.println("</head>");
        out.println("<body>");
        
        String pathInformation = request.getPathInfo();
		
        if( pathInformation == null || pathInformation.equals("/"))
        {
        	
        	out.println("<h1>Players</h1>");
        	List<PlayerModel> players = playerRepository.getAllPlayers();
        	
        	if(players.size() > 0)
        	{
        		
        		out.println("<tr><th>Name</th> <th>Cash</th></tr>");
        		
        	}
        	
        	for(PlayerModel player : players)
        	{
        		
        		out.println( "<tr>" );
	        	out.println( "<td>" + player.getThePlayerName()+ "</td>" );
	        	out.println( "<td>" + String.format( "%.2f", player.getThePlayerCash()) + "</td>" );
	        	out.println( "</tr>" );
        		
        	}
        	
        	out.println("</table>");
        	
        }
        
        
        
        
		
	}
	
	
	
	
	
	
	
	

}
