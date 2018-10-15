<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int [][] arr = new int[8][9];
		int a = 2; int b = 1;
		
		for(int i = 2 ; i < 10 ; i++){
			for(int j = 1 ; j < 10 ; j++){
				arr[i-a][j-b] = i*j;
				
			}
			
		}
	%>
	
	<% for(int i = 0 ; i < arr.length ; i++){
		for(int j = 0 ; j < arr[i].length ; j++){
			
		%><%= i+a %> * <%= j+b %> = <%= arr[i][j] %>&emsp; 
		<%}%>
		
		<br>
	<%} %>

</body>
</html>