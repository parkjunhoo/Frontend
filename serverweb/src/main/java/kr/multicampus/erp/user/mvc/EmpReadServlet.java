package kr.multicampus.erp.user.mvc;

import java.io.IOException;
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

@WebServlet("/EmpReadServlet")
public class EmpReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpDAO dao = new EmpDAOImpl();
		req.getParameter("id");
		
		EmpDTO result = dao.read(req.getParameter("id"));		
		
		req.setAttribute("dto", result);
		
		ArrayList<EmpDTO> list = dao.select();		
		
		req.setAttribute("DTOList", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("/jspbasic/emp-read.jsp");
		rd.forward(req, res);
	}


}
