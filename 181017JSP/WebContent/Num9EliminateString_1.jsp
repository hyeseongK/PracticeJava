<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String input = request.getParameter("num"); 
	   String tran = input.replace("o", "");	
	   int trans = Integer.parseInt(tran);
	%>
	<%= trans %>
</body>
</html>