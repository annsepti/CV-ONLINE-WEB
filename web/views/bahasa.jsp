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
        <title>BAHASA</title>

    </head>
    <body>

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


</body>
</html>
