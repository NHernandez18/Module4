<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>My Car Inventory :)</title>
</head>
<body>
	<h1>Car Inventory</h1>
	<form action="getCarServlet" method="post">
	Enter the vehicle you would like to add to your inventory:
	<input type="text" name="addedCar" size="10">
	<input type="submit" value="Add Vehicle" />
	</form>
	
	<form action="throwCarServlet" method="post">
	Enter the vehicle you would like to erase from your inventory:
	<input type="text" name="erasedCar" size="10">
	<input type="submit" value="Erase Vehicle" />
	</form>
</body>
</html>