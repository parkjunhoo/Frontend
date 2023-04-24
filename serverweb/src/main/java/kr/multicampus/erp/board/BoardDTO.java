package kr.multicampus.erp.board;

import java.sql.Date;

public class BoardDTO {
	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private Date writedate;
	public BoardDTO(int boardNo, String title, String writer, String content, Date writedate) {
		this.boardNo = boardNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writedate = writedate;
	}
	public BoardDTO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writedate = new Date(System.currentTimeMillis());
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	
	
}
