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
	<h3>
		Current Date:
		<s:property value="date" />
	</h3>
	<h3>
		Method Type:
		<s:property value="methodtype" />
	</h3>
	<s:form action="browse">
		<s:hidden name="postback" value="true" />
		<s:submit key="submit" />
	</s:form>
</body>
</html>