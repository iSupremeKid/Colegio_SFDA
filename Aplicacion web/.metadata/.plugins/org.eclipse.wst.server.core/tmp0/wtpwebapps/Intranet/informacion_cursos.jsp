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
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="css/estilo.css">
        <script src="js/jquery-latest.min.js" type="text/javascript"></script>
        <script src="js/script.js"></script>
    </head>
    <body>
<%@include file="includes/header.jsp" %>    
<section class="container-fluid" id="">
<div class="row">
  

    



<%@include file="includes/menu.html" %>



  
  <div style="text-align: center" class="col-xs-12 col-sm-8 col-md-8 col-lg-9 sp container-fluid">
    <div class="row">
      <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 sp">
      <h2>Grado: 4to Primaria</h2>
    </div>
      <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 sp">
      <h2>Secci�n: 1ro A</h2>

     </div>


    </div>
      <h2>Informaci�n de cursos</h2>
      <br>
    <div class="row" id="cursos_alumno">
      
    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-12 sp">
    <input type="image" src="img/cursos/comunicacion.png" name="" value="Comunicacion">
    <input type="image" src="img/cursos/ingles.png" type="button" name="" value="Idioma extranjero">
    <input type="image" src="img/cursos/matematica.png" name="" value="Matem�tica">
    <input type="image" src="img/cursos/ciencia.png" name="" value="Ciencia tecnolog�a y Ambiente">
  
    </div>
    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-12 sp">

    <input type="image" src="img/cursos/historia.png" name="" value="Historia, Geograf�a y Econom�a">

    <input type="image" src="img/cursos/educacion_trabajo.png" name="" value="Educaci�n para el trabajo">
    <input type="image" src="img/cursos/familia.png" name="" value="Persona familia y relaciones humanas">
    <input type="image" src="img/cursos/educacion_fisica.png" name="" value="Educaci�n f�sica">

    </div>


    <div class="col-xs-12 col-sm-4 col-md-4 col-lg-12 sp">

      <input type="image" src="img/cursos/arte.png" name="" value="Educaci�n por el arte">
      <input type="image" src="img/cursos/religion.png" name="" value="Educaci�n religiosa">
      <input type="image" src="img/cursos/civica.png" name="" value="Formaci�n ciudadana y c�vica">
      <input type="image" src="img/cursos/tutoria.png" name="" value="Tutor�a">


    </div>
    </div>


  </div>

</div>
</section>
<br>
<%@include file="includes/pie_pagina.html" %>

</html>
