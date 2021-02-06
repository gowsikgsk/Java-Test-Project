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
<title>create Truck</title>
</head>
<body>
<%
 int count=0;
try{
	String id=request.getParameter("ID");
	String name=request.getParameter("NAME");
	String capacity=request.getParameter("CAPACITY");
	String registration_no=request.getParameter("REGISTRATION_NO");
	String insurance_expirydate=request.getParameter("INSURANCE_EXPIRYDATE");
	String truck_type=request.getParameter("TRUCK_TYPE");
	
	String a ="";
	ArrayList<String> result=new ArrayList<String>();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","");
	PreparedStatement pe=con.prepareStatement("select id from truck");
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
    		PreparedStatement ps=co.prepareStatement("insert into truck values(?,?,?,?,?,?)");
    		ps.setString(1,id);
    		ps.setString(2,name);
    		ps.setString(3,capacity);
    		ps.setString(4,registration_no);
    		ps.setString(5,insurance_expirydate);
    		ps.setString(6,truck_type);
    		ps.executeUpdate();
    		con.close();
    		
    		out.print("id: "+id+"<br>");
    		out.print("name: "+name+"<br>");
    		out.print("emailid: "+capacity+"<br>");
    		out.print("registration_no: "+registration_no+"<br>");
    		out.print("insurance_expirydate: "+insurance_expirydate+"<br>");
    		out.print("truck_type: "+truck_type+"<br>");
    		out.print("<body bgcolor=yellow><center><br><br><br>Suceesfully inserted<br><br><br><a href=Home.jsp>Home</a></center)</body>");
    	}//esle
    		
   }//try
    catch(Exception e)
    	{
    	out.print(e);	
    	}  	
%>
<br><a href=Truck.jsp>Driver Page </a>

</body>
</html>