<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "java.text.SimpleDateFormat" %>
<%@page import = "java.util.*" %>

<%
   	Date t = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일");
	SimpleDateFormat sdf2 = new SimpleDateFormat("kk시mm분ss초");
%>


<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 오늘은	&emsp;	<%= sdf1.format(t) %>	&emsp;	입니다.<br><br>
 지금 시각은  &emsp;	<%= sdf2.format(t) %>	&emsp;	입니다.




</body>
</html>