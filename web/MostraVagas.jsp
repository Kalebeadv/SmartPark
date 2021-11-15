<%-- 
    Document   : Vagas
    Created on : 14 de nov de 2021, 23:47:50
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Texto" type="String" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vagas Disponiveis</title>
    </head>
    <body>
        ${Texto}
    </body>
</html>
