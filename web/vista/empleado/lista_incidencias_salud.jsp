<%-- 
    Document   : lista_inicidencias_salud
    Created on : 10/12/2019, 04:14:58 AM
    Author     : JuanEAB
--%>
<%@page import="com.mycompany.models.Usuario"%>
<%
    Usuario user_registrado = (Usuario)request.getSession().getAttribute("usuario_registrado");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SaludFISI</title>
        <meta name="description" content="Ela Admin - HTML5 Admin Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" href="images/logo_unmsm.png">
        <link rel="shortcut icon" href="images/logo_unmsm.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/cs-skin-elastic.css">
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
                        <li class="menu-title">Mis Tareas</li><!-- /.menu-title -->
                        <li>
                            <a href="/ProyectoPatrones/controlador_empleado_lista_tareas"><i class="menu-icon fa fa-briefcase"></i>Lista de tareas</a>
                        </li>
                        <li class="menu-title">Mis Incidencias</li><!-- /.menu-title -->
                        <li>
                            <a href="/ProyectoPatrones/controlador_empleado_lista_incidencias_tarea"><i class="menu-icon fa fa-wrench"></i>Incidencias en tarea</a>
                        </li>
                        <li class="active">
                            <a href="/ProyectoPatrones/controlador_empleado_lista_incidencias_salud"><i class="menu-icon fa fa-medkit"></i>Incidencias en salud</a>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </aside><!-- /#left-panel -->

        <!-- Left Panel -->

        <!-- Right Panel -->

        <div id="right-panel" class="right-panel">

            <!-- Header-->
            <header id="header" class="header">
                <div class="top-left">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="./"><img src="images/logo_sistema.png" alt="Logo"></a>
                        <a class="navbar-brand hidden" href="./"><img src="images/logo_sistema_2.png" alt="Logo"></a>
                        <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                    </div>
                </div>
                <div class="top-right">
                    <div class="header-menu">
                        <div class="header-left">
                          
                            <div class="dropdown for-notification">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class=""><%=user_registrado.getFirstname() %> <%=user_registrado.getLastname() %></i>
                                </button>
                                
                            </div>

                        </div>

                        <div class="user-area dropdown float-right">
                            <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img class="user-avatar rounded-circle" src="images/icon_user.png" alt="User Avatar">
                            </a>
                               
                            <div class="user-menu dropdown-menu">
                                <a class="nav-link" href="/ProyectoPatrones/controlador_exit"><i class="fa fa-power-off"></i>Salir</a>
                            </div>
                        </div>
                    </div>
                </div>
            </header><!-- /header -->
            <!-- Header-->

            <div class="breadcrumbs">
                <div class="breadcrumbs-inner">
                    <div class="row m-0">
                        <div class="col-sm-4">
                            <div class="page-header float-left">
                                <div class="page-title">
                                    <h1>Incidencias</h1>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="page-header float-right">
                                <div class="page-title">
                                    <ol class="breadcrumb text-right">
                                        <li><a href="#">Incidencias</a></li>
                                        <li class="active">Incidencias de Salud</li>
                                    </ol>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="content">
                <div class="animated fadeIn">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-header">
                                    <strong class="card-title">Incidencias de Salud</strong>
                                </div>
                                <div class="table-stats order-table ov-h">
                                    <table class="table text-center">
                                        <thead>
                                            <tr>
                                                <th class="serial">#</th>
                                                <th>ID</th>
                                                <th>Tipo</th>
                                                <th>Tarea</th>
                                                <th>Fecha</th>
                                                <th>Ver Más</th>
                                                <th>Estado</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td class="serial">1.</td>
                                                
                                                <td> #5469 </td>
                                                <td>  <span class="name">Louis Stanley</span> </td>
                                                <td> <span class="product">iMax</span> </td>
                                                <td><span class="date">15/12/2019</span></td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalUno">Ver Más</button>
                                                </td>
                                                <td >
                                                    <span class="badge badge-complete">Complete</span>
                                                </td>
                                            </tr>
                                            
                                            
                                            <tr>
                                                <td class="serial">4.</td>
                                               
                                                <td> #5466 </td>
                                                <td>  <span class="name">Mary Silva</span> </td>
                                                <td> <span class="product">Magic Mouse</span> </td>
                                                <td><span class="date">15/12/2019</span></td>
                                                <td>
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalDos">Ver más</button>
                                                </td>
                                                <td>
                                                    <span class="badge badge-pending">Pending</span>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <!-- Modal -->
                                    <div class="modal fade" id="myModalUno" role="dialog">
                                        <div class="modal-dialog">
                                            <!-- Modal content-->
                                            <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                <h4 class="modal-title">Modal </h4>
                                            </div>
                                            <div class="modal-body">
                                                 Información del Row
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                            </div>
                                        </div>
                                    </div>
                                    </div>
                                    <!-- FIN Modal -->
                                     <!-- Modal 1-->
                                    <div class="modal fade" id="estadoUno" role="dialog">
                                            <div class="modal-dialog">
                                                <!-- Modal content-->
                                                <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">Modal Estado </h4>
                                                </div>
                                                <div class="modal-body">
                                                    ¿Desea confirmar el cambio?
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-success" >Aceptar</button>
                                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>
                                        </div>
                                        </div>
                                        <!-- FIN Modal -->


                                     <!-- Modal -->
                                    <div class="modal fade" id="myModalDos" role="dialog">
                                            <div class="modal-dialog">
                                            <!-- Modal content-->
                                            <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                <h4 class="modal-title">Modal </h4>
                                            </div>
                                            <div class="modal-body">
                                                <p>Información del Row</p>
                                                
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                            </div>
                                        </div>
                                    </div>
                                    </div>
                                    <!-- FIN Modal -->
                                     <!-- Modal2 -->
                                    <div class="modal fade" id="estadoDos" role="dialog">
                                            <div class="modal-dialog">
                                                <!-- Modal content-->
                                                <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h4 class="modal-title">Modal Estado </h4>
                                                </div>
                                                <div class="modal-body">
                                                    ¿Desea confirmar el cambio?
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-success" >Aceptar</button>
                                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>
                                        </div>
                                        </div>
                                        <!-- FIN Modal -->
                                </div> <!-- /.table-stats -->
                            </div>
                        </div>
                    </div>
                </div><!-- .animated -->
            </div><!-- .content -->

            <div class="clearfix"></div>

            <footer class="site-footer">
                <div class="footer-inner bg-white">
                    <div class="row">
                        <div class="col-sm-6">
                            Copyright &copy; 2019 SaludFISI
                        </div>
                        <div class="col-sm-6 text-right">
                            Designed by <a href="https://colorlib.com">TEAM_SALUDFISI</a>
                        </div>
                    </div>
                </div>
            </footer>

        </div><!-- /#right-panel -->

        <!-- Right Panel -->

        <!-- Scripts -->
        <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
        
        <script src="assets/js/main.js"></script>


    </body>
</html>