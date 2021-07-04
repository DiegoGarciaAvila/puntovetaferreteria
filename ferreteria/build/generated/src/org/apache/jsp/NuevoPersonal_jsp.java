package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoPersonal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nuevo Usuario</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .alto {\n");
      out.write("                height: 600px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .altoTabla {\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ancho {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Llena los campos para ingresar un nuevo usuario</h1>\n");
      out.write("\n");
      out.write("        <div class=\"col mb-2\">\n");
      out.write("            <form name=\"InNuUsuario\" action=\"DBUsarioS\">\n");
      out.write("                <table border=\"2\" class=\"ancho text-center\"> \n");
      out.write("                    <thead>\n");
      out.write("                        <tr><td  class=\"bg-warning \" colspan=\"8\">Tabla Empleados</td></tr>\n");
      out.write("                        <tr class=\"bg-dark text-white\">\n");
      out.write("                            <td>Id</td>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td>Apellido Materno</td>\n");
      out.write("                            <td>Apellido Paterno</td>\n");
      out.write("                            <td>Salario</td>\n");
      out.write("                            <td>Password</td>\n");
      out.write("                            <td>Cargo</td>\n");
      out.write("                            <td>Contacto</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td><input type=\"text\" value=\"id\" name=\"id\"></td>\n");
      out.write("                        <td> <input type=\"text\" value=\"nombre\" name=\"nombre\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"ap\" name=\"ap\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"am\" name=\"am\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"salario\" name=\"salario\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"contra\" name=\"contra\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"cargo\" name=\"cargo\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"telefono\" name=\"telefono\"></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" value=\"guardar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n");
      out.write("            integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("            integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n");
      out.write("            integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
