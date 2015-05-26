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
  
  <div id="menu_izquierda"class="col-xs-12 col-sm-4 col-md-4 col-lg-3 sp">
    


<%@include file="includes/menu.html" %>





  </div>
  <div  class="col-xs-12 col-sm-8 col-md-8 col-lg-9 sp">
    <br>
    <h2>Horario de clases</h2>
    <br>

    <div class="table-responsive">
      <table class="table" id="tabla_horario">
  <tr>
    <th>HORA</th>
    <th>LUNES</th>
    <th>MARTES</th>
    <th>MIERCOLES</th>
    <th>JUEVES</th>
    <th>VIERNES</th>
  </tr>
  <tr>
    <td>08:00 - 09:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>09:00 - 10:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>10:00 - 11:00</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>11:00 - 11:30</td>
    <td style="background-color: #ecc950; font-weight: bold">RECREO</td>
    <td style="background-color: #ecc950; font-weight: bold">RECREO</td>
    <td style="background-color: #ecc950; font-weight: bold">RECREO</td>
    <td style="background-color: #ecc950; font-weight: bold">RECREO</td>
    <td style="background-color: #ecc950; font-weight: bold">RECREO</td>
  </tr>
  <tr>
    <td>11:30 - 12:30</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>12:30 - 13:30</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>13:30 - 14:30</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>14:30 - 15:30</td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>
    </div>
  </div>

</div>
</section>
<br>
<%@include file="includes/pie_pagina.html" %>


</html>