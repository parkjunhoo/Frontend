package basic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		System.out.println("firstServlet 실행");
		
	}
}
