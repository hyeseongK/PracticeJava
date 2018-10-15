<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

// 변수를 설정한다.
int result = 0;

// POST 로 젼달된 경우 수행
if (request.getMethod().equals("POST")) {

   int num1 = Integer.parseInt(request.getParameter("num1"));
   int num2 = Integer.parseInt(request.getParameter("num2"));

   result = num1 * num2;
}


%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name=form1 method=post>
<INPUT TYPE="text" NAME="num1" width=200 size="5">
<label>X</label>

<INPUT TYPE="text" NAME="num2" width=200 size="5">
<input type="submit" value="계산" name="B1"> <label for = "result"> <%= result %> </label> <input type="reset" value="다시입력" name="B2">


</from>


</body>
</html>