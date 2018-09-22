<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<s:head />
<body>
	<h1>signUp Page</h1>
	<s:form class="form-horizontal" action="/registeruser" method="POST">

		<div class="form-group">
			<label for="Name"></label>
			<s:textfield name="userbean.fname" class="form-control" value=""
				placeholder="First Name"></s:textfield>
		</div>
		<div class="form-group">
			<label for="Name"></label>
			<s:textfield name="userbean.lname" value="" placeholder="Last Name"></s:textfield>
		</div>

		<div class="form-group">
			<label for="email"></label>
			<s:textfield type="email" class="form-control" name="userbean.email"
				value="" placeholder="Email id"></s:textfield>
		</div>

		<div class="form-group">
			<label for="contact"></label>
			<s:textfield type="number" class="form-control"
				name="userbean.contact" value="" placeholder="Contact">
			</s:textfield>
		</div>

		<div class="form-group">
			<label for="Date"></label>
			<s:textfield type="date" class="form-control" name="userbean.dob"
				value="" placeholder="DOB">
			</s:textfield>
		</div>

		<div class="form-group">
			<label for="Address"></label>
			<s:textarea name="userbean.address" class="form-control" value=""
				placeholder="Address">
			</s:textarea>
		</div>

		<div class="form-group">
			<label for="username"></label>
			<s:textfield name="userbean.username" class="form-control" value=""
				placeholder="Username">
			</s:textfield>
		</div>

		<div class="form-group">
			<label for="password"></label>
			<s:password name="userbean.password" class="form-control" value=""
				placeholder="password"></s:password>
		</div>
		
		<div class="form-group">
			<s:submit value="sign up"></s:submit>
		</div>
		
		
	</s:form>
	<s:actionerror />
</body>
</html>