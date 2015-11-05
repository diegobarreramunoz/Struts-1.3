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
            Rut      :<html:text property="rutC"/><br>
            telefono :<html:text property="telefono"/><br>
            email    :<html:text property="email"/><br>
            direccion:<html:text property="direccion"/><br>
            nombre   :<html:text property="nombre"/><br>
            <html:submit/>
        </html:form>
    </body>
</html>
