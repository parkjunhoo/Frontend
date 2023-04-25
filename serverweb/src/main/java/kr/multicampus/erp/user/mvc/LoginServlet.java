package kr.multicampus.erp.user.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.multicampus.erp.user.EmpDAO;
import kr.multicampus.erp.user.EmpDAOImpl;
import kr.multicampus.erp.user.EmpDTO;

@WebServlet("/emplogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpDAO dao = new EmpDAOImpl();
		EmpDTO dto = new EmpDTO(req.getParameter("id") , req.getParameter("pass"));
		EmpDTO result =  dao.login(dto);
		req.setAttribute("user",result);
		
		//getSession
		//request에서 세션id를 꺼내고 할당된 세션의
		//세션id와 일치하는게 없거나 세선아이디가 존재하지 않으면
		//무조건 세션을 만들어서 리턴한다
		//일치하는 세션id가 있으면 그 세션id로 정의된 세션을
		//만들어 리턴한다
		//로그인 버튼을 눌러서 로그인에 성공하면 세션을 무조건 생성
		
		//getSession(true) - 1번과 동일
		//getSession(false) - 일치하는 세션 id가 존재하면
		//세션 객체를 만들어서 리턴 일치하는 세션 id가 존재하면
		//세션 객체를 만들어서 리턴
		
		//일치하는 세션 id가 존재하지 않으면 null을 리턴
		//세션 유무를 체크하는 경우 (로그아웃)
		if(result != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", result);
			
			
		}
		
		if(result != null) {
			req.setAttribute("user", result);
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(req, res);
		}else {
			System.out.println("로그인실패");
			RequestDispatcher rd = req.getRequestDispatcher("/user_mvc/login.jsp");
		}
	}

}
