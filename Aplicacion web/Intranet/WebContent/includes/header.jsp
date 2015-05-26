<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<header id="header" >
 <%
    session=request.getSession(false);
    if(session.getAttribute("id_Persona")==null)
    {
        response.sendRedirect("index.jsp");
    }

%>

  <div class="container-fluid">

    <div class="row">

  <div class="col-xs-12 col-sm-3 col-md-2 col-lg-2 sp">
  
  <img src="img/user.png" alt="Escudo colegio" title="Colegio San Francisco de Asis">  
  </div>
  

  <div id="texto_header" class="col-xs-12 col-sm-9 col-md-10 col-lg-7">
  <h2>
    Alumno: <%=session.getAttribute("nombres")+" "+session.getAttribute("apePat")+" "+session.getAttribute("apeMat")%>
  </h2>

  </div>

  <div id="texto_header" class="col-xs-12 col-sm-9 col-md-10 col-lg-3">
    <form action="Login" method="get">
    <button id="boton_logoff" name ="action"  value="logoff" type="submit" class="btn btn-default" aria-label="Left Align">
  	  Cerrar Sesión 
  <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
</button>
    </form>
<br><br>
  </div>
</div>
    
  </div>
</header>