<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="CreateTruck_java.jsp">

<h1>Truck Registration Form </h1>
<table height=350 width=350>
<tr><td>ID:</td><td><input type ="text" name ="ID" placeholder="Enter ID"></td></tr> 
<tr><td>NAME:</td><td><input type ="text" name ="NAME" placeholder="Enter NAME"></td></tr>
<tr><td>CAPACITY:</td><td><input type ="text" name ="CAPACITY" placeholder="Enter CAPACITY OF TRUCK"></td></tr>
<tr><td>REGISTRATION_NO:</td><td><input type ="text" name ="REGISTRATION_NO" placeholder="REGISTRATION_NO"></td></tr> 
<tr><td>INSURANCE_EXPIRYDATE:</td><td><input type ="date" name ="INSURANCE_EXPIRYDATE" placeholder="INSURANCE_EXPIRYDATE"></td></tr>
<tr><td>TRUCK_TYPE:</td><td><input type ="text" name ="TRUCK_TYPE" placeholder="TRUCK_TYPE"></td></tr> 
</table>
<input type="SUBMIT" value="SUBMIT">
</form>
<a href=Truck.jsp>Driver Page </a>
<a href=Home.jsp>Home Page </a>
</body>
</html>