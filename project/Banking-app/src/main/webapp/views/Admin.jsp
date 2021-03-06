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
<body>
	<h1>This is the Admin Page</h1>
	<table class="table table-responsive">
		<tr>
			<th>sr.no</th>
			<th>Acc_NO</th>
			<th>First Name</th>
			<th>List Name</th>
			<th>State</th>
			<th>Change State</th>

		</tr>
		<s:iterator value="listofusers" status="list" var="check">
			<tr>
				<td><s:property value="#list.index" /></td>
				<td><s:property value="user_id" /></td>
				<td><s:property value="fname" /></td>
				<td><s:property value="lname" /></td>

				<td><s:property value="state"></s:property></td>
				<td><s:if test="%{#check.state=='activate'}">
						<a href="/Banking-app/lock?id=<s:property value="user_id"/>">unactivate</a>
					</s:if> <s:elseif test="%{#check.state=='unactivated'}">
						<a href="/Banking-app/unlock?id=<s:property value="user_id"/>">activate</a>
					</s:elseif> <s:elseif test="%{#check.state=='locked'}">
						<a href="/Banking-app/unlock?id=<s:property value="user_id"/>">unlock</a>
					</s:elseif> <s:elseif test="%{#check.state=='unlocked'}">
						<a href="/Banking-app/lock?id=<s:property value="user_id"/>">lock</a>
					</s:elseif></td>
			</tr>
		</s:iterator>
	</table>
	<a href="/Banking-app/logout" class="btn btn-danger">Logout</a>
</body>
</html>