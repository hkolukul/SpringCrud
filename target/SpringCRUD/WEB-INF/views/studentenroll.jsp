<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JNV Student Registration</title>
</head>
<body>
<div align="center">
	<h2>JAWAHAR NAVODAYA VIDHYALAYA</h2>
	<h3>Student Registrations</h3>
	<form action="/SpringCRUD/register" method="post">
			<table border="1">
			<tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>	
			<tr>
				<td>Age</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>Class</td>
				<td><input type="text" name="presentClass"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="contact"></td>
			</tr>		
		</table>
		<p><input type="submit" name="submit"></p>
	</form>
</div>
</body>
</html>