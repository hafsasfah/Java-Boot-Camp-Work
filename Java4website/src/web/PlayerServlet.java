package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
		
	}
	
	
	
	
	
	
	
	

}
