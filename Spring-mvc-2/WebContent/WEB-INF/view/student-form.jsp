<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<style>
.error{color:red;}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="student">

     First name(*): <form:input path="firstName" />  
     <form:errors path="firstName" cssClass="error" />       
        <br><br>  
        Last name: <form:input path="lastName" />  
        <br><br>  
        
        Age : <form:input path="age"/>
        <form:errors path="age" cssClass="error" />
        <br /><br />
        Country :
        <form:select path="country">
        <form:option value="Brazil" label="Brazil"></form:option>
        <form:option value="India" label="India"></form:option>
        <form:option value="Indonesia" label="Indonesia"></form:option>
        <form:option value="Malaysia" label="Malaysia"></form:option>
        <form:option value="China" label="China"></form:option>
        <form:option value="Japan" label="Japan"></form:option>
        <form:option value="Nepal" label="Nepal"></form:option>
        
        </form:select>
        <br /><br />
        
        Postal Code :
        <form:input path="postalCode" />
         <form:errors path="postalCode" cssClass="error" />
         
         
         <br /><br />
        
        Gender :
        Male<form:radiobutton path="gender" value="Male" />
        
        Female<form:radiobutton path="gender" value="Female" />
        
        <br /><br />
        
        Hobbies :
        Swimming<form:checkbox path="hobbies" value="swimming"/>
        Singing<form:checkbox path="hobbies" value="singing"/>
        Reading<form:checkbox path="hobbies" value="reading"/>
        Writing<form:checkbox path="hobbies" value="writing"/>
        Dancing<form:checkbox path="hobbies" value="dancing"/>
        
        
        <br /><br />
        
        Course Code :
        <form:input path="courseCode" />
         <form:errors path="courseCode" cssClass="error" />
         
         
         <br /><br />
        <input type="submit" value="Submit" />      
</form:form>
</body>
</html>