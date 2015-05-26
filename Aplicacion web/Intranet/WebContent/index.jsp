<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
    session=request.getSession(false);
    if(session.getAttribute("id_Persona")!=null)
    {
        response.sendRedirect("inicio.jsp");
    }

%>
    

<!DOCTYPE HTML>
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Intranet</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">

    </head>
    <body>
<header id="header" >
  <div class="container-fluid">

    <div class="row">

  <div class="col-xs-12 col-sm-3 col-md-2 col-lg-2 sp">
  
  <img src="img/escudo.png" alt="Escudo colegio" title="Colegio San Francisco de Asis">  
  </div>
  

  <div id="texto_header" class="col-xs-12 col-sm-9 col-md-10 col-lg-10">
  <h1>COLEGIO</h1>
  <h2>SAN FRANCISCO DE ASIS</h2>

  </div>
</div>
    
  </div>
</header>
    
<section class="container" id="login_cuerpo">

  <div class="row" >
  

  <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 sp">
    <h1>Sistema de Gesti�n Acad�mica</h1>
  </div>
  <div id="formulario_login" class="col-xs-12 col-sm-12 col-md-6 col-lg-6 sp">
    <form action="Login" method="post" accept-charset="utf-8">
      <fieldset>
        <legend>Acceso a la Intranet</legend>
        <%String mensaje = (String)request.getAttribute("mensaje");%>
<%
if(mensaje != null){
%><strong><p style="color:red"><%=mensaje%></p></strong><%	
}
%>
        <input type="text" name="user" value="" placeholder="Usuario">
        
        <br><br>
        <input type="password" name="password" value="" placeholder="Contrase�a"><br><br>
        <div id="login_botones">
      <button  id="boton_login" name="action" value="ingresar" type="submit" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span>
  Ingresar
</button>
 
      <button id ="boton_recuperar" name="action" value="recuperar" type="submit" class="btn btn-default">
  <span class="glyphicon glyphicon-lock" aria-hidden="true"></span> Recuperar contrase�a
</button>

</div>


      </fieldset>
    </form>
  </div>


  </div>
  
</section>
<br>
<%@include file="includes/pie_pagina.html" %>

</html>