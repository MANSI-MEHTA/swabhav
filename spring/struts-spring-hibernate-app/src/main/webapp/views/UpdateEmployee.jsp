<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="/updateemployee" method="post">
		<s:textfield type="number" name="employee.emp_id" label="Id" value="%{employee.emp_id}"></s:textfield>
		<s:textfield name="employee.emp_name" label="Full Name" value="%{employee.emp_name}"></s:textfield>
		<s:textfield name="employee.salary" label="salary" value="%{employee.salary}"></s:textfield>
		<s:submit value="ADD"></s:submit>
	</s:form>

</body>
</html>