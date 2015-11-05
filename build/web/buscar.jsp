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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar Cliente</h1><br>
        <html:form action="/buscar1.do" method="post">
            <html:text property="rutC"/><br>
            <html:submit>Buscar</html:submit><br>
        </html:form>
        <bean:write name="Cliente" property="rutC"/><br>
        <bean:write name="Cliente" property="nombre"/><br>
        <bean:write name="Cliente" property="telefono"/><br>
        <bean:write name="Cliente" property="email"/><br>
        <bean:write name="Cliente" property="direccion"/><br>
    </body>
</html>
