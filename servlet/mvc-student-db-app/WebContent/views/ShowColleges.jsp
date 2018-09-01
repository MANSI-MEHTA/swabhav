<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"
	import="com.techlabs.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>


</head>
<body>
	<div>
	
	</div>
	<section>
	<table class=" table table-responsive">
		<tr>
			<th>CollegeID</th>
			<th>CollegeName</th>
			<th>Location</th>
			<th>Show Students</th>
		</tr>

		<%
			List<College> colleges = (List) request
					.getAttribute("listOfColleges");

			for (College x : colleges) {
				out.println("<tr>");
				out.println("<td>" + x.getClg_ID() + "</td>");
				out.println("<td>" + x.getClg_Name() + "</td>");
				out.println("<td>" + x.getLocation() + "</td>");
				out.println("<td><a href='/mvc-student-db-app/showstudentsincollege?id="
						+ x.getClg_ID()
						+ "' class='btn btn-info'>Show Student</a></td>");
				out.println("</tr>");

			}
		%>

	</table>
</body>
</html>