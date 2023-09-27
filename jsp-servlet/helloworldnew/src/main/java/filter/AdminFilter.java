package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
//		String key = request.getParameter("key");
		Object key = session.getAttribute("loginUser");
		if (key != null && String.valueOf(key).equals("admin"))
			chain.doFilter(request, response); // goi ham nay de cho di tiep
		else {
			PrintWriter pw = response.getWriter();
			pw.print("No Permission");
		}
		
	}

}
