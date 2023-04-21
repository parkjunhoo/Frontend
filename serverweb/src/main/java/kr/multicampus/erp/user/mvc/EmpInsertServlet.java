package kr.multicampus.erp.user.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet(name = "empInsert_mvc" ,
urlPatterns = {"/mvc/insert.do"})
public class EmpInsertServlet extends  HttpServlet{
	
	
	
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
		req.setCharacterEncoding("UTF-8");
		
		String deptNo = req.getParameter("deptno");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String addr = req.getParameter("addr");
		//String point = req.getParameter("point");
		String grade = req.getParameter("grade");
		
		EmpDAO dao = new EmpDAOImpl();
		EmpDTO dto = new EmpDTO(deptNo , name , id, pass ,addr , grade);
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		int result = dao.insert(dto);
		
		req.setAttribute("insertuser", name);
		
		String view = ""; //응답할 뷰에 대한 정보
		if(result>0) { //정상처리
			view = "/serverweb/user_mvc/insertOK.jsp";
		}else {
			view = "/serverweb/user_mvc/insertFail.jsp";
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, res);
		//응답뷰가 클라이언트에게 response되도록 재요청
		res.sendRedirect(view);
		
		
	}
	
	
}
