<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*"%>
     
     <% //---------This-Page--Not---Used---- %>
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
String age=request.getParameter("AGE");
String license_no=request.getParameter("LICENSE_NO");
String license_expirydate=request.getParameter("LICENSE_EXPIRYDATE");
String driver_location=request.getParameter("DRIVER_LOCATION");
String a ="";

try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","");
	PreparedStatement pe=con.prepareStatement("select*from driver where id=? ");
	pe.setString(1,id);
	ResultSet rs =pe.executeQuery();
	 a =rs.getString(1);
	out.print(a);
}

catch(Exception e)
{
	if(a=="")
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","");
		PreparedStatement ps=con.prepareStatement("insert into driver values(?,?,?,?,?,?)");
		ps.setString(1,id);
		ps.setString(2,name);
		ps.setString(3,age);
		ps.setString(4,license_no);
		ps.setString(5,license_expirydate);
		ps.setString(6,driver_location);
		ps.executeUpdate();
		con.close();
		
		out.print("id: "+id+"<br>");
		out.print("name: "+name+"<br>");
		out.print("emailid: "+age+"<br>");
		out.print("license_no: "+license_no+"<br>");
		out.print("license_expirydate: "+license_expirydate+"<br>");
		out.print("driver_location: "+driver_location+"<br>");
		out.print("<body bgcolor=green><center><br><br><br>Suceesfully inserted<br><br><br><a href=Home.jsp>Home</a></center)</body>");
		}
		else
		{
			out.print("id already have");
		}
	//out.println(e);
}
out.print(a);
//if(a=="")


%>
</body>
</html>