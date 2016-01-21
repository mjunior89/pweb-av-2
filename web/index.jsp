<%-- 
    Document   : index
    Created on : 20/01/2016, 20:55:58
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletControlador" method="GET">
            <h1>Avaliação 2 - PWEB!</h1>
            <div>
                Digite a frase:
                <br />
                <input type="text" name="txt" />
                <br />
                <br />
                <br />
                <hr />
                <table>
                    <tr>
                        <td>
                            <input type="submit" title="Palindromo" value="palindromo" name="btnAcao" />
                        </td>
                        <td>
                            <input type="submit" title="Tratador Espaços" value="tratadorEspacos" name="btnAcao" />
                        </td>
                        <td>
                            <input type="submit" title="Tratar Caracteres Esp." value="tratarCaracteresEsp" name="btnAcao" />
                        </td>
                        <td>
                            <input type="submit" title="Contar Ocorrencias" value="contarOcorrencias" name="btnAcao" />
                        </td>
                    </tr>

                </table>

                </p>

            </div>

    </body>
</html>
