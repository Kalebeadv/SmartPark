<%-- 
    Document   : MostraMotorista
    Created on : 15 de nov de 2021, 14:11:15
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Texto" type="String" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Motoristas</title>
    </head>
    <body>
        <h1>Resultado da busca:</h1>
        ${Texto}
    </body>
</html>
