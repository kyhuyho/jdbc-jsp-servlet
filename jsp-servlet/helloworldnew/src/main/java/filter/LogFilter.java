package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = "/*") // chặn tất cả
public class LogFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Log Filter");

//		String key = request.getParameter("key");
//		if (key != null)
//			chain.doFilter(request, response); // goi ham nay de cho di tiep
//		else {
//			PrintWriter pw = response.getWriter();
//			pw.print("No Permission");
//		}
		chain.doFilter(request, response); // goi ham nay de cho di tiep

	}
}
