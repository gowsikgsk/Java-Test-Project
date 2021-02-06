<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Driver By ID</title>
</head>
<body>
<%
String id=request.getParameter("ID");
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","");
	PreparedStatement ps=con.prepareStatement("delete from driver where id=?");
	ps.setString(1,id);
	int pp= ps.executeUpdate();
	if(pp>0)
	{
		out.print("AP");
	}
	else
	{
		out.print("ANP");

	}	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>