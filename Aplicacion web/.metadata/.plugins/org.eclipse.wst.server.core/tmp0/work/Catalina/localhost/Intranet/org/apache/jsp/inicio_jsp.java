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

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/includes/menu.html", Long.valueOf(1429031541398L));
    _jspx_dependants.put("/includes/pie_pagina.html", Long.valueOf(1429031685937L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1429030677207L));
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html class=\"no-js\" lang=\"\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("        <title>Intranet</title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\">\r\n");
      out.write("        <script src=\"js/jquery-latest.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/script.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header id=\"header\" >\r\n");
      out.write(" ");

    session=request.getSession(false);
    if(session.getAttribute("id_Persona")==null)
    {
        response.sendRedirect("index.jsp");
    }


      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"col-xs-12 col-sm-3 col-md-2 col-lg-2 sp\">\r\n");
      out.write("  \r\n");
      out.write("  <img src=\"img/user.png\" alt=\"Escudo colegio\" title=\"Colegio San Francisco de Asis\">  \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div id=\"texto_header\" class=\"col-xs-12 col-sm-9 col-md-10 col-lg-7\">\r\n");
      out.write("  <h2>\r\n");
      out.write("    Alumno: ");
      out.print(session.getAttribute("nombres")+" "+session.getAttribute("apePat")+" "+session.getAttribute("apeMat"));
      out.write("\r\n");
      out.write("  </h2>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"texto_header\" class=\"col-xs-12 col-sm-9 col-md-10 col-lg-3\">\r\n");
      out.write("    <form action=\"Login\" method=\"get\">\r\n");
      out.write("    <button id=\"boton_logoff\" name =\"action\"  value=\"logoff\" type=\"submit\" class=\"btn btn-default\" aria-label=\"Left Align\">\r\n");
      out.write("  \t  Cerrar Sesión \r\n");
      out.write("  <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\r\n");
      out.write("</button>\r\n");
      out.write("    </form>\r\n");
      out.write("<br><br>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<section class=\"container-fluid\" id=\"\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"menu_izquierda\"class=\"col-xs-12 col-sm-4 col-md-4 col-lg-3 sp\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id='cssmenu' class=\"col-xs-12 col-sm-4 col-md-4 col-lg-3 sp\">\r\n");
      out.write("<ul>\r\n");
      out.write("   <li class='active'><a href=\"inicio.jsp\"><span>Menú</span></a></li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span>Mis cursos</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href=\"informacion_cursos.jsp\"><span>Información de Cursos</span></a></li>\r\n");
      out.write("         <li><a href=\"horario_cursos.jsp\"><span>Horario de cursos</span></a></li>\r\n");
      out.write("         <li class='last'><a href=\"actividades.jsp\"><span>Actividades</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li class=''><a href='#'><span>Material didáctico</span></a>\r\n");
      out.write("      \r\n");
      out.write("   </li>\r\n");
      out.write("   <li class='last'><a href='#'><span>Consultas</span></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <div style=\"text-align: center\" class=\"col-xs-12 col-sm-8 col-md-8 col-lg-9 sp\">\r\n");
      out.write("    <br>\r\n");
      out.write("      <img style=\"width:80%;height:80%\"src=\"img/img_portada.jpg\" alt=\"\">\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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