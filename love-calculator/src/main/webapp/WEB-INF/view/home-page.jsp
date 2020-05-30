<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  <!-- Spring form tag -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style type="text/css">
.err{
color:red;
position: fixed;
text-align: left;
margin-left: 20px;
}
</style>

<script type="text/javascript">
function validate(){
var yn=document.getElementById("yn").value;
var cn=document.getElementById("cn").value;
var val=document.getElementById("check").checked;


if(yn.length<3 ||cn.length<3){
	alert("Your Name & Crush Name should have length of 3 charcters...");
	return false;
}
else if(val==false){
	alert("I think you forget to put a tik");
	return false;
}
else{
	return true;
	}
}
</script>
</head>
<body>
	<div id="outer" align="center">
		<h1>Welcome to Love Calculator !</h1>
		<hr>
		<form:form action="process-homepage" method="get" modelAttribute="UserInfo"  ><!-- onsubmit="return validate()" -->
		<div id="inner">
			<p>
			<!-- We use path instead of name inside form tag -->
				<label id="label-1" for="yn">Your Name :</label> 
				<form:input  id="yn" path="username" />
				<form:errors path="username" cssClass="err"/>
			</p>
			<p>
				<label id="label-2" for="cn">Crush Name:</label> 
				<form:input id="cn" path="crushname"/>
				<form:errors path="crushname" cssClass="err"/>
				
			</p>
			<P>
			<form:checkbox path="termAndCondition" id="check"/>
			<label >I am Agreeing this is for fun !!!</label>
			<form:errors  path="termAndCondition" cssClass="err"/>
			</P>

			
			<input type="submit" value="Calculate" >
			</div>
		</form:form>
	</div>
</body>
</html>