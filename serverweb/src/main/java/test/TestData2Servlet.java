package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "test2", urlPatterns = { "/data2.do" })
public class TestData2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public TestData2Servlet() {
		
	}
       
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		///////////////////디비에서 정보를 받아오는
		//////////////////코드
		//////////////////들
		
		req.setAttribute("data2", "data2 from data2.do");//db에서 받아온 데이터 어트리뷰트에 넣기
	} 

}
