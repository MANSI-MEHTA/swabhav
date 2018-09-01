<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Object clg_id = request.getAttribute("clg_id");
		String clg_name = (String) request.getAttribute("clg_name");
		String location = (String) request.getAttribute("location");
		out.println("<h3>College ID:" + clg_id + "</h3>");
		out.println("<h3>College Name:" + clg_name + "</h3>");
		out.println("<h3>Location: " + location + "</h3>");
		out.println("<br><br><a href='/mvc-student-app/showstudent'>Click Here,return to Home Page</a>");
	%>
</body>
</html>