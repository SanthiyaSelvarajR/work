<%@ page import="java.util.*,com.work.model.Work"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display</title>
</head>
<body>
<%
    List<Work> det=(List<Work>)request.getAttribute("det");
%>
<table border="1">
<tr> 
   <td>id</td>
   <td>name</td>
   <td>age</td>
   <td>Actions</td>
</tr>
<%
  for(Work t:det){
%>
<tr>
   <td><%=t.getId()%></td>
   <td><%=t.getName() %></td>
   <td><%=t.getAge() %></td>
   <td><a href="${pageContext.request.contextPath}/edit?id=<%=t.getId()%>">
               <button>Edit</button></a>
	   <a href="${pageContext.request.contextPath}/delete?id=<%=t.getId()%>">
	           <button>delete</button></a></td>
</tr>
<%} %>
</table>
</body>
</html>