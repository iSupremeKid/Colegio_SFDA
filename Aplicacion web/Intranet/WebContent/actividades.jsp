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
  <div style="text-align: center" class="col-xs-12 col-sm-8 col-md-8 col-lg-9 sp">
   
<h2>Actividades</h2>

<iframe id="google_calendar"src="https://www.google.com/calendar/embed?showTitle=0&amp;showNav=0&amp;showPrint=0&amp;showTabs=0&amp;showCalendars=0&amp;showTz=0&amp;height=224&amp;wkst=2&amp;hl=es_419&amp;bgcolor=%23ffffff&amp;src=1r6j1b75h3he978q2sokl7bko4%40group.calendar.google.com&amp;color=%235229A3&amp;ctz=America%2FLima" style="border-width:110;" frameborder="0" scrolling="false"></iframe>

    
  </div>

</div>
</section>
<br>
<%@include file="includes/pie_pagina.html" %>

</html>
    