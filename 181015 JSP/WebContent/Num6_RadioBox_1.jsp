<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String str = request.getParameter("mail");
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	당신이 입력한 정보입니다.
	<br><br>
	
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;성별 : &emsp;&emsp; <%= request.getParameter("sex") %>
	<br><br>
	
	메일 정보 수신 여부 : &emsp;&emsp; <%= str%>
	<br><br>
	
	&emsp;&emsp;&emsp;&emsp;&emsp;가입인사 : &emsp;&emsp; <%= request.getParameter("textfield") %>
	
</body>
</html>