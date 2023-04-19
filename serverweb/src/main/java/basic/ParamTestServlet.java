package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamTestServlet extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException , IOException{
		System.out.println("doPost요청성공");
		//요청 정보에 한글 설정하기
		req.setCharacterEncoding("UTF-8");
		//응답정보에 한글을 설정 - 출력될 응답의 형식을 지정 MIME타입
		res.setContentType("text/html;charset=UTF-8");
		//2. 클라이언트에 응답할 스트림객체를 생성
		PrintWriter pw = res.getWriter();
		pw.print("<h1>안녕</h1><br>");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		System.out.println(id);
		System.out.println(pass);
		pw.print("<h1>아이디:"+id+"</h1><br>");
		pw.print("<h1>패스워드:"+pass+"</h1><br>");
		
	}

}
