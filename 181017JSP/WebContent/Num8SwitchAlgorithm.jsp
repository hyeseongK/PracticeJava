<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int sw = -1; int sum = 0; int result = 0;int i = 1; %>
	<%Loop : for(;;) {
		if(i%2 == 0) {
			sum = sum + (i*sw);
		} else { 
			sum += i;
		} 
		if(sum >= 100){
			result = i;
			break Loop;
		}
		i++;
	} %> 
	<%= sum %><br>
	<%= result %>까지 더해야 총합이 100 이상이 된다.
	

</body>
</html>