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
<center>
<%
String id=request.getParameter("ID");
String name=request.getParameter("Name");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
//PreparedStatement ps=con.prepareStatement("select id from sms1");
PreparedStatement ps=con.prepareStatement("select*from sms1 where id=?");
/*ps.setString(1,id);
ps.setString(2,name);*/

ResultSet rs=ps.executeQuery();
String a=rs.getString(1);
String b=rs.getString(2);
while(rs.next())
{
out.print(rs.getString(1)+"&nbsp;&nbsp;"+rs.getString(2)+"&nbsp;&nbsp;"+rs.getString(3)+"&nbsp;&nbsp;"+rs.getString(4)+"&nbsp;&nbsp;"+rs.getString(5));
}
}
catch(Exception e)
    {
out.println(e);
    } 
%>
</center>
</body>
</html>