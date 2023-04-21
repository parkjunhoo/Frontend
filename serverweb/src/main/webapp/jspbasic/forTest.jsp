<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dsts</title>
<script type="text/javascript">
	let a = 0;
</script>
<style type="text/css">
	*{
		color:red;
	}
</style>
</head>
<body>
	<table border="1">
		<%
			for(int i=1; i<=10; i++)
			{
		%>
		
				<tr><td><h1><%=i %></h1></td></tr>
		<%
			}
		%>
	</table>
</body>
</html>