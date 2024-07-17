<%@page import="models.marks"%>
<%@page import="java.util.List"%>
<%@page import="dbconnections.studentdb"%>
<%@page import="services.marksservice"%>
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

<th>PINNUMBER</th>
<th>CNS</th>
<th>BDA</th>
<th>ML</th>
<th>ADS</th>
<th>SWM</th>
<th>IPR</th>
<th>Action</th>
</tr>

</thead>

<tbody>

<%

marksservice service = new marksservice(studentdb.conn());

List<marks> list = service.getall();
 
 for(marks m : list)
 {
%>


<tr>

<td><%=m.getPinnumber()%></td>
<td><%=m.getCns()%></td>
<td><%=m.getBda()%></td>
<td><%=m.getMl() %></td>
<td><%=m.getAds() %></td>
<td><%=m.getSwm() %></td>
<td><%=m.getIpr() %></td>
<td>
<a href="updatemarks.jsp?pinnumber=<%=m.getPinnumber()%>"> <button class="btn btn-outline-success btn-sm" style="font-weight: 700;">Update</button></a>

<a href="deletemark?pinnumber=<%=m.getPinnumber()%>"><button class="btn btn-outline-danger btn-sm" style="font-weight: 700;">delete</button></a>

</td>
</tr>

<%
 }

%>

</tbody>

</table>
</body>
</html>