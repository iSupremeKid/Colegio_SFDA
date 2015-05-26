<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("clientenombre") == null){
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("clientenombre") %></p>
<%
	String mensaje = "";
	if(request.getAttribute("mensaje_pedido") != null){
		mensaje = (String)request.getAttribute("mensaje_pedido");
	}
%>
<%=mensaje %>



<h3>Opciones disponibles</h3>
<ul>
	<li><a href="<%=getServletContext().getContextPath() %>/comprar.jsp">COMPRAR</a></li>
	<li><a href="<%=getServletContext().getContextPath() %>/mispedidos.jsp">MIS PEDIDOS</a></li>
	<li><a href="<%=getServletContext().getContextPath() %>/Cliente">Cerrar sesión</a></li>
</ul>

</body>
</html>