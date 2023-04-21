package kr.multicampus.erp.user.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet(name = "emplist_mvc" ,
urlPatterns = {"/mvc/list.do"})
public class EmpListServlet extends  HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
		EmpDAO dao = new EmpDAOImpl();
		
		ArrayList<EmpDTO> list = dao.select();		
		
		res.setContentType("text/html;charset=UTF-8");
		
		req.setAttribute("DTOList", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("/jspbasic/list.jsp");
		rd.forward(req, res);
	}
	
	
}
