<%@page import="kr.multicampus.erp.user.EmpDTO"%>
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
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
	 	list = (ArrayList<EmpDTO>)request.getAttribute("DTOList");	
	%>
		<table border="1">
			<tr>
				<th>부서코드</th>
				<th>성명</th>
				<th>사번</th>
				<th>패스워드</th>
				<th>주소</th>
				<th>포인트</th>
				<th>등급</th>
			</tr>
	<%
		for(EmpDTO dto : list){%>
			<tr>
				<td>
					<%=dto.getDeptno() %>
				</td>
				<td>
					<%=dto.getName() %>
				</td>
				<td>
					<%=dto.getId() %>
				</td>
				<td>
					<%=dto.getPass() %>
				</td>
				<td>
					<%=dto.getAddr() %>
				</td>
				<td>
					<%=dto.getPoint() %>
				</td>
				<td>
					<%=dto.getGrade() %>
				</td>
			</tr>
		<%}
	%>
	</table>
</body>
</html>