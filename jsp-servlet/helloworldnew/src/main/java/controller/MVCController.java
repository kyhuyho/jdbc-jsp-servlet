package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/mvc")
public class MVCController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// MVC: servlet: controller, view: jsp
		RequestDispatcher dispatcher = req.getRequestDispatcher("/hello.jsp");
		req.setAttribute("msg", "Hello Java Servlet");
		dispatcher.forward(req, resp);// chuyển tiếp 
	}

}
