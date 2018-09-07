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
	<s:form action="/login" methos="post">
		<s:textfield name="loginBeam.username" value="" label="Username"></s:textfield>


		<s:password name="loginBeam.password" value="" label="Password"></s:password>

		<s:submit value="sign in"></s:submit>
		
	</s:form>
	<s:actionerror/>
</body>
</html>