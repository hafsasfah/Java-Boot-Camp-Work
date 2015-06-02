package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import random.RandomNumberPicker;

public class LottoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lotto Picks</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Your lucky numbers are:</h1>");
        int[] numbers = new int[5];
        for ( int index = 0 ; index < numbers.length; index++ )
        {
        	numbers[index] = RandomNumberPicker.randomNumber();
        }
        
        for ( int number : numbers )
        {
        	out.println( number + " " );
        }
        out.println("</body>");
        out.println("</html>");
    }
}
