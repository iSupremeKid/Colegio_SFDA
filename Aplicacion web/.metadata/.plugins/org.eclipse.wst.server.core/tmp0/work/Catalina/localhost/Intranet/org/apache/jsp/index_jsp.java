/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.41
 * Generated at: 2015-04-14 17:18:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/pie_pagina.html", Long.valueOf(1429031685937L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write(" ");

    session=request.getSession(false);
    if(session.getAttribute("id_Persona")!=null)
    {
        response.sendRedirect("inicio.jsp");
    }


      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Intranet</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<header id=\"header\" >\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("  <div class=\"col-xs-12 col-sm-3 col-md-2 col-lg-2 sp\">\n");
      out.write("  \n");
      out.write("  <img src=\"img/escudo.png\" alt=\"Escudo colegio\" title=\"Colegio San Francisco de Asis\">  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div id=\"texto_header\" class=\"col-xs-12 col-sm-9 col-md-10 col-lg-10\">\n");
      out.write("  <h1>COLEGIO</h1>\n");
      out.write("  <h2>SAN FRANCISCO DE ASIS</h2>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("    \n");
      out.write("<section class=\"container\" id=\"login_cuerpo\">\n");
      out.write("\n");
      out.write("  <div class=\"row\" >\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 sp\">\n");
      out.write("    <h1>Sistema de Gestión Académica</h1>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"formulario_login\" class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 sp\">\n");
      out.write("    <form action=\"Login\" method=\"post\" accept-charset=\"utf-8\">\n");
      out.write("      <fieldset>\n");
      out.write("        <legend>Acceso a la Intranet</legend>\n");
      out.write("        ");
String mensaje = (String)request.getAttribute("mensaje");
      out.write('\n');

if(mensaje != null){

      out.write("<strong><p style=\"color:red\">");
      out.print(mensaje);
      out.write("</p></strong>");
	
}

      out.write("\n");
      out.write("        <input type=\"text\" name=\"user\" value=\"\" placeholder=\"Usuario\">\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        <input type=\"password\" name=\"password\" value=\"\" placeholder=\"Contraseña\"><br><br>\n");
      out.write("        <div id=\"login_botones\">\n");
      out.write("      <button  id=\"boton_login\" name=\"action\" value=\"ingresar\" type=\"submit\" class=\"btn btn-default\" aria-label=\"Left Align\">\n");
      out.write("  <span class=\"glyphicon glyphicon-circle-arrow-right\" aria-hidden=\"true\"></span>\n");
      out.write("  Ingresar\n");
      out.write("</button>\n");
      out.write(" \n");
      out.write("      <button id =\"boton_recuperar\" name=\"action\" value=\"recuperar\" type=\"submit\" class=\"btn btn-default\">\n");
      out.write("  <span class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></span> Recuperar contraseña\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </fieldset>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</section>\n");
      out.write("<br>\n");
      out.write("<footer class=\"container-fluid\">\r\n");
      out.write("  \r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"col-xs-12 col-sm-12 col-md-3 col-lg-3\" id=\"texto_footer\">\r\n");
      out.write("    Versión optimizada con soporte para: \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-xs-6 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("    <img src=\"img/icon/ie.png\" alt=\"\">\r\n");
      out.write("    IE 8+\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-xs-6 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("    <img src=\"img/icon/mozilla.png\" alt=\"\">\r\n");
      out.write("    Firefox 3.6+\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-xs-6 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("    <img src=\"img/icon/chrome.png\" alt=\"\">\r\n");
      out.write("    Chrome 10+\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-xs-6 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("    <img src=\"img/icon/safari.png\" alt=\"\">\r\n");
      out.write("    Safari 4+\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
