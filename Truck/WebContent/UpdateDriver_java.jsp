<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%@page import ="java.util.ArrayList"%>
    <%@page import ="java.util.Iterator"%>
    <%@page import="java.sql.ResultSet"%>
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

String idg ="";
String nameg="";
String ageg="";
String license_nog="";
String license_expirydateg="";
String driver_locationg="";

try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","");
	PreparedStatement pe=con.prepareStatement("select*from driver where id=? ");
	pe.setString(1,id);
	ResultSet rs =pe.executeQuery();
	if(rs.next())
	  {
	 idg =rs.getString(1);
	 nameg=rs.getString(2);
	 ageg=rs.getString(3);
     license_nog=rs.getString(4);
     license_expirydateg=rs.getString(5);
	 driver_locationg=rs.getString(6);	
	  }
	if(id.contentEquals("")||id.contentEquals(" "))
	{
		id=idg;
	}
	
	if(name.contentEquals("")||name.contentEquals(" "))
	{
		name=nameg;
	}
 	if(age.contentEquals("")||age.contentEquals(" "))
	{
		age=ageg;
	}
	if(license_no.contentEquals("")||license_no.contentEquals(" "))
	{
		license_no=license_nog;
	}
	
	if(license_expirydate.contentEquals("")||license_expirydate.contentEquals(" "))
	{
		license_expirydate=license_expirydateg;
	}
	
	if(driver_location.contentEquals("")||driver_location.contentEquals(" "))
	{
		driver_location=driver_locationg;
	}
	 
	/*insert values into db*/
	if(name.contentEquals("")||name.contentEquals(" "))
	{
		out.print("please enter name");
	}
	else {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","");
		PreparedStatement ps=conn.prepareStatement("update driver set name=?,age=?,license_no=?,license_expirydate=?,driver_location=? where id=?");
		ps.setString(1,name);
		ps.setString(2,age);
		ps.setString(3,license_no);
		ps.setString(4,license_expirydate);
		ps.setString(5,driver_location);
		ps.setString(6,id);
		ps.executeUpdate();
		con.close();
		
		out.print("id: "+id+"<br>");
		out.print("name: "+name+"<br>");
		out.print("emailid: "+age+"<br>");
		out.print("license_no: "+license_no+"<br>");
		out.print("license_expirydate: "+license_expirydate+"<br>");
		out.print("driver_location: "+driver_location+"<br>");
out.print("<body bgcolor=yellow><center><br><br>Suceesfully inserted<br><a href=Home.jsp>Home</a></center)</body>");
	}
}

   catch(Exception e)
        {
		out.print(e);
		}


%>
</body>
</html>