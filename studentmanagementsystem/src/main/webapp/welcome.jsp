<%@page import="models.student"%>
<%@page import="java.util.List"%>
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
<table border="2" style="margin: 8% 25%; border-radius: 5px; padding: 2%">
 <thead>
 <tr>
 <th>ID</th>
 <th>PIN</th>
 <th>NAME</th>
 <th>EMAIL</th>
 <th>BRANCH</th>
 <th>ACTIONS</th>
</tr>
 </thead>
 <tbody>
 <%
  studentservice service = new studentservice(studentdb.conn());
 List<student> st = service.getall();
 for(student s:st){
	 
  %>
  <tr> 
  <td><%=s.getId()%></td>
  <td><%=s.getPinnumber()%></td>
   <td><%=s.getName()%></td>
    <td><%=s.getEmail()%></td>
     <td><%=s.getBranch()%></td>
     <td>
     <a href="update.jsp?pinnumber=<%=s.getPinnumber() %>"><button>UPDATE</button></a>
     <a href="delete?pinnumber=<%=s.getPinnumber() %>"><button>DELETE</button></a>
     </td>
     
  </tr>
  
  <% } %>
 
 </tbody>
 </table>
</body>
</html>