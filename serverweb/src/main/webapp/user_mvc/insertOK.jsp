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
		String name = (String)request.getAttribute("insertuser");
		
	%>
	<h1>자바나라 쇼핑몰</h1>
	<hr>
	<h2><%= name %>님 가입을 축하합니다.!!!</h2>
</body>
</html>