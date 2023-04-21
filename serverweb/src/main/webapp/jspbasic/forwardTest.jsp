<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp에서 forward하기</h1>
	<h2>forward액션태그를 이용해서 작업</h2>
	<h3>=> 요청재지정에서 살펴본 RequestDispatcher의 forward와 동일하게 동작</h3>
	<h3>/serverweb/jspbasic/forwardTest.jsp?id=jang</h3>
	
	<jsp:include page="/jspbasic/actiontag_sub.jsp">
		<jsp:param value="jang" name="id"/>
	</jsp:include>
	
	<jsp:forward page="/jspbasic/actiontag_sub.jsp">
		<jsp:param value="jang" name="id"/>
	</jsp:forward>
	
	<h1>===============forward액션 테그 테스트 종료 =============</h1>
</body>
</html>