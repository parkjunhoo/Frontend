package kr.multicampus.erp.board;

import java.util.ArrayList;

public interface BoardDAO {
	//사원등록을 위한 메소드
	public int insert(BoardDTO board);
	public ArrayList<BoardDTO> select();
	public int delete(int id);
	public BoardDTO read(int id);
}
