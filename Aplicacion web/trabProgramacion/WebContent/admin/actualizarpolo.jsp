<%@page import="beans.PoloBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}

	PoloBean polo=(PoloBean)request.getAttribute("polo");
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
<form action="<%=getServletContext().getContextPath()%>/Polo" method="post">
<table>
	<tr>
		<td>Nombre</td>
		<td>
		<input type="hidden" name="action" value="actualizar">
		<input type="hidden" name="id" value="<%=polo.getIdt_shirt()%>">
		<input type="text" name="name" value="<%=polo.getName()%>"></td>
	</tr>
		<tr>
		<td>Descripción</td>
		<td><input type="text" name="description" value="<%=polo.getDescription()%>"></td>
	</tr>
		<tr>
		<td>Precio</td>
		<td><input type="text" name="price" value="<%=polo.getPrice()%>"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="GUARDAR"></td>
	</tr>	
</table>
</form>
<a href="admin/polo.jsp">Atras</a>
</body>
</html>