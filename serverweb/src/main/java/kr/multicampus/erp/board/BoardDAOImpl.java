package kr.multicampus.erp.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CustomerVO;
import fw.DBUtil;

public class BoardDAOImpl implements BoardDAO{

	@Override
	public int insert(BoardDTO board) {
		String sql = "insert into board values(null,?,?,?,sysdate())";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1, board.getTitle());
			ptmt.setString(2, board.getWriter());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public ArrayList<BoardDTO> select() {
		ArrayList<BoardDTO> result = new ArrayList<BoardDTO>();
		String sql = "select * from board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		BoardDTO board = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				rs =  ptmt.executeQuery();
				
				while(rs.next()) {
					board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
					result.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		
		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
		
		String sql = "delete from board where id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		BoardDTO emp = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				
				ptmt.setInt(1, id);
				
				result = ptmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt, con);
		}
		
		return result;
	}

	@Override
	public BoardDTO read(int id) {
		String sql = "select * from board where boardNo=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		BoardDTO board = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setInt(1, id);
				
				rs =  ptmt.executeQuery();
				rs.next();
				board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
				System.out.println(board);
			}catch (SQLException e) {
			e.printStackTrace();
			}finally {
				DBUtil.close(rs, ptmt, con);
			}
		return board;
	}
	
	
	
	
	
}
