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
 String pinnumber = request.getParameter("pinnumber");
 studentservice service = new studentservice(studentdb.conn());
 student s = service.getbypin(pinnumber);
%>

<form action="update" method="post" style="margin: 2% 37%; border: solid; border-radius: 4%; padding: 4%">
<h1>update details</h1>
<br><input type="text" placeholder="ENTER NAME" name="name" value="<%=s.getName()%>"><br>
<br>
<input type="email" placeholder="ENTER EMAIL" name="email" value="<%=s.getEmail()%>"><br>
<br>
<input type="text" placeholder="ENTER BRANCH" name="branch" value="<%=s.getBranch()%>"><br>
<br>
<input type="hidden" placeholder="ENTER PINNUMBER" name="pinnumber" value="<%=s.getPinnumber()%>"><br>

<button style="margin: 0% 29%; padding: 2% 4%">Update</button>
</form>

</body>
</html>