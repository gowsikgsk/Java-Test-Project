<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
String id=request.getParameter("ID");
String course=request.getParameter("COURSE");
//JDBC

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
	PreparedStatement ps=con.prepareStatement("update sms1 set course=?,where id=?");
	ps.setString(1,id);
	ps.setString(2,course);
	ps.executeUpdate();
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
out.print("ID: "+id+"<br><br>");

out.print("COURSE: "+course+"<br><br>");

%>
</body>
</html>