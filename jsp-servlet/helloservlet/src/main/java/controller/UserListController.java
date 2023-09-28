package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

@WebServlet(urlPatterns = "/user/list")
public class UserListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> list = UserService.getAll();
		req.setAttribute("listUser", list);
		req.getRequestDispatcher("/views/list-user.jsp").forward(req, resp);
	}

}
