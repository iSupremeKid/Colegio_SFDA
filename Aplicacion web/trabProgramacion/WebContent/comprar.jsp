<%@page import="beans.Talla"%>
<%@page import="dao.interfaces.TallaDao"%>
<%@page import="beans.PoloBean"%>
<%@page import="dao.interfaces.PoloDao"%>
<%@page import="beans.ColorBean"%>
<%@page import="java.util.Vector"%>
<%@page import="dao.interfaces.ColorDao"%>
<%@page import="daofactory.MySQLDaoFactory"%>
<%@page import="daofactory.DaoFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	if(session.getAttribute("clientenombre") == null){
		response.sendRedirect("index.jsp");
	}
	DaoFactory df=new MySQLDaoFactory();
	ColorDao a=df.obtenerColorDao();
	Vector<ColorBean> colores=a.listar();
	PoloDao b=df.obtenerPoloDao();
	Vector<PoloBean> polos=b.listar();
	TallaDao c = df.obtenerTallaDao();
	Vector<Talla> tallas=c.listar();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy a T-shirt</title>
</head>

<body>
<a href="<%=getServletContext().getContextPath() %>/escritorio.jsp">ATRAS</a>
<form method="post" action="Comprar">
  <p>Buy a T-Shirt!</p>
  <p>Which one do you want?*</p>
  <p>
    <select name="polos">
    <%
		for(int i=0;i<polos.size();i++){
			PoloBean tmp =polos.get(i);
			%>
				<option value="<%=tmp.getIdt_shirt()%>"><%=tmp.getName()%></option>
			<%	
		}
    %>
    </select>
  </p>
  <table width="300" border="0" cellspacing="2">
    <tr>
      <td>Size*</td>
      <td>Color*</td>
    </tr>
    <tr>
      <td><select name="size" id="">
        <%
		for(int i=0;i<tallas.size();i++){
			Talla tmp =tallas.get(i);
			%>
				<option value="<%=tmp.getIdsize()%>"><%=tmp.getSize_mame()%></option>
			<%	
		}
    %>
      </select></td>
      <td><select name="color" id="">
        <%
		for(int i=0;i<colores.size();i++){
			ColorBean tmp =colores.get(i);
			%>
				<option value="<%=tmp.getIdcolor()%>"><%=tmp.getName()%></option>
			<%	
		}
    %>
      </select></td>
    </tr>
  </table>
  <table width="300" border="0" cellspacing="2">
    <tr>
      <td colspan="2">Name*</td>
      <td>Email*</td>
    </tr>
    <tr>
      <td><input type="text" name="first" id="first" /></td>
      <td><input type="text" name="last" id="last" /></td>
    <td><input type="text" name="email" id="email" /></td>
    </tr>
    <tr>
      <td>First</td>
      <td>Last</td>
      <td>&nbsp;</td>
    </tr>
  </table>
  <p>Address*</p>
  <p>
    <input type="text" name="adress" id="Address" />
  </p>
  <p>Street address</p>
  <table width="300" border="0" cellspacing="2">
    <tr>
      <td><input type="text" name="city" id="city" /></td>
      <td><input type="text" name="region" id="state" /></td>
    </tr>
    <tr>
      <td><p>City</p></td>
      <td>State/ Province/ Region</td>
    </tr>
    <tr>
      <td><input type="text" name="zip_code" id="postal_code" /></td>
      <td></td>
    </tr>
    <tr>
      <td>Postal: Zip Code</td>
      <td></td>
    </tr>
  </table>
  <p>
    <input type="checkbox" name="gift" id="gift" />
  This is a gift</p>
  <p>
    <input type="submit" name="Submit" id="Submit" value="Enviar" />
  </p>
  <p>&nbsp;</p>
</form>
</body>
</html>