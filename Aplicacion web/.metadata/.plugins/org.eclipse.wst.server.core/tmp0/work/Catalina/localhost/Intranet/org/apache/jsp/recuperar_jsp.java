/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.41
 * Generated at: 2015-04-17 16:40:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recuperar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html class=\"no-js\" lang=\"\">\r\n");
      out.write("    <head>\r\n");
      out.write("    \r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("        <title>Intranet</title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-2.1.3.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function (){\r\n");
      out.write("\t\t$('#boton_login').click(function (event) {\r\n");
      out.write("\t\t\tvar correo = $(\"#correo\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post('Recuperar' ,{\r\n");
      out.write("\t\t\t\tresultado: correo\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction (responseText) {\r\n");
      out.write("\t\t\t\tif(responseText.substring(0,16) == \"Se le ha enviado\"){\r\n");
      out.write("\t\t\t\t\t$('#resultadoRojo').html(\"\");\r\n");
      out.write("\t\t\t\t$('#resultadoAzul').html(responseText);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#resultadoAzul').html(\"\");\r\n");
      out.write("\t\t\t\t\t$('#resultadoRojo').html(responseText);\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("<header id=\"header\" >\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-xs-12 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("  \r\n");
      out.write("  <img src=\"img/escudo.png\" alt=\"Escudo colegio\" title=\"Colegio San Francisco de Asis\">  \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div id=\"texto_header\" class=\"col-xs-12 col-sm-9 col-md-10 col-lg-10\">\r\n");
      out.write("  <h1>COLEGIO</h1>\r\n");
      out.write("  <h2>SAN FRANCISCO DE ASIS</h2>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("    \r\n");
      out.write("<section class=\"container\" id=\"login_cuerpo\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row\" >\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 sp\">\r\n");
      out.write("    <h1>Sistema de Gestión Académica</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"formulario_login\" class=\"col-xs-12 col-sm-12 col-md-6 col-lg-6 sp\">\r\n");
      out.write("    \r\n");
      out.write("      <fieldset>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("        <legend>Recuperar contraseña</legend>\r\n");
      out.write("        ");
String mensaje = (String)request.getAttribute("mensaje");
        String color = (String)request.getAttribute("color");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<p id=\"resultadoRojo\" style=\"color:#ff0000\"></p>\r\n");
      out.write("<p id=\"resultadoAzul\" style=\"color:#0000ff\"></p>\r\n");
      out.write("\t\t");

		if(color == null){
			
      out.write("\r\n");
      out.write("\t\t\t<input  id=\"correo\" type=\"text\" name=\"email\" value=\"\" placeholder=\"E-mail\">\r\n");
      out.write("\t\t\t<div style=\"padding-top:10px\" id=\"login_botones\">\r\n");
      out.write("\t\t\t<button  id=\"boton_login\" name=\"action\" value=\"reestablecer\" type=\"submit\" class=\"btn btn-default\" aria-label=\"Left Align\">\r\n");
      out.write("  <span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span>\r\n");
      out.write("  Reestablecer\r\n");
      out.write("</button>\r\n");
      out.write("\t\t\t");

		}else if(color.equals("red")){
			
      out.write("\r\n");
      out.write("\t\t\t<input  type=\"text\" name=\"email\" value=\"\" placeholder=\"E-mail\">\r\n");
      out.write("\t\t\t<div style=\"padding-top:10px\" id=\"login_botones\">\r\n");
      out.write("\t\t\t<button  id=\"boton_login\" name=\"action\" value=\"reestablecer\" type=\"submit\" class=\"btn btn-default\" aria-label=\"Left Align\">\r\n");
      out.write("  <span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span>\r\n");
      out.write("  Reestablecer\r\n");
      out.write("</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

		}
		
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write(" <a href=\"index.jsp\">\r\n");
      out.write("      <button id =\"boton_recuperar\"  value=\"atras\" type=\"submit\" class=\"btn btn-default\">\r\n");
      out.write("  <span class=\"glyphicon glyphicon-arrow-left\" aria-hidden=\"true\"></span> Atras\r\n");
      out.write("</button>\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </fieldset>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</section>\r\n");
      out.write("<br>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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