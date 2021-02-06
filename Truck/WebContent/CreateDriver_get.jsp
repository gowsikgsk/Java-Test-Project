<%@page import="java.util.ArrayList"%>
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
<title>Ijkxbjhx zcbjh zxhjb </title>
</head>
<body>
<%
 int count=0;
try{
	String id=request.getParameter("ID");
	String name=request.getParameter("NAME");
	String age=request.getParameter("AGE");
	String license_no=request.getParameter("LICENSE_NO");
	String license_expirydate=request.getParameter("LICENSE_EXPIRYDATE");
	String driver_location=request.getParameter("DRIVER_LOCATION");
	
	String a ="";
	ArrayList<String> result=new ArrayList<String>();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","");
	PreparedStatement pe=con.prepareStatement("select id from driver");
	ResultSet rs=pe.executeQuery();//stat.executeQuery("select id from driver");
	
	int columncount=rs.getMetaData().getColumnCount();
	out.print(columncount+" =cloumn count  ");
	int i=0;
	while(rs.next())
	{
	    a=rs.getString(1);
		result.add(a);	//	out.print(rs.getString("id"));
		//out.print(rs.getString(1));
	}
	if(result.contains(id))
    	{
    out.print("invaild id  ");
    	}
    	else {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/TMS","root","");
    		PreparedStatement ps=co.prepareStatement("insert into driver values(?,?,?,?,?,?)");
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
    	}//esle
    		
   }//try
    catch(Exception e)
    	{
    	out.print(e);	
    	}  	
%>
<a href=Driver.jsp>Driver Page </a>
<a href=Home.jsp>Home Page </a>
</body>
</html>