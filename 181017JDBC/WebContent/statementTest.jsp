<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%@ page import = "javax.naming.*" %>

<%
	Connection conn = null;
	String sql = "INSERT INTO student(num,name) VALUES (5,'홍길동')";
	
	try{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();
		Statement stmt = conn.createStatement();
		
		int result = stmt.executeUpdate(sql);
		if(result != 0){
			out.println("<h3>record is registered.</h3>");
		}
	}catch(Exception e){
		out.println("<h3>record's registering is failed.</h3>");
		e.printStackTrace();
	}
%>





<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->