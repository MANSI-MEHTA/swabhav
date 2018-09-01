<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"
	import="com.techlabs.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
	<div class="container">

		<nav class="navbar navbar-default" style="height:25px">
		<div class="container-fluid">
			<div class="navbar-header">
				<ul class="nav navbar-nav">
					<li><a class="active page-scroll btn " style="color: blue"
						href="#/">Home</a></li>
					<li><a class="page-scroll btn"
						style="margin-left: 5px; color: blue"
						href="/mvc-student-db-app/addstudent">Add student</a></li>
					<li><a class="page-scroll btn"
						style="margin-left: 5px; color: blue"
						href="/mvc-student-db-app/showcolleges">Show Colleges</a></li>

					<%
					System.out.println(request.getAttribute("loginstate").getClass());
						if ((Boolean)request.getAttribute("loginstate")) {
							out.println("<li><a class='page-scroll btn' style='margin-left: 5px; color: blue' href='#'>Logout</a></li>");
						} else if (!(Boolean)request.getAttribute("loginstate")) {
							out.println("<li><a class='page-scroll btn' style='margin-left: 5px; color: blue' href='/mvc-student-db-app/views/Login.jsp'>Login</a></li>");
						}
					%>
					<!--<li id="loginli" style="display: none"><a
						class='page-scroll btn'
						style='margin-left: 5px; color: blue display:none'
						href='/mvc-student-db-app/views/Login.jsp'>Login</a></li>
					<li id="logoutli" style="display: none"><a
						class='page-scroll btn'
						style='margin-left: 5px; color: blue display:none' href='#'>Logout</a></li>-->
				</ul>

			</div>
		</div>
		</nav>
		<br> <br>

		<section>
		<table class=" table table-responsive">
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>RollNO</th>
				<th>CollegeId</th>
				<th>CGPI</th>
				<th>Gender</th>
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
					out.println("<td><a href='/mvc-student-db-app/showcollege?id="
							+ x.getClg_Id() + "' class='btn btn-info'>"
							+ x.getClg_Id() + "</a></td>");
					out.println("<td>" + x.getGender() + "</td>");
					out.println("<td>" + x.getCgpi() + "</td>");
					out.println("<td><a href='/mvc-student-db-app/editstudent?id="
							+ x.getRollno()
							+ "' class='btn btn-primary'>Edit</a></td>");

					out.println("</tr>");

				}
			%>

		</table>
		<!-- <a href="/mvc-student-db-app/addstudent" class="btn btn-primary">Add
			Student</a> --> </section>
</body>
</html>