package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Stock;
import Repository.StockRepository;

public class StockServlet extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	
    	StockRepository stockRepository = new StockRepository( StockConnectionProvider.createConnection() );
    	
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(ServletHelper.createHead( "Stock" ) );
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
	        List<Stock> stocks = stockRepository.get();
    }
}
