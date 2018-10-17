<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int vr = 1; %>
	<%for(int i = 0 ; i < 5 ; i++){ %>
		<%for(int j = 5-1 ; j >= i ; j--) {%>
			&nbsp;
		<%} %>
		<%for(int k = 0 ; k < vr ; k++) { %>
			*
		<%} %>
			<br>
		<%vr += 2;} %>

</body>
</html>