package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GraficaVentas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Graficas</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/chart.js@2.8.0\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" name=\"principal\">\n");
      out.write("        <div class=\"row mt-4\" name=\"Navegador\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <nav aria-label=\"breadcrumb\">\n");
      out.write("\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item \" aria-current=\"page\">\n");
      out.write("                            <a href=\"#\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"breadcrumb-item active\" aria-current=\"page\">\n");
      out.write("                            <a href=\"#\">Grafica Ventas</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row justify-content-center\" name=\"filtro\">\n");
      out.write("\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("                <input type=\"date\" name=\"\" id=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("                <button class=\"btn btn-info\">\n");
      out.write("                    Generar\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"row\" name=\"grafica\">\n");
      out.write("            <canvas id=\"myChart\" height=\"120\" aria-label=\"Grafica\">\n");
      out.write("                <p>Hola como estas</p>\n");
      out.write("            </canvas>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    var ctx = document.getElementById('myChart').getContext('2d');\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("        type: 'bar',\n");
      out.write("        data: {\n");
      out.write("            labels: ['Producto1', 'Producto2', 'Producto3', 'Producto4', 'Producto5', 'Producto6'],\n");
      out.write("            datasets: [{\n");
      out.write("                label: '# Ventas por producto',\n");
      out.write("                data: [12, 19, 3, 5, 10, 3],\n");
      out.write("                backgroundColor: [\n");
      out.write("                    'rgba(255, 99, 132, 0.2)',\n");
      out.write("                    'rgba(54, 162, 235, 0.2)',\n");
      out.write("                    'rgba(255, 206, 86, 0.2)',\n");
      out.write("                    'rgba(75, 192, 192, 0.2)',\n");
      out.write("                    'rgba(153, 102, 255, 0.2)',\n");
      out.write("                    'rgba(255, 159, 64, 0.2)'\n");
      out.write("                ],\n");
      out.write("                borderColor: [\n");
      out.write("                    'rgba(255, 99, 132, 1)',\n");
      out.write("                    'rgba(54, 162, 235, 1)',\n");
      out.write("                    'rgba(255, 206, 86, 1)',\n");
      out.write("                    'rgba(75, 192, 192, 1)',\n");
      out.write("                    'rgba(153, 102, 255, 1)',\n");
      out.write("                    'rgba(255, 159, 64, 1)'\n");
      out.write("                ],\n");
      out.write("                borderWidth: 1\n");
      out.write("            }]\n");
      out.write("        },\n");
      out.write("        options: {\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\"\n");
      out.write("    integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("    integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
