<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head />
<body>
	<h1>Login Page</h1>
	<s:form>
		<s:textfield name="username" value="" label="Username"></s:textfield>


		<s:password name="password" value="" label="Password"></s:password>

		<s:submit value="sign in" action="authentication"></s:submit>
		<s:submit value="sign up" action="registercustomer"></s:submit>
	</s:form>
	<s:actionerror />
</body>
</html>