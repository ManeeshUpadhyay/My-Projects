<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	<form:form action="save.do" modelAttribute="UserLoginDto" method="POST">
		<table width="100%" height="100%" border="1" bgcolor="#587686">
			<tr>
				<td align="center">EmailId :</td>
				<td align="center"><form:input path="emailId" id="emailId" />
				<form:errors path="emailId" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center">Password :</td>
				<td align="center"><form:password path="password" id="password"></form:password>
				<form:errors  path="password" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><input type="submit" value="Login">
				</td>
				<td align="center"><a href="saveRegistration.do"
					style="color: white;">Register</a>&nbsp; &nbsp;<a href="showProject.do" style="color: white;">Project
						Status</a></td>
				
			</tr>
		</table>
	</form:form>

</body>
</html>