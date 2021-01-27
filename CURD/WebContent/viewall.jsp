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
<table height=200 width=200 border=1>
<tr>
<th>ID</th>
<th>NAME</th>
<th>GENDER</th>
<th>EMAIL</th>
<th>COURSE</th>
<br>
</tr>
<%
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
PreparedStatement ps=con.prepareStatement("select*from sms1");

ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
	<tr><td><br><%out.print(rs.getString(1));%><br><br></td>
	<td><br><%out.print(rs.getString(2));%><br><br></td>
	<td><br><%out.print(rs.getString(3));%><br><br></td>
	<td><br><%out.print(rs.getString(4));%><br><br></td>
	<td><br><%out.print(rs.getString(5));%><br><br></td></tr>
	<%
	//out.print(rs.getString(1)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(2)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(3)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(4)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(5)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString(6)+"<br><br>");
}

%>
</table>
</center>
<%
}
catch(Exception e)
{
	System.out.println(e);
}
%>

</body>
</html>