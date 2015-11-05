<%-- 
    Document   : buscar
    Created on : 31-10-2015, 4:03:07
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
        <title>Buscar Cliente</title>
    </head>
    <body>
        <h1>Buscar Cliente</h1><br>
            <html:form action="/buscar1.do" method="post">
                <table>
                <tr>
                    <td>Ingrese Rut Cliente</td>
                    <td><html:text property="rutC"/></td>
                </tr>
                <tr>
                    <td><html:submit>Buscar</html:submit></td>
                </tr>
                </table>
            </html:form>
        <bean:write name="Cliente" property="rutC"/><br>
        <bean:write name="Cliente" property="nombre"/><br>
        <bean:write name="Cliente" property="telefono"/><br>
        <bean:write name="Cliente" property="email"/><br>
        <bean:write name="Cliente" property="direccion"/><br>
    </body>
</html>
