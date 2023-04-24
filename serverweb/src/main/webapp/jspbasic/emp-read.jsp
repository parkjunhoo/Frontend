<%@page import="java.util.ArrayList"%>
<%@page import="kr.multicampus.erp.user.EmpDTO"%>
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
		EmpDTO data = (EmpDTO) request.getAttribute("dto");
	%>
	<jsp:include page="/jspbasic/list.jsp"/>
	
	<pre>
		 <%=data.getId() %>
		 <%=data.getName() %>
		 <%=data.getAddr() %>
		 <%=data.getName() %>
		 <%=data.getPoint() %>
		 <%=data.getId() %>
	</pre>
</body>
</html>