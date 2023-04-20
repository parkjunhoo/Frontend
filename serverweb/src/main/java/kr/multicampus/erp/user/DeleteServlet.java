package kr.multicampus.erp.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet(name = "empdelete", urlPatterns = { "/emp/delete.do" })
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		
		EmpDAO dao = new EmpDAOImpl();
		int result = dao.delete(id);
		
		if(result > 0) {
			//삭제완료
			res.sendRedirect("/serverweb/emp/list.do");
		}else {
			//삭제실패
			res.sendRedirect("/serverweb/emp/list.do");
		}
		
		
	}

}
