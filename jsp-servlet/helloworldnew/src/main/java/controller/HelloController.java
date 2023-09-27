package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "/hi", "/hello" })
public class HelloController extends HttpServlet {
	// khi khởi tạo servlet
	@Override
	public void init() throws ServletException {
		System.out.println("INIT SERVLET");
	}
	// khi kết thúc servlet (khi stop server)
	@Override
	public void destroy() {
		System.out.println("DESTROY");
	}
	// GET
	// khi gõ đường dẫn => GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HTTP GET METHOD");
		System.out.println(req.getRemoteAddr());
		// response
		resp.setContentType("text/html");
		
		// in ra nội dung trả về lên trình duyệt
		PrintWriter pw = resp.getWriter();
		pw.println("HELLO WORLD");
		pw.println("<h1>HELLO HTML</h1>");
	}

}
