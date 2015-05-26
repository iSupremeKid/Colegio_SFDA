<%@page import="beans.PoloBean"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.interfaces.PoloDao"%>
<%@page import="daofactory.MySQLDaoFactory"%>
<%@page import="daofactory.DaoFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
System.out.print("lalla");
	if(session.getAttribute("adminnombre") == null){
		response.sendRedirect("index.jsp");
	}
	DaoFactory df=new MySQLDaoFactory();
	PoloDao a=df.obtenerPoloDao();
	Vector<PoloBean> lista=a.listar();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>

<p>Bienvenido <%=session.getAttribute("adminnombre") %></p>
<%
	String mensaje = "";
	if(request.getAttribute("mensaje_polo") != null){
		mensaje = (String)request.getAttribute("mensaje_polo");
	}
%>
<%=mensaje %>

<h3>Polos</h3>
<a href="<%=getServletContext().getContextPath() %>/admin/nuevoPolo.jsp">Nuevo</a>
<a href="<%=getServletContext().getContextPath() %>/admin/escritorio.jsp">Atras</a>
<table>
	<tr>
		<td>ID</td>
		<td>NOMBRE</td>
		<td>DESCRIPCIÓN</td>
		<td>PRECIO S/.</td>
		<td>EDITAR</td>
		<td>ELIMINAR</td>
	</tr>
	<% for(int i=0;i<lista.size();i++){
		PoloBean tmp=lista.get(i);
	%>
		<tr>
		<td><%=tmp.getIdt_shirt()%></td>
		<td><%=tmp.getName()%></td>
		<td><%=tmp.getDescription() %></td>
		<td><%=tmp.getPrice()%></td>
		<td><a href="<%=getServletContext().getContextPath()%>/Polo?id=<%=tmp.getIdt_shirt()%>&action=editar">Editar</a></td>
		<td><a href="<%=getServletContext().getContextPath()%>/Polo?id=<%=tmp.getIdt_shirt()%>&action=eliminar">Eliminar</a></td>
	</tr>
		<%}%>
</table>
</body>
</html>