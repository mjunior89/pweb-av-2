<%-- 
    Document   : tratadorEspacos
    Created on : 20/01/2016, 20:54:19
    Author     : aluno
--%>

<%@page import="negocio.TratadorString"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tratador Ocorrencias!</h1>
        <%
            TratadorString tratador = (TratadorString) session.getAttribute("tratador");
            out.println(tratador.tratarEspacos());
        %>
        <br />
        <input type="button" value="Voltar" onclick="history.back()" />
    </body>
</html>
