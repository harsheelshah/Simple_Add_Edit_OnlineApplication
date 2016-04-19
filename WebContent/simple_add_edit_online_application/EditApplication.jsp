<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EditApplication</title>
</head>
<body>

<a href = 'ListApplications'>CS Grad Admissions</a>>Edit Application
<br><br>

<form action = "EditApplication" method = "post">
 <table  border=2>
 <tr><td>Applicant:<input type = 'text' name = "applicant" value = "${a.applicant}"  /></td></tr>
 <tr><td>Application Recieved On(M/d/yyyy):<input type = 'text' name = "apprec" value = "<fmt:formatDate pattern="M/d/yyyy" value="${a.applicationReceived}"></fmt:formatDate>"></td></tr>
 <%-- <tr><td>Application Recieved On(M/d/yyyy):<input type = 'text' name = "apprec" value = "${apprec}"  /></td></tr> --%>
 <tr><td>GPA:<input type = 'text' name = "gpa" value = "${a.gpa}"  /></td></tr>
 <tr><td>Status:<select name="status">
<option value="Application Incomplete" ${a.status == 'Application Incomplete' ?'selected' : '' }>Application Incomplete</option>
<option value="Pending Review" ${a.status == 'Pending Review' ?'selected' : '' } >Pending Review</option>
<option value="Rejected" ${a.status == 'Rejected' ?'selected' : ''} >Rejected</option>
<option value="Accepted" ${a.status == 'Accepted' ?'selected' : '' } >Accepted</option>
<option value="Admission Offer Sent" ${a.status == 'Admission Offer Sent' ?'selected' : '' } >Admission Offer Sent</option>
<option value="Admission Offer Accepted" ${a.status == 'Admission Offer Accepted' ?'selected' : '' } >Admission Offer Accepted</option>
 </select>

 <tr><td><input type = "submit" name = "Save" value ="Save"></td></tr>
  <tr><td><input type = "hidden" name = "id" value ="${a.id}"></td></tr>
  
</table>
</form>

</body>
</html>