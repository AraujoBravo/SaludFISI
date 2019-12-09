package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class plantilla_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    ArrayList<String[]> mensajes = (ArrayList<String[]>) request.getSession().getAttribute("mensajes");
    ArrayList<String[]> alumnos = (ArrayList<String[]>) request.getSession().getAttribute("alumnos");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Empresa X</title>\n");
      out.write("        <meta name=\"description\" content=\"Ela Admin - HTML5 Admin Template\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"https://i.imgur.com/QRAUqs9.png\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://i.imgur.com/QRAUqs9.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/cs-skin-elastic.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/lib/datatable/dataTables.bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js\"></script> -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Left Panel -->\n");
      out.write("        <aside id=\"left-panel\" class=\"left-panel\">\n");
      out.write("            <nav class=\"navbar navbar-expand-sm navbar-default\">\n");
      out.write("                <div id=\"main-menu\" class=\"main-menu collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/Observer/CargarVistaMaestro\"><i class=\"menu-icon fa fa-check\"></i>Sesión</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"/Observer/CargarVistaAlumno\"><i class=\"menu-icon fa fa-check\"></i>Alumno</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("        </aside>\n");
      out.write("        <!-- Right Panel -->\n");
      out.write("        <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("            <!-- Header-->\n");
      out.write("            <header id=\"header\" class=\"header\">\n");
      out.write("                <div class=\"top-left\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"./\"><img src=\"images/logo.png\" alt=\"Logo\"></a>\n");
      out.write("                        <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"images/logo2.png\" alt=\"Logo\"></a>\n");
      out.write("                        <a id=\"menuToggle\" class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"top-right\">\n");
      out.write("                    <div class=\"header-left\">\n");
      out.write("                        <div id=\"reloj\" style=\"font-size:20px;\"></div>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- /#header -->\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <!-- Animated -->\n");
      out.write("                <div class=\"animated fadeIn\">\n");
      out.write("                    <!-- Widgets  -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6 col-lg-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h2>Vista Alumno</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"card col-md-6\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <strong class=\"card-title\">Mensajes enviados</strong>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>N°</th>\n");
      out.write("                                            <th>Mensajes</th>\n");
      out.write("                                            <th>Fecha</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 if (!mensajes.isEmpty()) {
                                                int i = 0;
                                                for (String[] mensaje : mensajes) {
                                                    i++;
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(mensaje[0]);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(mensaje[1]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
                                            }
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card col-md-6\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <strong class=\"card-title\">Alumnos registrados</strong>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>N°</th>\n");
      out.write("                                            <th>Alumno</th>\n");
      out.write("                                            <th>Fecha</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 if (!alumnos.isEmpty()) {
                                                int i = 0;
                                                for (String[] alumno : alumnos) {
                                                    i++;
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(alumno[0]);
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(alumno[2]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");
 }
                                            }
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                \n");
      out.write("                    </div>\n");
      out.write("                    <!-- .animated -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- /.content -->\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"site-footer\">\n");
      out.write("                    <div class=\"footer-inner bg-white\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                Copyright &copy; 2019\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 text-right\">\n");
      out.write("                                Juan Araujo Bravo</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- /.site-footer -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#right-panel -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!-- Scripts -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/lib/data-table/datatables.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/dataTables.buttons.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/jszip.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/vfs_fonts.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.html5.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.print.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.colVis.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/init/datatables-init.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#bootstrap-data-table-export').DataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function startTime() {\n");
      out.write("            today = new Date();\n");
      out.write("            d = today.getDay();\n");
      out.write("            m = today.getMonth();\n");
      out.write("            y = today.getFullYear();\n");
      out.write("            h = today.getHours();\n");
      out.write("            m = today.getMinutes();\n");
      out.write("            s = today.getSeconds();\n");
      out.write("            m = checkTime(m);\n");
      out.write("            s = checkTime(s);\n");
      out.write("            document.getElementById('reloj').innerHTML = d + \"/\" + m + \"/\" + y + \" - \" + h + \":\" + m + \":\" + s;\n");
      out.write("            t = setTimeout('startTime()', 500);\n");
      out.write("        }\n");
      out.write("        function checkTime(i)\n");
      out.write("        {\n");
      out.write("            if (i < 10) {\n");
      out.write("                i = \"0\" + i;\n");
      out.write("            }\n");
      out.write("            return i;\n");
      out.write("        }\n");
      out.write("        window.onload = function () {\n");
      out.write("            startTime();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>");
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
