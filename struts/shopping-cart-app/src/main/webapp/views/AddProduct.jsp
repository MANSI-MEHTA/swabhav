<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-jquery-tags"%>

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
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</head>
<s:head />

<body>
	<script>
		$(document).ready(function() {
			var button = $("body").find("#changequantity");
			button.click(function() {
				
				$quantity = $("body").find("#quantity").text();
				$lineitemid = $("body").find("#lineitemid").data("value");
				console.log($lineitemid)
				
				console.log($quantity);
				var data=[{
					id:$lineitemid,
					quantity:$quantity
				}]
				var jsondata=JSON.stringify(data);
				$.ajax({
					method:"POST",
					url:"http://localhost:8080/shopping-cart-app/updatelineitem",
					data:jsondata,
					dataType:"json",
					success: function(data){
						var updatedquantity=JSON.parse(data);
						
					}
					
				})
				
				
			})
		})
	</script>
<!--<script>
		function changequantity() {
			//$ajax({
			//	method:"GET"
			//	url:"http://numbersapi.com/" + 
			//})
			
			console.log(value);
			console.log(2);
		}
	</script>-->
<s:form action="showcart" method="POST">
	<s:select list="%{productbeam.hashofproducts}" label="Select Product"
		name="productbeam.id" headerKey="-1" headerValue="Select product"
		listKey="key" listValue="value"></s:select>
	<s:textfield name="productbeam.quantity" label="Quantity" value="1"></s:textfield>
	<s:submit value="add to cart"></s:submit>
</s:form>
<s:if test="%{!productbeam.listofproductsincart.isEmpty()}">Your cart
	<table class="table table-responsive" rules="all">
		<tr>
			<th>#</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>price</th>
			<th>total price</th>
			<th>DELETE</th>
			<th>update</th>
		</tr>
		<s:iterator value="%{productbeam.listofproductsincart}" status="list">
			<s:iterator>
				<tr>

					<td><s:property value="#list.index" /></td>

					<td><s:property value="value.name" /></td>
					<td id="quantity" contenteditable><s:property
							value="key.quantity" /></td>
					<td><s:property value="value.cost" /></td>
					<td><s:property value="key.total_price" /></td>
					<td><a
						href="/shopping-cart-app/deletelineitem?id=<s:property value='key.id' />"
						class="btn btn-danger">Delete</a>
					<td id="lineitemid" data-value="<s:property value='key.id'/>"><s:a
							href="javascript:void(0);" id="changequantity">update</s:a></td>
				</tr>

			</s:iterator>
		</s:iterator>

	</table>
</s:if>
</body>
</html>