<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<%
		for(int x=1; x<=9; x++){
			%><tr><%
			for(int y=1; y<=9; y++){
				%>
				<td><%
				if(x==y){%>
					<img src="/serverweb/images/bts.jpg" width="50" height="50"/>
				<%}else{%>
					<p><%=x+"*"+y+"="+(x*y) %></p><%
				}%>
				</td><%			
				}
			%></tr><%
			}
	%>
	</table>
</body>
</html>