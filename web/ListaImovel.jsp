<%-- 
    Document   : ListaEstacionamento
    Created on : 13 de nov de 2021, 19:27:53
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Texto" type="String" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Estacionamentos</title>
    </head>
    <body>
        <h1>Os estacionamentos disponiveis são:</h1>
        ${Texto}
    </body>
</html>
