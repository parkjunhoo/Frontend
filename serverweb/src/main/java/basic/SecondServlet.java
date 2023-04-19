package basic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException{
		//secondServlet 만들기
				// 7단 출력하는 서블릿
				// 서블릿명 : gugu
				// 매핑명: /gugudan.html
		
		System.out.println("gugu 실행");
	}
}
