package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/huy")
public class HuyController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HTTP GET METHOD");
		System.out.println(req.getRemoteAddr());
		
		// response
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("HUY");
		pw.println("<h1>HUY</h1>");
		
	}

}
