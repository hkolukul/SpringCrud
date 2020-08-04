<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>JAWAHAR NAVODAYA VIDHYALAYA</h2>
	<h3>Edit student --> ${student.name}</h3>
	<form action="/SpringCRUD/update" method="post">
			<table border="1">
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" value="${student.id}"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${student.name}"></td>
			</tr>	
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" value="${student.age}"></td>
			</tr>
			<tr>
				<td>Class</td>
				<td><input type="text" name="presentClass" value="${student.presentClass}"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" value="${student.city}"></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="contact" value="${student.contact}"></td>
			</tr>		
		</table>
		<p><input type="submit" name="submit"></p>
	</form>
	</div>
</body>
</html>