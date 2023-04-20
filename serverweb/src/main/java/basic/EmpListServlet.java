package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet(name = "emplist" ,
urlPatterns = {"/emp/list.do"})
public class EmpListServlet extends  HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
		EmpDAO dao = new EmpDAOImpl();
		
		ArrayList<EmpDTO> list = dao.select();		
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		
		if(list != null) {
			pw.write("<table border='1'><tr> <td>부서</td> <td>성명</td> <td>사번</td> <td>패스워드</td> <td>주소</td> <td>포인트</td> <td>등급</td> <td>삭제</td></tr>");
			
			for(EmpDTO emp : list) {
				pw.write(String.format("<tr> <td>%s</td> <td>%s</td> <td>%s</td> <td>%s</td> <td>%s</td> <td>%d</td> <td>%s</td>",
						emp.getDeptno() , emp.getName() , emp.getId() , emp.getPass() , emp.getAddr() , emp.getPoint() , emp.getGrade()));
				System.out.println(emp.getId());
				pw.write("<td> <a href='/serverweb/emp/delete.do?id="+emp.getId()+"'>삭제</a> </td> </tr>");
			}
			pw.write("</table>");
		}else {
			pw.write("<h1>조회 실패<h1>");
		}
		
		
	}
	
	
}
