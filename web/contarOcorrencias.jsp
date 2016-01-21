<%-- 
    Document   : contarOcorrencias
    Created on : 20/01/2016, 20:55:47
    Author     : aluno
--%>

<%@page import="negocio.TratadorString"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contar Ocorrências</title>
    </head>
    <body>
        <h1>Contar Ocorrências!</h1>
        <%
            TratadorString tratador = (TratadorString) session.getAttribute("tratador");
            out.println(tratador.contarOcorrencias());
        %>
        <br />
        <input type="button" value="Voltar" onclick="history.back()" />
    </body>
</html>
