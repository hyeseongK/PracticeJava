<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String input = request.getParameter("num"); 
	int number = Integer.parseInt(input);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(int i = 1 ; i < 10 ; i++){%>
		<%= number %> * <%= i %> = <%= number*i %>
		<br>
	<%}%>


</body>
</html>