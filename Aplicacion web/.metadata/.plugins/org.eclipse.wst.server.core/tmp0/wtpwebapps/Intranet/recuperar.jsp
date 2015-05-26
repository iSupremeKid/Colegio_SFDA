<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
        <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script>

    $(document).ready(function (){
		$('#boton_login').click(function (event) {
			var correo = $("#correo").val();
			
			
			$.post('Recuperar' ,{
				resultado: correo
			},
			function (responseText) {
				if(responseText.substring(0,16) == "Se le ha enviado"){
					$('#resultadoRojo').html("");
				$('#resultadoAzul').html(responseText);
				}else{
					$('#resultadoAzul').html("");
					$('#resultadoRojo').html(responseText);	
				}
			});
		});
	});
    </script>

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
    <h1>Sistema de Gestión Académica</h1>
  </div>
  <div id="formulario_login" class="col-xs-12 col-sm-12 col-md-6 col-lg-6 sp">
    
      <fieldset>
      
      
        <legend>Recuperar contraseña</legend>
        <%String mensaje = (String)request.getAttribute("mensaje");
        String color = (String)request.getAttribute("color");%>
        
<p id="resultadoRojo" style="color:#ff0000"></p>
<p id="resultadoAzul" style="color:#0000ff"></p>
		<%
		if(color == null){
			%>
			<input  id="correo" type="text" name="email" value="" placeholder="E-mail">
			<div style="padding-top:10px" id="login_botones">
			<button  id="boton_login" name="action" value="reestablecer" type="submit" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
  Reestablecer
</button>
			<%
		}else if(color.equals("red")){
			%>
			<input  type="text" name="email" value="" placeholder="E-mail">
			<div style="padding-top:10px" id="login_botones">
			<button  id="boton_login" name="action" value="reestablecer" type="submit" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
  Reestablecer
</button>
			
			<%
		}
		%>
        
        
        
        
      
 <a href="index.jsp">
      <button id ="boton_recuperar"  value="atras" type="submit" class="btn btn-default">
  <span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span> Atras
</button>
</a>

</div>


      </fieldset>
    
  </div>


  </div>
  
</section>
<br>
<%@include file="includes/pie_pagina.html" %>


</html>
