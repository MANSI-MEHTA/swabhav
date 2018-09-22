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
<s:head/>
<body>
	<h1>This is the withdrawal page</h1>
	<div >
	
		<a class=" ml-3 btn btn-info" href="/Banking-app/viewtransaction">Passbook</a>
		<a class=" ml-3 btn btn-info" href="/Banking-app/withdraw">WithDraw</a>
		<a class=" ml-3 btn btn-info" href="/Banking-app/deposit">Deposit</a>


	</div>
	
	<s:form class="form-horizontal" action="withdrawamount" theme="bootstrap">
		<div class="row">
			<div class=" ml-2 form-group col-sm-5">
				<label for="Amount">Enter Amount</label>
				<s:textfield name="userbean.amount" class="form-control" value=""
					placeholder="Enter Amount "></s:textfield>
			</div>
		</div>
		<div class="form-group">
			<s:submit value="Submit" class=" col-sm-2 btn btn-info"></s:submit>
		</div>
	</s:form>
<s:actionerror/>
</body>
</html>