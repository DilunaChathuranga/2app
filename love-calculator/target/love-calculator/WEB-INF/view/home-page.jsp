<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  <!-- Spring form tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<script type="text/javascript">
function validateDetails(){
	
	var uname=document.getElementById("yn").value;
	var cname=document.getElementById("cn").value;
	if(uname=="" ||cname==""){
		console.log("Empty...False");
		return false;
	}
	else
		{
		console.log("you okay..True");
		return true;}
}
</script>
</head>
<body>
	<div id="outer" align="center">
		<h1>Welcome to Love Calculator !</h1>
		<hr>
		<form:form action="process-homepage" method="get" modelAttribute="UserInfo" onclick="return validateDetails()">
		<div id="inner">
			<p>
			<!-- We use path instead of name inside form tag -->
				<label id="label-1" for="yn">Your Name :</label> 
				<form:input  id="yn" path="username" />
			</p>
			<p>
				<label id="label-2" for="cn">Crush Name:</label> 
				<form:input id="cn" path="crushname"/>
			</p>

			
			<input type="submit" value="Calculate" >
			</div>
		</form:form>
	</div>
</body>
</html>