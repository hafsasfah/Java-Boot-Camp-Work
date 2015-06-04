package web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import Repository.PlayerRepository;

public class PlayerServlet extends PlayerRepository {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Player Repository</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}