<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Publico</title>
</head>
<body>
<%
	String mensaje = "";
	if(request.getAttribute("mensaje") != null){
		mensaje = (String)request.getAttribute("mensaje");
	}
%>
<%=mensaje %>

<form name="" action="<%=getServletContext().getContextPath() %>/Cliente" method="post">
Usuario: <input type="text" name="usuario">
Clave: <input type="password" name="clave">
<input type="submit" value="Iniciar sesión">
</form>
<a href="<%=getServletContext().getContextPath() %>/nuevoUsuario.jsp">Registrate</a>

</body>
</html>