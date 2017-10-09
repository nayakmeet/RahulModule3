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
<form action="retrieve.obj">
 
<table border="10" align="center" cellspacing="10" cellpadding="5">

<h1 align="center"><mark>New student score updated form</mark></h1>
<tr>
		<td>Student id:&nbsp;&nbsp;</td>
		<td>
			<select name="ddlId" style="width:150px">
			<c:forEach items="${sessionScope.list}" var="list">
        <option><c:out value="${list}" /></option>
    </c:forEach>
		</select>
		</td>
		</tr>
<tr>
<br>
		<td>Subject name:&nbsp;&nbsp;</td>
		<td>
			<select name="ddlname" style="width:150px">
				<option value="Select">
				--Select--</option>
				<option value="Subject 1">
				Subject 1</option>
				<option value="Subject 2">
				Subject 2</option>
				<option value="Subject 3">
				Subject 3</option>
				<option value="Subject 4">
				Subject 4</option>
				<option value="Subject 5">
				Subject 5</option>
			</select>
		</td>
	</tr>
	<br>
	
	
	<tr>
			<td>Theory:&nbsp;&nbsp;</td>
			<td><input type="number" name="theory"/>
	</tr>
	<br>
	<tr>
			<td>MCQ:&nbsp;&nbsp;</td>
			<td><input type="number" name="mcq"/>
	</tr>
	<br>
	<tr>
			<td>Lab:&nbsp;&nbsp;</td>
			<td><input type="number" name="lab"/>
	</tr>
	<br>
	<tr>
	<td>
		<input type="submit" class="btn" value="Submit"/>
	</td>
	</table>
	</form>
</body>
</html>