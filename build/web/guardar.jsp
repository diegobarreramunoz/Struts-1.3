<%-- 
    Document   : guardar
    Created on : 31-10-2015, 4:02:52
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Guardar</h1><br>
        <html:form action="/controlador1.do" method="post">
            <table>
                <tr><td>Rut:</td><td><html:text property="rutC"/></td></tr>
                <tr><td>telefono:</td><td><html:text property="telefono"/></td></tr>
                <tr><td>email:</td><td><html:text property="email"/></td></tr>
                <tr><td>direccion:</td><td><html:text property="direccion"/></td></tr>
                <tr><td>nombre:</td><td><html:text property="nombre"/></td></tr>
            </table>
            <html:submit/>
        </html:form>
    </body>
</html>
