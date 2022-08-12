<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Products</title>
</head>
<body>
	<h1>Adding a product in database using hibernate</h1>
	<br/>
	<hr>
	<form action="AddProducts" action="get">
		<label>Enter ProductId :- </label>
		<input type = "number" name = "id"/><br/>
		<label>Enter ProductName :- </label>
		<input type = "text" name = "name"/><br/>
		<label>Enter ProductCost :- </label>
		<input type = "number" name = "price"/><br/>
		<input type="submit" value="submit">
	</form>
	
</body>
</html>