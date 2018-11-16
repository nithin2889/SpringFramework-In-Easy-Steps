<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Tutorial</title>
</head>
<body>
	<h1>
		<%
			Integer id = (Integer) request.getAttribute("id");
			String name = (String) request.getAttribute("name");
			Integer salary = (Integer) request.getAttribute("salary");

			out.println("ID: " + id);
			out.println("Name: " + name);
			out.println("Salary: " + salary);
		%>
	</h1>
	<br />
	ID: <b>${id}</b>
	Name: <b>${name}</b> 
	Salary: <b>${salary}</b>
</body>
</html>