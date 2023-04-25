package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OverTestServlet
 */
@WebServlet("/testpage")
public class OverTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		///////////////////디비에서 정보를 받아오는
		//////////////////코드
		//////////////////들
		
		req.setAttribute("data1","data1"); //db에서 받아온 데이터 어트리뷰트에 넣기
		req.setAttribute("data2","data2");
		
		RequestDispatcher rd = req.getRequestDispatcher("/overtest.jsp");
		rd.forward(req, res);
	}

}
