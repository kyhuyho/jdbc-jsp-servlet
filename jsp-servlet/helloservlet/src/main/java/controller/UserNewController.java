package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet(urlPatterns = "/user/new")
public class UserNewController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/new-user.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		
		UserService.createUser(user);
		
		resp.sendRedirect(req.getContextPath() + "/user/list");
	}

}
