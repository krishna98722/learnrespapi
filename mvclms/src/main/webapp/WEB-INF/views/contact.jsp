<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
	    String email = (String) request.getAttribute("email");
    	int age = (int) request.getAttribute("age");
	%>
	<h1>Welcome method executed successfully!</h1>
	<h2><%=name%></h2>
	<h2><%=email%></h2>
	<h2><%=age%></h2>
	<h1>Contact me @Btm Water Tank ke upar</h1>
</body>
</html>