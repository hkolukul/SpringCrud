<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>JAWAHAR NAVODAYA VIDHYALAYA</h2>
 <h3>List of Students</h3>
<a href="enroll">Register</a>
 </div>
<br>
<br>
<br>
<div align="center">
       <table border=1 class="table table-bordered" style="width: 300px">
         <tr>
           <th>Id</th>
           <th>Name</th>
           <th>Age</th>
           <th>City</th>
           <th>Contact</th>
           <th>PresentClass</th>
           <th>Edit/Delete</th>
         </tr>
         <c:forEach items="${students}" var="student">
         <tr>
           <td width="60" align="center">${student.id}</td>
           <td width="60" align="center">${student.name}</td>
           <td width="60" align="center">${student.age}</td>
           <td width="60" align="center">${student.city}</td>
           <td width="60" align="center">${student.contact}</td>
           <td width="60" align="center">${student.presentClass}</td>
           <td width="60" align="center"><a href="edit/${student.id}">Edit</a>/<a href="delete/${student.id}">Delete</a></td>
         </tr>
      </c:forEach>
    </table>
  </div>
</body>
</html>