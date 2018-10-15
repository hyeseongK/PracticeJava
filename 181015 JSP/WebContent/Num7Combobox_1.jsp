<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 선택한 직업 : <% if(request.getParameter("Job").equals("officer")) { %> 공무원
				  <%} else if(request.getParameter("Job").equals("student")) {%> 학생
				  <%} else if(request.getParameter("Job").equals("developer")) {%> 개발자<%} %>
	<br>
	당신이 선택한 관 심 분야 : <% String[] arr = request.getParameterValues("interest");
						for(int i = 0 ; i < arr.length ; i++){
						%>
							<%if(arr[i].equals("espresso")) {%>에스프레소&nbsp;
							 <%} else if(arr[i].equals("rositing")) {%>로시팅
							 <%} else if(arr[i].equals("sangdu"))	{%>생두
							 <%} else if(arr[i].equals("coffebean")) {%>원두
							 <%} else {%>핸드드립<%} %>
							
					 <%} %>
			 <%-- <% if(request.getParameter("interest").equals("espresso")) {%> 에스프레소
				  <%} else if(request.getParameter("interest").equals("rositing")) {%> 로시팅
				  <%} else if(request.getParameter("interest").equals("sangdu")) {%> 상투
				  <%} else if(request.getParameter("interest").equals("coffebean")) {%> 원두
				  <%} else { %> 핸드드립 <%} %> --%>
</body>
</html>