package web;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PlayerModel.PlayerModel;
import PlayerRepo.PlayerRepo;
import Stockrepo.StockConnectionProvider;

public class PlayerServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5447183495469656155L;


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
        	
        	out.println("<div class=\"container\"> ");
    		out.println("<table class=\"table\">");
    		
        	if(players.size() > 0)
        	{
        		
        		out.println("<tr><th>Name</th> <th>Cash</th></tr>");
        		
        	}
        	
        	
        	
        	for(int i = 0; i < players.size(); i++)
        	{
        		
        		out.println( "<tr>" );
	        	out.println( "<td>" + players.get(i).getThePlayerName() + "</td>" );
	        	out.println( "<td>" + String.format( "%.2f", players.get(i).getThePlayerCash()) + "</td>" );
	        	out.println( "</tr>" );
        		
        	}
        	
        	out.println("</table>");
        	out.println("<div class=\"</div>\"> ");
        	
        }
        
        else
        {
        	try
        	{
        		
        		String requestedPlayer = pathInformation.substring(1);
        		
        		PlayerModel player = playerRepository.getASinglePlayer(requestedPlayer);
        		
        		if(player == null)
        		{
        			
        			out.print(requestedPlayer + " cannot be found. ");
        			
        		}else
        		{
        			
        			out.println(player.getThePlayerName() + " " + player.getThePlayerCash());
        				
        		}
        
        		
        	}catch(Exception E)
        	{
        		
        		System.out.println("There is a problem in requested player.");
        		E.printStackTrace();
        		
        	}
    
        }
        
        out.println("</body>");
        out.println("</html>");
        
		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		

		PlayerRepo playerRepository = new PlayerRepo(StockConnectionProvider.createConnection());
    	
    	response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        Map<String, String[]> parameterMapping = request.getParameterMap();
        
        if ( parameterMapping.containsKey("name") )
        {
        	PlayerModel player = new PlayerModel( parameterMapping.get("name")[0], 1500 );
        	if (playerRepository.buildPlayer(player))
        	{
        		out.println("You have built a new player!");
        	}
        	else
        	{
        		out.println("A problem has occured while creating " + parameterMapping.get("name")[0] + "!");
        	}
        }
        else
        {
        	out.println("You need to have a name parameter!");
        }
		
	
		
	}
	

}
