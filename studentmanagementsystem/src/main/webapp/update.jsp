<%@page import="models.student"%>
<%@page import="dbconnections.studentdb"%>
<%@page import="services.studentservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String pinnumber = request.getParameter("PIN");
studentservice service = new studentservice(studentdb.conn());
student s = service.getbypin(pinnumber);
%>

<form action="update" method="post">
<input type="hidden" placeholder="ENTER PINNUMBER" name="PIN" value="<%=s.getPinnumber() %>">
<input type="text" placeholder="ENTER NAME" name="NAME" value="<%=s.getName() %>">
<input type="text" placeholder="ENTER EMAIL" name="EMAIL" value="<%=s.getEmail() %>">
<input type="text" placeholder="ENTER BRANCH" name="BRANCH" value="<%=s.getBranch() %>">
<button>Update</button>
</form>
</body>
</html>