package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet(urlPatterns = "/user/edit")
public class UserEditController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		User user = new User();
		user.setId(Integer.parseInt(id));
		req.setAttribute("user", user);
		req.getRequestDispatcher("/views/edit-user.jsp").forward(req, resp);
	}

}
