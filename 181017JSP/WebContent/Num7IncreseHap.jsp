<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int sum = 0, con = 0; %>
	<% for(int i = 1 ; i < 10 ; i++){ %>
		<%con = 0; %>
		<%for(int j = 1 ; j <= i ;j++) {%>
			<% con = con + j; %>
			
		<%} %>
		<%sum = sum + con; %>
	<%}%>
	<%= sum %>
	
</body>
</html>