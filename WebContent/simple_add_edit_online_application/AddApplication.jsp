<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Application</title>
</head>
<body>

<a href = 'ListApplications'>CS Grad Admissions</a>>Add New Application
<br><br>

<form action='AddApplication' method='post'>
<table border = 2>


<tr><td>Applicant: </td><td><input type='text' name='Applicant' required  /> </td></tr>
<tr><td>Application Recieved On(M/d/yyyy): </td><td><input type='text' name='AppRec' required /> </td></tr>
<tr><td>GPA: </td><td><input type='text' name='GPA' /> </td></tr>

<tr><td>Status:</td><td><select name="Status">
	<option  name = "Application Incomplete" value="Application Incomplete" >Application Incomplete</option>
 	<option  name = "Pending Review" value="Pending Review" >Pending Review</option>
 	<option  name = "Rejected " value="Rejected " >Rejected </option>
 	<option  name = "Accepted " value="Accepted " >Accepted </option>
 	<option  name = "Admission Offer Sent" value="Admission Offer Sent" >Admission Offer Sent</option>
 	<option  name = "Admission Offer Accepted" value="Admission Offer Accepted" >Admission Offer Accepted</option>
</select></td></tr>

<tr><td><input type='submit' name='submit' value='Submit' /></td></tr>

</table>
</form>

</body>
</html>