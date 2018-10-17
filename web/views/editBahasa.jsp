<%-- 
    Document   : editBahasa
    Created on : Oct 17, 2018, 9:11:45 AM
    Author     : 680183
--%>

<%@page import="java.util.List"%>
<%@page import="models.Bahasa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% Bahasa bahasa = (Bahasa) session.getAttribute("bahasa");
        %>
        <h1>  <%= bahasa.getNamaBahasa() %> </h1>
        
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nama</th>
                    <th>Reading</th>
                    <th>Speaking</th>
                    <th>Writing</th>
                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= bahasa.getIdBahasa()%></td>
                    <td><%= bahasa.getNamaBahasa()%></td>
                    <td><%= bahasa.getReading()%></td>
                    <td><%= bahasa.getSpeaking()%></td>
                    <td><%= bahasa.getWriting()%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>

