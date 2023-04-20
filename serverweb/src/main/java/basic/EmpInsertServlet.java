package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet(name = "emp_insert" ,
urlPatterns = {"/emp/insert.do"})
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
//		if(dao.insert(dto) == 1) {
//			pw.write("<h1>가입 완료<h1>");
//		}else {
//			pw.write("<h1>가입 실패<h1>");
//		}
		String view = ""; //응답할 뷰에 대한 정보
		if(result>0) { //정상처리
			view = "/serverweb/user/InsertOK.html";
		}else {
			view = "/serverweb/user/InsertFail.html";
		}
		
		//응답뷰가 클라이언트에게 response되도록 재요청
		res.sendRedirect(view);
		
		
	}
	
	
}
