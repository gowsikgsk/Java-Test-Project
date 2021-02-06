<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create driver details</title>
</head>

<body>
<form action ="CreateDriver_get.jsp">

<h1>Registration Form </h1>
<table height=350 width=350>
<tr><td>ID:</td><td><input type ="text" name ="ID" placeholder="Enter ID"></td></tr> 
<tr><td>NAME:</td><td><input type ="text" name ="NAME" placeholder="Enter NAME"></td></tr>
<tr><td>AGE:</td><td><input type ="text" name ="AGE" placeholder="Enter AGE"></td></tr>
<tr><td>LICENSE_NO:</td><td><input type ="text" name ="LICENSE_NO" placeholder="LICENSE_NO"></td></tr> 
<tr><td>LICENSE_EXPIRYDATE:</td><td><input type ="date" name ="LICENSE_EXPIRYDATE" placeholder="LICENSE_EXPIRYDATE"></td></tr>
<tr><td>DRIVER_LOCATION:</td><td><input type ="text" name ="DRIVER_LOCATION" placeholder="DRIVER_LOCATION"></td></tr> 
</table>
<input type="SUBMIT" value="SUBMIT">
</form>
<a href=Driver.jsp>Driver Page </a><br>
<a href=Home.jsp>Home Page </a>
</body>
</html>