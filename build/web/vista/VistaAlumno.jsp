<%-- 
    Document   : JSPIngreso
    Created on : 01/10/2019, 02:06:14 PM
    Author     : ARAUJO BRAVO, JUAN ELÍAS
--%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<String[]> mensajes = (ArrayList<String[]>) request.getSession().getAttribute("mensajes");
    ArrayList<String[]> alumnos = (ArrayList<String[]>) request.getSession().getAttribute("alumnos");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Empresa X</title>
        <meta name="description" content="Ela Admin - HTML5 Admin Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href="https://i.imgur.com/QRAUqs9.png">
        <link rel="shortcut icon" href="https://i.imgur.com/QRAUqs9.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="assets/css/lib/datatable/dataTables.bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

        <!-- <script type="text/javascript" src="https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script> -->

    </head>
    <body>
        <!-- Left Panel -->
        <aside id="left-panel" class="left-panel">
            <nav class="navbar navbar-expand-sm navbar-default">
                <div id="main-menu" class="main-menu collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="/Observer/CargarVistaMaestro"><i class="menu-icon fa fa-check"></i>Sesión</a>
                        </li>
                        <li class="active">
                            <a href="/Observer/CargarVistaAlumno"><i class="menu-icon fa fa-check"></i>Alumno</a>
                        </li>
                    </ul>

                </div><!-- /.navbar-collapse -->
            </nav>
        </aside>
        <!-- Right Panel -->
        <div id="right-panel" class="right-panel">
            <!-- Header-->
            <header id="header" class="header">
                <div class="top-left">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="./"><img src="images/logo.png" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src="images/logo2.png" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-left">
                        <div id="reloj" style="font-size:20px;"></div>  
                    </div>
                </div>
            </header>
            <!-- /#header -->
            <!-- Content -->
            <div class="content">
                <!-- Animated -->
                <div class="animated fadeIn">
                    <!-- Widgets  -->
                    <div class="row">
                        <div class="col-lg-6 col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <h2>Vista Alumno</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="card col-md-6">
                            <div class="card-header">
                                <strong class="card-title">Mensajes enviados</strong>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>N°</th>
                                            <th>Mensajes</th>
                                            <th>Fecha</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% if (!mensajes.isEmpty()) {
                                                int i = 0;
                                                for (String[] mensaje : mensajes) {
                                                    i++;%>
                                        <tr>
                                            <td><%=i%></td>
                                            <td><%=mensaje[0]%></td>
                                            <td><%=mensaje[1]%></td>
                                        </tr>
                                        <% }
                                            }%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="card col-md-6">
                            <div class="card-header">
                                <strong class="card-title">Alumnos registrados</strong>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>N°</th>
                                            <th>Alumno</th>
                                            <th>Fecha</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% if (!alumnos.isEmpty()) {
                                                int i = 0;
                                                for (String[] alumno : alumnos) {
                                                    i++;%>
                                        <tr>
                                            <td><%=i%></td>
                                            <td><%=alumno[0]%></td>
                                            <td><%=alumno[2]%></td>
                                        </tr>
                                        <% }
                                            }%>
                                    </tbody>
                                </table>
                            </div>
                        </div>                
                    </div>
                    <!-- .animated -->
                </div>

                <!-- /.content -->
                <div class="clearfix"></div>
                <!-- Footer -->
                <footer class="site-footer">
                    <div class="footer-inner bg-white">
                        <div class="row">
                            <div class="col-sm-6">
                                Copyright &copy; 2019
                            </div>
                            <div class="col-sm-6 text-right">
                                Juan Araujo Bravo</a>
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- /.site-footer -->
            </div>
            <!-- /#right-panel -->
    </body>

    <!-- Scripts -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
    <script src="assets/js/main.js"></script>


    <script src="assets/js/lib/data-table/datatables.min.js"></script>
    <script src="assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
    <script src="assets/js/lib/data-table/dataTables.buttons.min.js"></script>
    <script src="assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
    <script src="assets/js/lib/data-table/jszip.min.js"></script>
    <script src="assets/js/lib/data-table/vfs_fonts.js"></script>
    <script src="assets/js/lib/data-table/buttons.html5.min.js"></script>
    <script src="assets/js/lib/data-table/buttons.print.min.js"></script>
    <script src="assets/js/lib/data-table/buttons.colVis.min.js"></script>
    <script src="assets/js/init/datatables-init.js"></script>


    <script type="text/javascript">
        $(document).ready(function () {
            $('#bootstrap-data-table-export').DataTable();
        });
    </script>
    <script type="text/javascript">
        function startTime() {
            today = new Date();
            d = today.getDay();
            m = today.getMonth();
            y = today.getFullYear();
            h = today.getHours();
            m = today.getMinutes();
            s = today.getSeconds();
            m = checkTime(m);
            s = checkTime(s);
            document.getElementById('reloj').innerHTML = d + "/" + m + "/" + y + " - " + h + ":" + m + ":" + s;
            t = setTimeout('startTime()', 500);
        }
        function checkTime(i)
        {
            if (i < 10) {
                i = "0" + i;
            }
            return i;
        }
        window.onload = function () {
            startTime();
        }
    </script>
</html>