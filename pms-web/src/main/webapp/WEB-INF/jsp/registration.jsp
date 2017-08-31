<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>

	<form:form action="register.do" modelAttribute="RegistrationDto"
		method="POST">
		<table width="100%" height="100%" border="1" >
			<tr>
				<td align="center"><form:label path="firstName"><spring:message code="label.firstName" text="First Name"/></form:label></td>
				<td align="center"><form:input path="firstName" id="firstName" />
				<form:errors path="firstName" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="lastName"><spring:message code="label.lastName" text="Last Name"/></form:label></td>
				<td align="center"><form:input path="lastName" id="lastName" />
				<form:errors path="lastName" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="contact"><spring:message code="label.contact" text="Contact"/></form:label></td>
				<td align="center"><form:input path="contact" id="contact" />
				<form:errors path="contact" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="address"><spring:message code="label.address" text="Address"/></form:label></td>
				<td align="center">
				<form:input path="address"/>
				<form:errors path="address" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="emailId"><spring:message code="label.emailId" text="EmailId"/></form:label></td>
				<td align="center"><form:input path="emailId" id="emailId" />
				<form:errors path="emailId" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center"><form:label path="password"><spring:message code="label.password" text="Password"/></form:label></td>
				<td align="center"><form:password path="password" id="password" />
				<form:errors path="password" class="required" cssStyle="color:pink;"></form:errors>
				</td>

			</tr>

			<tr>
				<td align="center" colspan="2"><input type="submit" value="<spring:message code="label.submit" text="Submit"/>">
				</td>

			</tr>

		</table>
	</form:form>
</body>
</html>