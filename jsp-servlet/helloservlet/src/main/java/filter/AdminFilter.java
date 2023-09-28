package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebFilter(urlPatterns = "/user/list")
public class AdminFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		System.out.println(session.getId());
		String uname = (String) session.getAttribute("username");
		if (uname.equals("admin")) {
			System.out.println("admin");
			chain.doFilter(request, response);
		} else {
			// chuyen ve servlet/login
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect(req.getContextPath() + "/login");
		}

	}
}
