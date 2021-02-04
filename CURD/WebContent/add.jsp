<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="addstudent.jsp">

body,
main::before {
 background:url(https://i.gifer.com/ExKa.gif) 0 / cover fixed;
}

main {
  margin: 70px auto;
  position: relative;
  padding: 10px 5px;
  background: hsla(0,10%,100%,.3);
  font-size: 20px;
  font-family: 'Lora', serif;
  line-height: 1.5;
  border-radius: 10px;
  width: 40%;
  box-shadow: 5px 3px 30px black;
  overflow: hidden;
}

main::before {
  content: '';
  margin: -15px;
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  filter: blur(20px);
  z-index: -1;
}

blockquote {
  font-style: italic;
}

footer {
  padding-top: 20px;
  font-weight: bold;
}

cite {
  font-style: normal;
  font-size: 22px;
}
<script src="https://raw.githack.com/strangerintheq/rgba/0.0.5/rgba.js"></script>
<h1>Registration Form </h1>
<table height=250 width=250>
<tr><td>ID:</td><td><input type ="text" name ="ID" placeholder="Enter ID"></td></tr> 
<tr><td>NAME:</td><td><input type ="text" name ="NAME" placeholder="Enter NAME"></td></tr>
<tr><td>EMAILID:</td><td><input type ="text" name ="EMAILID" placeholder="Enter EMAILID"></td></tr>
<tr><td>GENDER:</td><td><input type ="radio" name ="GENDER"  value="MALE">MALE
             <input type ="radio" name ="GENDER"  value="FEMALE">FEMALE</td></tr>
<tr><td>COURESE:</td><td><input type ="text" name ="COURSE" placeholder="Enter COURSE"></td></tr>
</table>
<input type="SUBMIT" value="SUBMIT">

</form>
</body>
</html>