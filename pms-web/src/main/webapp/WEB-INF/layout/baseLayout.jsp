<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>baseLayout</title>
</head>
<body>
	<table bgcolor="#AABBCC" height="100%" width="100%" border="1">
		<tr height="5%">
			<td><tiles:insertAttribute name="header"></tiles:insertAttribute>
			</td>
		</tr>
		<tr height="3%">
			<td><tiles:insertAttribute name="menu"></tiles:insertAttribute></td>
		</tr>
		<tr >
			<td><tiles:insertAttribute name="body"></tiles:insertAttribute></td>

		</tr>
		
		<tr height="5%">
			<td><tiles:insertAttribute name="footer"></tiles:insertAttribute></td>

		</tr>
		
	</table>
</body>
</html>