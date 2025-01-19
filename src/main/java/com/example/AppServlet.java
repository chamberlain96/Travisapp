package com.example.app;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AppServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Output the HTML content
        out.println("<html><body>");
        out.println("<h1>Welcome to Desamist Tech!</h1>");
        out.println("<p>We provide innovative technology solutions.</p>");
        out.println("<p>Explore our services:</p>");
        out.println("<ul>");
        out.println("<li>Web Development</li>");
        out.println("<li>Mobile Applications</li>");
        out.println("<li>Cloud Solutions</li>");
        out.println("<li>Consulting and Strategy</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}
