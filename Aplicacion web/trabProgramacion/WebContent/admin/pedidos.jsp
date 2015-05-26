<%@page import="beans.PedidoBean"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.interfaces.PedidoDao"%>
<%@page import="daofactory.MySQLDaoFactory"%>
<%@page import="daofactory.DaoFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}
	DaoFactory df=new MySQLDaoFactory();
	PedidoDao a=df.obtenerPedidoDao();
	Vector<PedidoBean> lista=a.getAll();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("adminnombre") %></p>

<h3>Pedidos</h3>
<a href="<%=getServletContext().getContextPath() %>/admin/escritorio.jsp">Atras</a>
<%if(lista.size()==0){
	String mensaje="No hay pedidos...";%>
	<%=mensaje%>
<%}else{%>
<table>
	<tr>
		<td>ID_PEDIDO</td>
		<td>ID_PERSONA</td>
		<td>ID_POLO</td>
		<td>¿ES REGALO?</td>
		<td>FECHA</td>
		<td>DETALLE</td>
		<td>EDITAR</td>
	</tr>
	<% for(int i=0;i<lista.size();i++){
		PedidoBean tmp=lista.get(i);
	%>
		<tr>
		<td><%=tmp.getId()%></td>
		<td><%=tmp.getIdperson()%></td>
		<td><%=tmp.getIdt_shirt()%></td>
		<% if(tmp.getGift()==1){
		%>
			<td>SI</td>
		<%}else{%>
			<td>NO</td>
		<%}%>
		<td><%=tmp.getOrder_date()%></td>
		<td><a href="<%=getServletContext().getContextPath()%>/PedidoADM?id=<%=tmp.getId()%>&action=detalle">DETALLE</a></td>
		<td><a href="<%=getServletContext().getContextPath()%>/PedidoADM?id=<%=tmp.getId()%>&action=editar">EDITAR</a></td>
		// no se siponer aqui el actualizar o en comprar para q lo mande al servlet checa eso porfas diego
	</tr>
		<%}%>
</table>
<%}%>

</body>
</html>