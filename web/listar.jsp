<%-- 
    Document   : listar
    Created on : 31-10-2015, 4:03:19
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista</h1>
        <table>
        <logic:iterate id="Lista1" name="Lista">
                <tr>
                    <td><bean:write name="Lista1" property="rutC"/></td>
                    <td><bean:write name="Lista1" property="nombre"/></td>
                    <td><bean:write name="Lista1" property="email"/></td>
                    <td><bean:write name="Lista1" property="direccion"/></td>
                    <td><bean:write name="Lista1" property="telefono"/></td>
                </tr>
        </logic:iterate>
        </table>
    </body>
</html>
