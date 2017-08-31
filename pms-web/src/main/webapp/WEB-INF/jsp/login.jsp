<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>
	<form:form action="save.do" modelAttribute="UserLoginDto" method="POST">
		<table width="100%" height="100%" border="1" bgcolor="#587686">
			<tr>
				<td align="center"><form:label path="emailId"><spring:message code="label.emailId" text="EmailId"/></form:label></td>
				<td align="left"><form:input path="emailId" id="emailId" />
				<form:errors path="emailId" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="password"><spring:message code="label.password" text="Password"/></form:label></td>
				<td align="left"><form:password path="password" id="password"></form:password>
				<form:errors  path="password" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><input type="submit" value="<spring:message code="label.login" text="Login"/>">
				</td>
				<td><a href="saveRegistration.do" style="color: white;">Register</a></td>
				
			</tr>
		</table>
	</form:form>

</body>
</html>