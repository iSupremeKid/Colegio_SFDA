
<%@page import="beans.PedidoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
System.out.print("lalla");
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}
	PedidoBean pb=(PedidoBean)request.getAttribute("pedido");;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("adminnombre") %></p>
<a href="<%=getServletContext().getContextPath() %>/admin/pedidos.jsp">ATRAS</a>
<h3>PEDIDO DETALLE</h3>
<table>
	<tr>
		<td>PEDIDO</td>
		<td><%=pb.getId() %></td>
	</tr>
	<tr>
		<td>USUARIO</td>
		<td><%=pb.getIdperson() %></td>
	</tr>
	<tr>
		<td>Polo</td>
		<td><%=pb.getIdt_shirt() %></td>
	</tr>
	<tr>
		<td>Color</td>
		<td><%=pb.getIdcolor() %></td>
	</tr>
	<tr>
		<td>Talla</td>
		<td><%=pb.getIdsize() %></td>
	</tr>
	<tr>
		<td>Nombre</td>
		<td><%=pb.getFirst_name() %></td>
	</tr>
	<tr>
		<td>Apellido</td>
		<td><%=pb.getLast_name() %></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><%=pb.getLast_name() %></td>
	</tr>
	<tr>
		<td>Direccion</td>
		<td><%=pb.getAdress() %></td>
	</tr>
	<tr>
		<td>Region</td>
		<td><%=pb.getRegion() %></td>
	</tr>
	<tr>
		<td>Codigo postal</td>
		<td><%=pb.getZip_code() %></td>
	</tr>
	<tr>
		<td>Regalo</td>
		<td><%=pb.getGift() %></td>
	</tr>
	<tr>
		<td>Precio</td>
		<td><%=pb.getSale_price() %></td>
	</tr>
	<tr>
		<td>Fecha</td>
		<td><%=pb.getOrder_date() %></td>
	</tr>

</table>

</body>
</html>