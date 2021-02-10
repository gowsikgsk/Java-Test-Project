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
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
	PreparedStatement ps=con.prepareStatement("delete from sms1 where id=?");
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
<a href=Driver.jsp>Driver Page </a>
<a href=Home.jsp>Home Page </a>
</body>
</html>