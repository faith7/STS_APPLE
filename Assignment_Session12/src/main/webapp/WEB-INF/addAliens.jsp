<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aliens List</title>
</head>
<body>
<h2> Please fill in Alien information.</h2>
	<sform:form action ="addAliens" method="post" modelAttribute="alien0">
	<table>
	<%-- 	<tr><th> ID : </th><td><sform:input path="id"/></td></tr> --%>
		<tr><th> Name:  </th><td><sform:input path="name"/></td></tr>
		<tr><th> Age:  </th><td><sform:input path="age"/></td></tr>
		<tr><th> Country:</th><td><sform:input path="country"/></td><tr>
  
	</table>
	<br>
	<input type="submit" value="Submit">
	</sform:form>
	<hr>
<h2> Aliens List provided by customers</h2>

	<table border=1>
		<tr>
			<th>ID</th>
			<th>Name</th>
		    <th>Age</th>
			<th>Country</th>  	              
		</tr>
	<c:forEach var="alien" items="${aliens}">
	<tr>
		<td><c:out value="${alien.id}" /></td>
		<td><c:out value="${alien.name}" /></td>
		<td><c:out value="${alien.age}" /></td> 
		<td><c:out value="${alien.country}" /></td>                       
	</tr>
	</c:forEach>
	</table>
</body>
</html>
