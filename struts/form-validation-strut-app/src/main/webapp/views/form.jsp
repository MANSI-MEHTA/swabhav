<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.red {
	color: red;
}
</style>
<s:head />
</head>
<body>
	<s:form action="showjson">
		<s:textfield name="beam.fname" label="First Name"></s:textfield>
		<s:textfield name="beam.lname" label="Last Name"></s:textfield>
		<s:textfield type="number" name="beam.rollno" label="Rollno"></s:textfield>
		<s:password name="beam.password" label="Password"></s:password>
		<s:submit value="submit"></s:submit>
	</s:form>


</body>
</html>