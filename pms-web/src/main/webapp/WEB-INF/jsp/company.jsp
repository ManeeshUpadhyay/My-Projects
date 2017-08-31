<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type=text] {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    
}
</style>
</head>
<body>
	<form:form action="com_emp.do" modelAttribute="CompanyDto" method="POST">

	<div>
	<label><b>Company Name </b></label>
		<form:input path="comName" id="comName" placeholder="enter company name" />
		<br>
		<label><b>Address </b></label>
		<form:input path="comAddress" id="comAddress" placeholder="enter address"/>	
		<br>
		<label><b>Contact </b></label>
		<form:input path="contact"  placeholder="enter contact number"/>
	</div>
	<div>
	<label><b>Employee Name </b></label>
		<form:input path="empList[0].empName" placeholder="enter company name" />
		<br>
		<label><b>Address </b></label>
		<%-- <form:input path="empList[0].empAdd" id="empAdd" placeholder="enter address"/>	
		<br>
		<label><b>Contact </b></label>
		<form:input path="empList[0].empContact" id="empContact" placeholder="enter contact number"/> --%>
	</div>
	<div>
	<input type="submit" value="save">
	</div>
	</form:form>

</body>
</html>