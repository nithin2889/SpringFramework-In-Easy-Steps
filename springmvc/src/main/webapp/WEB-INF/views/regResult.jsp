<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Result</title>
</head>
<body>
	<h4>
		User successfully registered.<br />
	</h4>
	<h3>
		User details are:<br />
	</h3>
	<%=request.getAttribute("user")%>
</body>
</html>