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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Look!</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<% List<Bahasa> datas = (List<Bahasa>) session.getAttribute("dataBahasa");
    int i = 1;
%>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nama</th>
                            <th>Aksi</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Bahasa bahasa : datas) {%>
                        <tr>
                            <td><%= bahasa.getIdBahasa()%></td>
                            <td><%= bahasa.getNamaBahasa()%></td>
                            <td><a href="./EditBahasa?id=<%=bahasa.getIdBahasa()%>">Edit</a>||
                                <a href="./DeleteBahasa?id=<%=bahasa.getIdBahasa()%>">Delete</a>
                            </td>
                        </tr>
                        <% i++;
            }%>
                    </tbody>
                </table>