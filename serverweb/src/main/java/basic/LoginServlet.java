package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAOImpl;	


public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		CustomerDAOImpl dao = new CustomerDAOImpl();
		String result = (dao.login(id, pass) != null) ? "로그인 성공" : "로그인 실패";
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		pw.write("<h1>"+result+"<h1>");
		
	}
}
