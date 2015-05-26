<%@page import="beans.ColorBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}

	ColorBean color=(ColorBean)request.getAttribute("color");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("adminnombre") %></p>

<h3>Actualizar</h3>
<form action="<%=getServletContext().getContextPath()%>/Color" method="post">
<table>
	<tr>
		<td>Nombre</td>
		<td>
		<input type="hidden" name="action" value="actualizar">
		<input type="hidden" name="id" value="<%=color.getIdcolor()%>">
		<input type="text" name="name" value="<%=color.getName()%>"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="GUARDAR"></td>
	</tr>	
</table>
</form>
<a href="admin/color.jsp">Atras</a>
</body>
</html>