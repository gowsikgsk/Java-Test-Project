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
String name=request.getParameter("NAME");
String phoneno=request.getParameter("PHONENO");
session.setAttribute("hello",name);
session.setAttribute("your phone no is",phoneno);
/*try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webappdb","root","");
	PreparedStatement ps=con.prepareStatement("insert into sms1 values(?,?)");
	ps.setString(1,name);
	ps.setString(2,phoneno);
	ps.executeUpdate();
	con.close();
	
}
catch(Exception e)
{
	out.println(e);
}
*/
out.print("name: "+name+"<br>");
out.print("phoneno: "+phoneno+"<br>");
%>
<a href="Info.jsp">nwh
</a>

</body>
</html>