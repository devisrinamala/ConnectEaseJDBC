<%@page import="models.marks"%>
<%@page import="dbconnections.studentdb"%>
<%@page import="services.marksservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Marks</title>
</head>
<body>

<%
 String pinnumber = request.getParameter("pinnumber");
marksservice service = new marksservice(studentdb.conn());
marks m = service.getbypinnumber(pinnumber);
%>
<form action="updatemarks" method="post" style="margin: 2% 38%; border: solid; border-radius: 4%; padding: 4%">
<h1>Update marks</h1>
<br>
<input type="text" placeholder="ENTER CNS MARKS" name="cns" value="<%=m.getCns()%>"><br>
<br>
<input type="text" placeholder="ENTER BDA MARKS" name="bda" value="<%=m.getBda()%>"><br>
<br>
<input type="text" placeholder="ENTER ML MARKS" name="ml" value="<%=m.getMl()%>"><br>
<br>
<input type="text" placeholder="ENTER ADS MARKS" name="ads" value="<%=m.getAds()%>"><br>
<br>
<input type="text" placeholder="ENTER SWM MARKS" name="swm" value="<%=m.getSwm()%>"><br>
<br>
<input type="text" placeholder="ENTER IPR MARKS" name="ipr" value="<%=m.getIpr()%>"><br>
<br>
<input type="hidden" placeholder="ENTER PINNUMBER" name="pinnumber" value="<%=m.getPinnumber()%>"><br>
<button style="margin: 0% 29%; padding: 2% 4%">Update</button>
</form>


</body>
</html>