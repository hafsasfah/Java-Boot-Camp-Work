package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import Models.Player;
import Repository.PlayerRepository;
import Repository.StockConnectionProvider;


public class PlayerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
		{
		PlayerRepository playerRepository = new PlayerRepository( StockConnectionProvider.createConnection() );
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println( ServletHelper.createHead( "Stock" ) );
		out.println("<body>");
		String pathInfo = request.getPathInfo();

		if ( pathInfo == null || pathInfo.equals("/") )
	{
	out.println("<h1>Players</h1>");
	out.println("<table border='1'>");
	List<Player> players = playerRepository.get();

	if ( players.size() > 0 )
	{
	out.println( "<tr><th>Name</th><th>Money</th></tr>" );
	}

	for ( Player player : players )
	{
	out.println( "<tr>" );
	out.println( "<td>" + player.getName() + "</td>" );
	out.println( "<td>" + String.format( "%.2f", player.getMoney()) + "</td>" );
	out.println( "</tr>" );
	}

	out.println("</table>");
	}

		else
	{
	String requestedPlayer = pathInfo.substring( 1 );
	Player player = playerRepository.getSinglePlayer(requestedPlayer) ;
	if ( player == null )
	{

		out.println( requestedPlayer + " was not found" );
	}
	else
	{
	
		out.println( player.getName() + " " + player.getMoney() );
	}
	}
	out.println("</body>");
	out.println("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
	PlayerRepository playerRepository = new PlayerRepository( StockConnectionProvider.createConnection() );
	response.setContentType("text/plain");
	PrintWriter out = response.getWriter();
	Map<String, String[]> parameterMap = request.getParameterMap();

	if ( parameterMap.containsKey("name") )
	{
	Player player = new Player( parameterMap.get("name")[0], 50000 );

	if ( playerRepository.create( player ) )
	{
	out.println("Player was created!");
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
