<%@ page language="java" contentType="
text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver_id = request.getParameter("driverid");
		String driver_name = request.getParameter("drivername");
		String truck_id = request.getParameter("truckid");
		String truck_name = request.getParameter("truckname");
		String date = request.getParameter("DATE");
		String time = request.getParameter("TIME");
		
		 out.print(driver_id);
		 out.print(driver_name);
		 out.print(truck_id);
		 out.print(truck_name);
		 out.print(date);
		 out.print(time);
		 
		 

		Class.forName("com.mysql.jdbc.Driver");
		Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "");
		PreparedStatement ps = co.prepareStatement("insert into schedulevalues (?,?,?,?,?,?)");
		ps.setString(1, driver_id);
		ps.setString(2, driver_name);
		ps.setString(3, truck_id);
		ps.setString(4, truck_name);
		ps.setString(5,date);
		ps.setString(6, time);
		
		ps.executeUpdate();
		
		co.close();
		
		
	%>
</body>
</html>