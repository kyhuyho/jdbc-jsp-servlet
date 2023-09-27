package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

@WebServlet(urlPatterns = "/person/create")
public class PersonCreateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/person-create.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// đọc dữ liệu gửi lên từ client
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		System.out.println(id);
		System.out.println(name);

		Person ps = new Person();
		ps.setId(Integer.parseInt(id));
		ps.setName(name);
		// save to db
		// ...
		// views
		req.setAttribute("person", ps);
		req.getRequestDispatcher("/views/person-details.jsp").forward(req, resp);
		

	}

}
