package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;

public class DBServlet extends HttpServlet{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
		CustomerDAO dao = new CustomerDAOImpl();
		dao.login("jimin", "1234");
	}
}
