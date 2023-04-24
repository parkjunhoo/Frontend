package kr.multicampus.erp.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list.do")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		BoardDAO dao = new BoardDAOImpl();
		ArrayList<BoardDTO> boards = dao.select();
		
		req.setAttribute("boards", boards);
		
		RequestDispatcher rd = req.getRequestDispatcher("/board/board_list.jsp");
		rd.forward(req, res);
		
	}

}
