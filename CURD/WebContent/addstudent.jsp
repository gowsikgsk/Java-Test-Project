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
String name=request.getParameter("NAME");
String emailid=request.getParameter("EMAILID");
String gender=request.getParameter("GENDER");
String course=request.getParameter("COURSE");
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
	PreparedStatement ps=con.prepareStatement("insert into sms1 values(?,?,?,?,?)");
	ps.setString(1,id);
	ps.setString(2,name);
	ps.setString(3,emailid);
	ps.setString(4,gender);
	ps.setString(5,course);
	ps.executeUpdate();
	con.close();
	
}
catch(Exception e)
{
	out.println(e);
}
out.print("id: "+id+"<br>");
out.print("name: "+name+"<br>");
out.print("emailid: "+emailid+"<br>");
out.print("gender: "+gender+"<br>");
out.print("course: "+course+"<br>");
out.print("<body bgcolor=green><center><br><br><br>Suceesfully inserted<br><br><br><a href=Home.jsp>Home</a></center)</body>");
%>
</body>
</html>