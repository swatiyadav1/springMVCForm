<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
the Student is confirmed succesfully - 
${student.firstName} ${student.lastName}

<br /><br />

Age : ${student.age}
<br /><br />


Country : ${student.country}

<br /><br />

Gender : ${student.gender}

<br /><br />

Postal Code : ${student.postalCode}

<br /><br />


Hobbies :

<ul>
<c:forEach var="temp" items="${student.hobbies}" >
<li>${temp}</li>

</c:forEach>
</ul>
</body>
</html>