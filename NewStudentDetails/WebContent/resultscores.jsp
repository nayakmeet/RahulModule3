<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(session.getAttribute("id").toString());
String name = session.getAttribute("name").toString();
int total = Integer.parseInt(session.getAttribute("total").toString());
String grade = session.getAttribute("grade").toString();
%>
<form>
<table border="10" align="center" cellspacing="10" cellpadding="5">
<tr>
	<td>Student Id</td>
	<td><%=id %>
</tr>

<tr>
	<td>Subject name</td>
	<td><%=name %> 
</tr>

<tr>
	<td>Total Score</td>
	<td><%=total %> 
</tr>

<tr>
	<td>Grade</td>
	<td><%=grade %>
</tr>
hello
</table>
</form>
</body>
</html>