<%@page import="kr.multicampus.erp.board.BoardDTO"%>
<%@page import="kr.multicampus.erp.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		BoardDTO board = (BoardDTO)request.getAttribute("board");
	%>
	<jsp:include page="/top.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-Lg-2 sidenav">
				<jsp:include page="/layout/board_menu.jsp" />
			</div>
			<div  class="col-Lg-10"></div>
			<pre>
				글번호 :<%= board.getBoardNo() %>
				제목 :<%= board.getTitle() %>
				내용 :<%= board.getContent() %>
				작성자 :<%= board.getWriter() %>
				작성일시 :<%= board.getWritedate() %>
				
			</pre>
		</div>
	</div>
</body>
</html>