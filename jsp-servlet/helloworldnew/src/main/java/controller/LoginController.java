package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username.equals("admin")&& password.equals("123")) {
			// xem nhu login thanh cong
			// SESSION
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", username);
			System.out.println(session.getId());
			
			resp.sendRedirect("/helloworldnew/admin/welcome");
		} 
		else {
			resp.sendRedirect("/helloworldnew/login");
		}
	}

}