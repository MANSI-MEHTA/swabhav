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
	<!-- <div class="container">
		<div>
			<nav class="navbar navbar-default" style="height:25px">
			<div class="container-fluid">
				<div class="navbar-header">
					<ul class="nav navbar-nav">
						<li><a class="active page-scroll btn  " style="color: blue"
							href="#/">Home</a></li>
						<li><a class="page-scroll btn  "
							style="margin-left: 5px; color: blue" href="#add/">Add
								student</a></li>
						<li><a class="page-scroll btn"
							style="margin-left: 5px; color: blue" href="#login/">Login</a></li>
						<li><a class="page-scroll btn"
							style="margin-right: 50px; color: blue" href="#logout/">Logout
						</a></li>

					</ul>

				</div>
			</div>
			</nav>
		</div>-->
	<div style="align: center">
		<%
			if ((boolean) request.getAttribute("loginstate")) {
				out.println("<a href='' class='btn btn-danger'>Logout</a>");
			}
		%>
	</div>
	<section>
	<table class=" table table-responsive">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>RollNO</th>
			<th>CollegeId</th>
			<th>CGPI</th>
			<th>Edit</th>
		</tr>

		<%
			List<Student> students = (List) request
					.getAttribute("listOfStudents");

			for (Student x : students) {
				out.println("<tr>");
				out.println("<td>" + x.getFname() + "</td>");
				out.println("<td>" + x.getLname() + "</td>");
				out.println("<td>" + x.getRollno() + "</td>");
				out.println("<td><a href='/mvc-student-app/showcollege?id="
						+ x.getClg_Id() + "' class='btn btn-info'>"
						+ x.getClg_Id() + "</a></td>");

				out.println("<td>" + x.getCgpi() + "</td>");
				out.println("<td><a href='/mvc-student-app/editstudent?id="
						+ x.getRollno()
						+ "' class='btn btn-primary'>Edit</a></td>");

				out.println("</tr>");

			}
		%>

	</table>
	<a href="/mvc-student-app/addstudent" class="btn btn-primary">Add
		Student</a> </section>
</body>
</html>