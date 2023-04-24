<%@page import="kr.multicampus.erp.board.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
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
	ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
	list = (ArrayList<BoardDTO>) request.getAttribute("boards");
	%>
	<jsp:include page="/top.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-Lg-2 sidenav">
				<jsp:include page="/layout/board_menu.jsp" />
			</div>
			<div class="col-Lg-10">
				<table style="width:90%; margin:0 auto;" border="1">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일시</th>
					</tr>
					<%
					for (BoardDTO dto : list) {
					%>
					<tr onclick="location.href='/serverweb/board/read.do?id=<%=dto.getBoardNo()%>'">
						<td><%=dto.getBoardNo()%></td>
						<td><%=dto.getTitle()%></td>
						<td><%=dto.getWriter()%></td>
						<td><%=dto.getWritedate()%></td>
					</tr>
					<%
					}
					%>
				</table>
			</div>
		</div>
	</div>
</body>
</html>