<%-- 
    Document   : lihatBahasa
    Created on : Oct 16, 2018, 5:09:20 PM
    Author     : 680183
--%>

<%@page import="models.Bahasa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>CV ONLINE</title>
    </head>
    <body>
        <% List<Bahasa> datas = (List<Bahasa>) session.getAttribute("dataBahasa");
            String message = (String) session.getAttribute("PESAN");
            if (message != null) {
                out.println(message);
            }%>
        <div class="col-lg-6">
            <div class="card">
                <div class="card-header">
                    <strong class="card-title">Data Bahasa</strong>
                </div>
                <div class="card-body">
                    <table id="bootstrap-data-table" class="table table-striped table-bordered">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col" width="50%"> EDIT </th>
                                <th scope="col" width="50%"> NAMA </th>
                                <th scope="col" width="50%"> SPEAKING </th>
                                <th scope="col" width="50%"> READING </th>
                                <th scope="col" width="50%"> WRITING </th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Bahasa bahasa : datas) {%> 
                            <tr>
                                <td><a class="menu-icon fa fa-edit" href="./editBahasa?id=<%= bahasa.getIdBahasa()%>"></a> |
                                    <a class="menu-icon fa fa-trash" href="./deleteBahasa?id=<%= bahasa.getIdBahasa()%>"></a></td>
                                <td><%= bahasa.getNamaBahasa()%></td>
                                <td><%= bahasa.getSpeaking()%></td>
                                <td><%= bahasa.getReading()%></td>
                                <td><%= bahasa.getWriting()%></td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
         <script src="assets/js/vendor/jquery-2.1.4.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/plugins.js"></script>
        <script src="assets/js/main.js"></script>

        <script src="assets/js/lib/data-table/datatables.min.js"></script>
        <script src="assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
        <script src="assets/js/lib/data-table/dataTables.buttons.min.js"></script>
        <script src="assets/js/lib/data-table/buttons.bootstrap.min.js"></script>
        <script src="assets/js/lib/data-table/jszip.min.js"></script>
        <script src="assets/js/lib/data-table/pdfmake.min.js"></script>
        <script src="assets/js/lib/data-table/vfs_fonts.js"></script>
        <script src="assets/js/lib/data-table/buttons.html5.min.js"></script>
        <script src="assets/js/lib/data-table/buttons.print.min.js"></script>
        <script src="assets/js/lib/data-table/buttons.colVis.min.js"></script>
        <script src="assets/js/lib/data-table/datatables-init.js"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                $('#bootstrap-data-table-export').DataTable();
            });
        </script>
    </body>
</html>
