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
	<h1>Login Page</h1>
	<s:form class="form-horizontal" theme="bootstrap">
		<div class="row">
			<div class=" ml-2 form-group col-sm-5">
				<label for="Username">Username</label>
				<s:textfield name="userbean.username" class="form-control" value=""
					placeholder="Username"></s:textfield>
			</div>
		</div>
		<div class="row">
			<div class=" ml-2 form-group col-sm-5">
				<label for="Password">Password</label>
				<s:password name="userbean.password" class="form-control" value=""
					placeholder="Password"></s:password>
			</div>
		</div>

		<div class="form-group">
			<s:submit value="sign in" class=" ml-3 col-sm-2 btn btn-info"
				action="authenticateuser"></s:submit>
			<s:submit value="sign up" class=" col-sm-2 btn btn-info"
				action="signup"></s:submit>
		</div>

		<div class="form-group">
			

		</div>

	</s:form>
	<s:actionerror />
</body>
</html>