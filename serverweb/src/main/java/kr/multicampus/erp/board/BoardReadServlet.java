package kr.multicampus.erp.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/read.do")
public class BoardReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		BoardDAO dao = new BoardDAOImpl();
		System.out.println(Integer.parseInt(req.getParameter("id")));
		BoardDTO board = dao.read(Integer.parseInt(req.getParameter("id")));
		System.out.println(board);
		req.setAttribute("board", board);
		
		RequestDispatcher rd = req.getRequestDispatcher("/board/board.jsp");
		rd.forward(req, res);
		
	}

}
