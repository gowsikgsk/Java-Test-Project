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
String S=(String) session.getAttribute("hello");
String SS=(String) session.getAttribute("your phone no is");
out.print(S+"<br>");
out.print(SS);
%>
</body>
</html>