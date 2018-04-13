<%@page import="java.util.List"%>
<%@page import="it.manpower.studentapp.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="students">
		Name: <input type="text" name="name">
		Surname: <input type="text" name="surname">
		Code: <input type="text" name="code">
		
		<input type="submit">
	
	</form>

	<table border="1">
		<thead>
			<td>Name</td><td>Surname</td><td>Code</td>
		</thead>
		<% for( Student s : (List<Student>)request.getAttribute("students") ){ %>
			<tr>
				<td><%= s.getName() %></td>
				<td><%= s.getSurname() %></td>
				<td><%= s.getCode() %></td>
			</tr>
		<% } %>
	
	</table>
	
</body>
</html>