<%-- 
    Document   : tratarCaracteresEsp
    Created on : 20/01/2016, 20:54:45
    Author     : aluno
--%>

<%@page import="negocio.TratadorString"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tratar Caracteres Especiais</title>
    </head>
    <body>
        <h1>Tratar Caracteres Especiais!</h1>
        <%
            TratadorString tratador = (TratadorString) session.getAttribute("tratador");
            out.println(tratador.tratarCaracteresEspeciais());
        %>
        <br />
        <input type="button" value="Voltar" onclick="history.back()" />
    </body>
</html>
