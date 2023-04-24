package kr.multicampus.erp.user.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet("/emplogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpDAO dao = new EmpDAOImpl();
		EmpDTO dto = new EmpDTO(req.getParameter("id") , req.getParameter("pass"));
		EmpDTO result =  dao.login(dto);
		if(result != null) {
			req.setAttribute("user", result);
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(req, res);
		}else {
			System.out.println("로그인실패");
			RequestDispatcher rd = req.getRequestDispatcher("/user_mvc/login.jsp");
		}
	}

}
