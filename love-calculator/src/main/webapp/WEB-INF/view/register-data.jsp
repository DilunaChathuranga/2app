<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Registrtion Results</h1>

<hr>

<h3>${UserReg.name}</h3>
<h3>${UserReg.username}</h3>
<h3>${UserReg.password}</h3>
<h3>${UserReg.country}</h3>

<h3>
<c:forEach var="temp" items="${UserReg.hobby}">
${temp}
</c:forEach>
</h3>

<h3>${UserReg.gender}</h3>
<br>  
<h3>${UserReg.communicationDTO.email}</h3>
<br>
<h3>${UserReg.communicationDTO.phone}</h3>
</body>
</html>