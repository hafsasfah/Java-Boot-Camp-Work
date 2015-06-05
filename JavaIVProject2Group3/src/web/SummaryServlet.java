package web;

import java.io.IOException;
import java.util.List;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.*;

public class SummaryServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException){
		
		StockPrices prices = new StockPrices();
		User user = new User();
		StockOwned stock = new StockOwned();
		
		List<Summary> summary= new ArrayList<Summary>();
		List<StockPrices> currentPrices=prices.getDate( ServletHelper.todaysDate());
	}

}

