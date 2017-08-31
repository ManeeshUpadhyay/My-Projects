<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveUpdate.do" method="POST"
		modelAttribute="project">
		<div>
			<c:forEach items="${projectList}" var="ProjectDto">
				<table height="100%" width="100%" cellpadding="0" cellspacing="0">
					<form:hidden path="id" />
					<tr>
						<td>Project Name</td>
						<td>
						<input type="hidden" name="cid" value="${ ProjectDto.id}">
						<form:input path="projectName" id="projectName" value="${ProjectDto.projectName} "/> <form:errors
								path="projectName" class="required" cssStyle="color:white;"></form:errors>
						</td>
					</tr>

					<tr>
						<td>Client Name</td>
						<td><form:input path="clientName" id="clientName" value="${ProjectDto.clientName}"/> <form:errors
								path="clientName" class="required" cssStyle="color:white;"></form:errors>
						</td>
					</tr>
					<tr>
						<td>Start Date</td>
						<td><form:input path="startDate" id="startDate" value="${ProjectDto.startDate}" /> <form:errors
								path="startDate" class="required" cssStyle="color:white;"></form:errors>
						</td>
					</tr>

					<tr>
						<td>End Date</td>
						<td><form:input path="endDate" id="endDate" value="${ProjectDto.endDate}"  /> <form:errors
								path="endDate" class="required" cssStyle="color:white;"></form:errors>
						</td>
					</tr>

					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>

				</table>
			</c:forEach>

		</div>
	</form:form>
</body>
</html>