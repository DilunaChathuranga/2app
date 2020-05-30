<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  <!-- Spring form tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<div id="outer" align="center">
<h1>Register Here</h1>

<div id="inner">
<form:form action="register-success" method="get" modelAttribute="UserReg">
<label>Name: </label>
<form:input path="name"/>
<br>

<label>Username: </label>
<form:input path="username"/>
<br>

<label>Password: </label>
<form:password path="password" />
<br>

<label>Country: </label>
<form:select path="country" >
<form:option value="Sri Lanka" label="Sri Lanka"></form:option>
<form:option value="India" label="India"></form:option>
<form:option value="U.S" label="America"></form:option>
</form:select>
<br>

<label>Hobbies:</label>
Travelling<form:checkbox path="hobby" value="Traveling"/> 
Crickrt<form:checkbox path="hobby" value="Cricket" />
Programming<form:checkbox path="hobby" value="Programmming" />
<br>

<label>Gender:</label>
Male<form:radiobutton path="gender" value="Male"/>
Female<form:radiobutton path="gender" value="Female" />
<br>

<input type="submit" value="Register">

</form:form>
</div>
</div>
</body>
</html>