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
<section>
	<table class=" table table-responsive">
		<tr>
			<th>#</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>RollNO</th>
			<th>CGPI</th>
			<th>Gender</th>
			
		</tr>

		<%
			List<Student> students = (List) request
					.getAttribute("listOfStudentsByCollegId");
			int i=1;
			for (Student x : students) {
				out.println("<tr>");
				out.println("<td>" + i + "</td>");
				out.println("<td>" + x.getFname() + "</td>");
				out.println("<td>" + x.getLname() + "</td>");
				out.println("<td>" + x.getRollno() + "</td>");
				out.println("<td>" + x.getCgpi() + "</td>");
				out.println("<td>" + x.getGender() + "</td>");
				out.println("</tr>");
				i++;

			}
		%>

	</table>

</body>
</html>