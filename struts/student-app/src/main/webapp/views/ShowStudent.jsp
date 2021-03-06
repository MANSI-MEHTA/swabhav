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
<script>
function ConfirmDeletion(id){
	console.log(id);
	var result=confirm("are you want to delete?");
	if(result){
		window.location.href="http://localhost:8080/student-app/deletestudent?id="+id;
		return true;
	}
	else{
		return false;
	}
	
}
</script>

<body>

	<h1>Students Details</h1>
	<table class="table table-responsive">
		<tr>
			<th>ROllNO</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>CGPI</th>
			<th>GENDER</th>
			<th>EDIT</th>
			<th>DELETE</th>



		</tr>
		<s:iterator value="listOfStudents" var="list">
			<tr>
				<td><s:property value="rollno" /></td>
				<td><s:property value="fname" /></td>
				<td><s:property value="lname" /></td>
				<td><s:property value="cgpi" /></td>
				<td><s:property value="gender" /></td>
				<td><a
					href="/student-app/editstudent?id=<s:property value="rollno"/>"
					class="btn btn-primary">EDIT</a></td>
				<td><a onclick="ConfirmDeletion(<s:property value='rollno'/>)"
					href="javascript:void(0);" class="btn btn-danger">Delete</a></td>

			</tr>
		</s:iterator>
	</table>
	<a href="/student-app/addstudent" class="btn btn-info">Add Student</a>
	<s:if test="sessionMap.username==null">
		<a href="/student-app/login" class="btn btn-primary">Login</a>
	</s:if>
	<s:else>
		<a href="/student-app/logout" class="btn btn-primary">logout</a>
	</s:else>
</body>
</htmt>