<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
p{
  margin-top:50px;
  color: blue;
  text-indent: 500px;
  font-size: 20px; 

}
input{
border-radius: 10px;
margin-left: 500px; 
background-color:silver;

}
h1{
color: highlighttext;
padding-left: 10px;
background-color: teal;

}
</style>

<body>


if(session.getAttribute("adminName")==null)
{
	response.sendRedirect("admin.html");
}
%>
<div align="center">

<h1 >Admin User Choice</h1>
</div>

<form action="">
<p>Insert Train Details </p>
<a href="insertTrain.html" >

<input type="button" value="CLICK TO INSERT TRAIN DETAILS" >
<br>

</a>
<p>Update Train Details </p>
<a href="updateTrain.html" >

<input type="button" value="CLICK TO UPDATE TRAIN DETAILS" >
<br>

</a>
<p>Find Train Details By Train No </p>
<a href="insertTrain.html" >

<input type="button" value="CLICK TO FIND TRAIN" >
<br>

</a>
<p>Delete Train Details </p>
<a href="insertTrain.html" >

<input type="button" value="CLICK TO  DELETE TRAIN DETAILS" >
<br>

</a>



</form>
</body>
</html>