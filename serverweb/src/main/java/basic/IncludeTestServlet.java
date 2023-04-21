package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.multicampus.erp.user.EmpDTO;

@WebServlet("/include")
public class IncludeTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		System.out.println("include리다이렉트 연습 서블릿실행");
		pw.println("<h1>요청 재지정연습 - include리다이렉트</h1>");
		pw.println("<hr/><hr/><hr/><hr/>");
		//1. 데이터 공유 - db에서 가져온 결과나 비지니스 로직 수행결과
		EmpDTO dto = new EmpDTO("jsp재밋당ㅋㅋ","1234","서울",100,"VIP");
		//공유하고 싶은 scope를 나타내는 객체에 이름을 정의하고 저장
		req.setAttribute("mydata", dto);
		
		//2. 요청 재지정
		RequestDispatcher rd = req.getRequestDispatcher("/jspbasic/result.jsp");
		rd.include(req, res);
		
		pw.println("<h1>ㅇㅅㅇ</h1>");
	}

}
