<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="c"
	class="simple_add_edit_online_application.ListApplications"
	scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Applications</title>
</head>
<body>
	CS Grad Admissions
	<br>
	<br>
	<a href='AddApplication'>Add New Application</a>
	<br>
	<br>
	<table border='2'>
		<tr>
			<!-- <td>ID</td> -->
			<td><a href='Applicant'>Applicant</a></td>
			<td><a href='AppRec'>Application Recieved On</a></td>
			<td><a href='GPA'>GPA</a></td>
			<td><a href='Status'>Status</a></td>
			<td></td>
		</tr>



		<c:forEach items="${application}" var="app">
			<tr>
				<%-- <td><c:out value="${app.id}"></c:out></td> --%>
				<td><c:out value="${app.applicant}"></c:out></td>
				<td><fmt:formatDate pattern="M/d/yyyy"
						value="${app.applicationReceived}"></fmt:formatDate></td>
				<%-- <td><c:out value="${app.applicationReceived}"></c:out></td> --%>
				<td><c:out value="${app.gpa}"></c:out></td>
				<td><c:out value="${app.status}"></c:out></td>
				<td><a
					href="EditApplication?id=${app.id}&&applicant=${app.applicant}&&apprec=${app.applicationReceived}&&gpa=${app.gpa}&&status=${app.status}">Edit</a></td>
			</tr>

		</c:forEach>



	</table>
</body>
</html>