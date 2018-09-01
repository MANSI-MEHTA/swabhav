<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<style>
form {
	border: 3px solid #f1f1f1;
	width: 750px
}

input {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0px;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

label {
	margin-top: 20px;
}
</style>



</head>
<body>
	<article>
	<h1>Login Form</h1>
	<form name="LoginForm" method="POST" action="/mvc-student-app/login"
		novalidate>

		<div class="container">
			<div class="row">

				<label class=" col-sm-2" for="username"> <b>UserName*:</b>
				</label>
				<div class="col-sm-4">
					<input type="text" placeholder="Enter FirstName" name="username"
						value="<%=request.getAttribute("username") == null ? "" : request
					.getAttribute("username")%>">
				</div>


			</div>
			<div class="row">

				<label for="password" class=" col-sm-2"> <b>Password*:</b></label>
				<div class="col-sm-4">
					<input type="password" placeholder="Enter LastName" name="password"
						value="<%=request.getAttribute("password") == null ? "" : request
					.getAttribute("password")%>">


				</div>
			</div>
			<div style="color: red">
				<p>
					<%
						if (request.getParameter("error") != null) {
							out.println(request.getParameter("error"));
						}
					%>
				</p>
			</div>
			<button class="col-sm-4 btn btn-primary">Sign in</button>
			<br> <br>
		</div>
	</form>
	</article>
</body>
</html>