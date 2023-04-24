package kr.multicampus.erp.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/write.do")
public class BoardInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		BoardDAO dao = new BoardDAOImpl();
		BoardDTO dto = new BoardDTO(
					req.getParameter("title"),
					req.getParameter("id"),
					req.getParameter("content")
				);
		
		RequestDispatcher rd= null;
		if(dao.insert(dto) > 0) {
			//등록 성공
		}else {
			//등록 실패
		}
		res.sendRedirect("/serverweb/board/list.do");
	}

}
