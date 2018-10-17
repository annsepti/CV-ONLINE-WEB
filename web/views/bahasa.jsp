<%-- 
    Document   : actor
    Created on : Oct 16, 2018, 2:34:40 PM
    Author     : 680183
--%>

<%@page import="models.Bahasa"%>
<%@page import="controllers.InterfaceController"%>
<%@page import="controllers.GeneralController"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Sufee Admin - HTML5 Admin Template</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Sufee Admin - HTML5 Admin Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="../apple-icon.png">
        <link rel="shortcut icon" href="../favicon.ico">
        <link rel="stylesheet" href="../assets/css/normalize.css">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="../assets/css/font-awesome.min.css">
        <link rel="stylesheet" href="../assets/css/themify-icons.css">
        <link rel="stylesheet" href="../assets/css/flag-icon.min.css">
        <link rel="stylesheet" href="../assets/css/cs-skin-elastic.css">
        <!-- <link rel="stylesheet" href="assets/css/bootstrap-select.less"> -->
        <link rel="stylesheet" href="../assets/scss/style.css">
        <link href="../assets/css/lib/vector-map/jqvmap.min.css" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>

    </head>
    <body>

        <script src="../assets/js/vendor/jquery-2.1.4.min.js"></script>
        <script src="../assets/js/popper.min.js"></script>
        <script src="../assets/js/plugins.js"></script>
        <script src="../assets/js/main.js"></script>


        <script src="../assets/js/lib/data-table/datatables.min.js"></script>
        <script src="../assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
        <script src="../assets/js/lib/data-table/dataTables.buttons.min.js"></script>
        <script src="../assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
        <script src="../assets/js/lib/data-table/jszip.min.js"></script>
        <script src="../assets/js/lib/data-table/pdfmake.min.js"></script>
        <script src="../assets/js/lib/data-table/vfs_fonts.js"></script>
        <script src="../assets/js/lib/data-table/buttons.html5.min.js"></script>
        <script src="../assets/js/lib/data-table/buttons.print.min.js"></script>
        <script src="../assets/js/lib/data-table/buttons.colVis.min.js"></script>
        <script src="../assets/js/lib/data-table/datatables-init.js"></script>


        <script type="text/javascript">
            $(document).ready(function () {
                $('#bootstrap-data-table-export').DataTable();
            });
        </script>
        <h1>Hello World!</h1>
        <div class="content mt-3">
            <div class="animated fadeIn">        
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <strong class="card-title">Data Table</strong>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">

                                    <%
                                        String message = (String) session.getAttribute("pesan");
                                        out.println(message);
                                        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                                        InterfaceController<Bahasa> datas = new GeneralController<Bahasa>(sessionFactory, Bahasa.class);
                                        for (Bahasa bahasa : datas.getAll()) {
                                    %>
                                    <tr>
                                        <td><%= bahasa.getIdBahasa()%></td>
                                        <td><%= bahasa.getNamaBahasa()%></td>
                                    </tr>
                                    <% }%>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- .animated -->
        </div>              

    </body>
</html>
