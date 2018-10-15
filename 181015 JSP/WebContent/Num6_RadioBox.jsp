<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action = "Num6_RadioBox_1.jsp" method = "get" >
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;성별 : &emsp;&emsp;<input type = "radio" name = "sex"  value = "남자"/> 남자		
		 											&emsp;&emsp;<input type = "radio" name = "sex" value = "여자"/> 여자 
	<br><br>
	메일 정보 수신 여부 : &emsp;&emsp;<input type = "radio" name = "mail" value = "수신" />수신		
				  &emsp;&emsp;<input type = "radio" name = "mail" value = "거부" />거부
	<br><br><br>
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;간단한 인사를 적어주세요.
	<br><br>
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	<input type="text" name="textfield" style="text-align:center; width:200px; height:50px; letter-spacing: -5px">
	<br><br>
	&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	<input type = "submit" value = "전송">
	
	</form>
</body>
</html>