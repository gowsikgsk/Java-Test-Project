<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*"%>
     <%@page import ="java.util.ArrayList"%>
     <%@page import ="java.util.Iterator"%>
     <%@page import="java.sql.ResultSet"%>
     <%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="Schedule_java.jsp">

<%
 int count=0;
try{
	//String id=request.getParameter("ID");
	//String name=request.getParameter("NAME");
	String a ="";
	String b ="";
	HashMap<String,String> has=new HashMap<String,String>();
	ArrayList<String> ar=new ArrayList<String>();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","");
	
	PreparedStatement pe=con.prepareStatement("select id from driver");
	ResultSet drs=pe.executeQuery();
	
	PreparedStatement p=con.prepareStatement("select name from driver");
	ResultSet dname=p.executeQuery();
	
	PreparedStatement truckid=con.prepareStatement("select id from truck");
	ResultSet tid=truckid.executeQuery();
	
	PreparedStatement truckname=con.prepareStatement("select name from truck");
	ResultSet tname=truckname.executeQuery();%>

<table height=300 width=300>
	DriverID:<input type="text" name="driverid" list="drid" ><br>
	 <datalist id="drid">
	 <% while(drs.next()){ 
		 %>
	<option value="<%=drs.getString(1)%>"><%=drs.getString(1)%></option>
	    <% 
	  } %>
	 </datalist>


     Driver Name:<input type="text" name="drivername" list="drna" ><br>
	 <datalist id="drna">
	 <% while(dname.next()){  
		    %>
	<option value="<%=dname.getString(1)%>"><%=dname.getString(1)%></option>
	    <% } %>
	 </datalist>
	 
	 
	 Truck ID:<input type="text" name="truckid" list="trid" ><br>
	 <datalist id="trid">
	 <% while(tid.next()){  
		    %>
	<option value="<%=tid.getString(1)%>"><%=tid.getString(1)%></option>
	    <% } %>
	 </datalist>
	 
	 
	 Truck Name:<input type="text" name="truckname" list="trrid" ><br>
	 <datalist id="trrid">
	 <% while(tname.next()){  
		    %>
	<option value="<%=tname.getString(1)%>"><%=tname.getString(1)%></option>
	    <% } %>
	 </datalist>
	
		<tr><td>DATE:</td><td><input type ="date" name ="DATE" placeholder="DATE"></td></tr><br><br>
<tr><td>TIME:</td><td><input type ="TIME" name ="TIME" placeholder="TIME"></td></tr><br><br>
	</table> <br><br>
	<input type="SUBMIT" value="SUBMIT"> 
	</form>
	<% 
   }//try
    catch(Exception e)
    	{
    	out.print(e);	
    	}  	
%>

</body>
</html>