<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "Num7Combobox_1.jsp" method = "get">
	직업 &emsp; <select name = "Job">
			<option value = "officer">공무원</option>
			<option value = "student">학생</option>
			<option value = "developer">개발자</option>
		</select>
	&emsp;&emsp;
	관심분야 &emsp; <select multiple = "multiple" name = interest>
			<option value = "espresso">에스프레소</option>
			<option value = "rositing">로시팅</option>
			<option value = "sangdu">생투</option>
			<option value = "coffebean">원두</option>
			<option value = "handdrip">핸드드립</option>
		</select>
	<br>
	<input type = "submit" value = "결과">	
		
	</form>
	
	
</body>
</html>