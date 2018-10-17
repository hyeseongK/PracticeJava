<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<% 
	Connection conn= null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	
	Boolean connect = false;
	
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url,"hsk","orcl");
		
		connect = true;
		
		conn.close();
	}catch(Exception e){
		connect = false;
		e.printStackTrace();
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 연동 테스트 예제</title>
</head>
<body>
<%if(connect==true){ %>
	Connected!!
<%} else {%>
	Connect Fail!!
<%} %>


</body>
</html>