<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("adminnombre") %></p>

<h3>Opciones disponibles</h3>
<ul>
	<li><a href="<%=getServletContext().getContextPath() %>/admin/color.jsp">CRUD Color</a></li>
	<li><a href="<%=getServletContext().getContextPath() %>/admin/polo.jsp">CRUD polo</a></li>
	<li><a href="<%=getServletContext().getContextPath() %>/admin/pedidos.jsp">PEDIDOS</a></li>
	<li><a href="<%=getServletContext().getContextPath() %>/Administrador">Cerrar sesión</a></li>
</ul>

</body>
</html>