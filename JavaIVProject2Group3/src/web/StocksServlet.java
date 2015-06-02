package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StocksServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	    		throws IOException, ServletException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        ServletHelper.createHead("Stocks");
	        out.println("<body>");
	        out.println("<h1>Hello Hafsa!</h1>");
	        out.println("</body>");
	        out.println("</html>");
	    }
}
