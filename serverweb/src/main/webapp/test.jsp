<%@page import="test.TestData1Servlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String data1 = (String)request.getAttribute("data1");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%=data1 %></p>
</body>
</html>