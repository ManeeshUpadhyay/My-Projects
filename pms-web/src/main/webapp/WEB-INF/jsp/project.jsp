<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project</title>
</head>
<body>
	<form:form action="project.do" method="POST"
		modelAttribute="ProjectDto">
		<div>
			<table height="100%" width="100%" cellpadding="0" cellspacing="0">
				<form:hidden path="id"/>
				<tr>
					<td>Project Name</td>
					<td><form:input path="projectName" id="projectName" />
					<form:errors path="projectName" class="required" cssStyle="color:white;"></form:errors>
					</td>
				</tr>

				<tr>
					<td>Client Name</td>
					<td><form:input path="clientName" id="clientName" />
					<form:errors path="clientName" class="required" cssStyle="color:white;"></form:errors>
					</td>
				</tr>
				<tr>
					<td>Start Date</td>
					<td><form:input path="startDate" id="startDate" />
					<form:errors path="startDate" class="required" cssStyle="color:white;"></form:errors>
					</td>
				</tr>

				<tr>
					<td>End Date</td>
					<td><form:input path="endDate" id="endDate" />
					<form:errors path="endDate" class="required" cssStyle="color:white;"></form:errors>
					</td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Submit"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<div>
							<table height="100%" width="100%" cellpadding="0" cellspacing="0"
								border="1">
								<tr>
									<!-- <th>Sno.</th> -->
									<th align="center">Sno</th>
									<th align="center">Project Name</th>
									<th align="center">Client Name</th>
									<th align="center">Start Date</th>
									<th align="center">End Date</th>
									<th align="center">Action</th>
								</tr>

								<c:forEach items="${projectList}" var="project">

									<tr>
										<td align="center">${project.id}</td>
										<td align="center">${project.projectName}</td>
										<td align="center">${project.clientName}</td>
										<td align="center">${project.startDate}</td>
										<td align="center">${project.endDate}</td>
										<td align="center"><a href="updateProject.do?id=${project.id}"
					style="color: white;">Edit Project</a>&nbsp; &nbsp;<a href="deleteProject.do?id=${project.id}" style="color: white;">Delete Project</a></td>
									</tr>



								</c:forEach>
								</table>
								</div>
					</td>
				</tr>
				
			</table>
		</div>
	</form:form>
</body>
</html>