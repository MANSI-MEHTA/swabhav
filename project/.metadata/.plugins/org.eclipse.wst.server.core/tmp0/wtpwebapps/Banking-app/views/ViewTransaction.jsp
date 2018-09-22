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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style type="text/css">
select {
	width: 200px;
	height: 35px;
}
</style>
<!-- 
<script>
	$(document).ready(function() {
		var type_selection = $("body").find("#transaction_type");
		type_selection.change(function() {
			var type = type_selection.val();
			if (type === "deposit" || type === "withdraw") {
				console.log(type)
				$.ajax({
					method : "GET",
					url : "http://localhost:8080/Banking-app/" + type,
					success : function(data) {
						
					}
				})
			}

		})
	})
</script> -->
</head>

<body>
	<h3>This is the home page</h3>


	<div>

		<a class=" ml-3 btn btn-info" href="/Banking-app/passbook">Passbook</a>
		<a class=" ml-3 btn btn-info" href="/Banking-app/withdraw">WithDraw</a>
		<a class=" ml-3 btn btn-info" href="/Banking-app/deposit">Deposit</a>
		<s:property value="username" />
		<span><a class=" ml-6 btn btn-info" href="/Banking-app/logout">Logout</a></span>


	</div>
	<br>
	<br>
	<s:if test="%{!transactions.isEmpty()}">Your All transaction
	
			<a class="rl-4 btn btn-info" href="/Banking-app/downloadtransaction">Download
			passbook</a>
		<br>


		<table class="table table-responsive">
			<tr>
				<th>Ref_No</th>
				<th>Narration</th>
				<th>Date</th>
				<th>Amount</th>
				<th>Type</th>



			</tr>
			<s:iterator value="transactions" var="list">
				<tr>
					<td><s:property value="transaction_id" /></td>
					<td><s:property value="narration" /></td>
					<td><s:property value="transaction_date" /></td>
					<td><s:property value="amount" /></td>
					<td><s:property value="transaction_type" /></td>

				</tr>
			</s:iterator>
		</table>
	</s:if>
	<s:else>
You have not done any transaction yet.

</s:else>

</body>
</html>