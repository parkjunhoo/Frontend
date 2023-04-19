package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExamServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException {
		
		req.setCharacterEncoding("UTF-8");
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] items = req.getParameterValues("item");
		
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		pw.print("<h1>아이디:"+userId+"</h1><br>");
		pw.print("<h1>성명:"+userName+"</h1><br>");
		pw.print("<h1>패스워드:"+passwd+"</h1><br>");
		pw.print("<h1>성별:"+gender+"</h1><br>");
		pw.print("<h1>직업:"+job+"</h1><br>");
		pw.print("<h1>좋아하는 항목:");
		for(String item : items) {
			pw.print(item);
			pw.print(" ");
		}
		pw.print("<h1>");
	}

}
