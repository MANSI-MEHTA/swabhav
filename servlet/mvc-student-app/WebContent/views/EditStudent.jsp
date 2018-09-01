<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.techlabs.model.*"%>
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
	width: 500px
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
	<h2>Edit Student Form</h2>
	<form name="StudentForm" method="POST"
		action="/mvc-student-app/editstudent" novalidate>

		<div class="container">
			<div class="row">
				<div class="form-group" class="control-label col-sm-2">
					<label class="control-label col-sm-2" for="fname"> <b>FirstName*</b>
					</label>
					<div class="col-sm-6">
						<input type="text" placeholder="Enter First name" name="fname"
							value="<%=request.getAttribute("fname") == null ? "" : request
					.getAttribute("fname")%>">
					</div>

				</div>
			</div>

			<br>
			<div class="row">
				<div class="form-group">
					<label for="lname" class="control-label col-sm-2"> <b>LastName*</b>
					</label>
					<div class="col-sm-6">
						<input type="text" placeholder="Enter LastName" name="lname"
							value="<%=request.getAttribute("lname") == null ? "" : request
					.getAttribute("lname")%>">

					</div>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="form-group">
					<label for="rollno" class="control-label col-sm-2"> <b>RollNo*</b>
					</label>
					<div class="col-sm-6">
						<input type="number" placeholder="Enter RollNo." name="rollno"
							value="<%=request.getAttribute("rollno") == null ? "" : request
					.getAttribute("rollno")%>">

					</div>
				</div>
			</div>
						<div class="row">
				<div class="form-group">
					<label for="clg_id" class="control-label col-sm-2"> <b>CollegeId*</b>
					</label>
					<div class="col-sm-6">
						<input type="number" placeholder="Enter CollegeID" name="clg_id"
							value="<%=request.getAttribute("clg_id") == null ? "" : request
					.getAttribute("clg_id")%>">

					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<label for="cgpi" class="control-label col-sm-2"> <b>CGPI</b>
					</label>
					<div class="col-sm-6">
						<input type="number" placeholder="Enter CGPI" name="cgpi"
							value="<%=request.getAttribute("cgpi") == null ? "" : request
					.getAttribute("cgpi")%>">

					</div>
				</div>
			</div>
			<!-- <div class="row">
				<div class="form-group">
					<label for="gender" class="control-label col-sm-2"> <b>Gender*</b>
					</label>
					<div class="col-sm-6">
						<input type="radio" name="gender" value="">Male 
						<input type="radio" name="gender" value="">Female



					</div>
				</div>
			</div>
			 -->
			<div class="row">
				<div class="form-group">
					<input type="submit" style="margin-left: 50px"
						class="btn btn-primary " style="width:150px" value="Update">
				</div>
			</div>


		</div>

	</form>
	</article>

</body>
</html>