<%-- 
    Document   : principal
    Created on : 31-10-2015, 4:02:38
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
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <html:link href="buscar.jsp" >Buscar</html:link>
        <br>
        <html:link href="guardar.jsp" >Guardar</html:link>
        <br>
        <html:link action="/listar1.do">Listar</html:link>
    </body>
</html>
