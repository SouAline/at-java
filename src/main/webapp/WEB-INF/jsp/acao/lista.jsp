<%@page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>AT-Java</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container">

    <form action="/acao" method="get">
        <button type="submit" class="btn btn-link">Incluir</button>
    </form>
    <hr>
    <c:if test="${not empty acoes}">
        <c:if test="${not empty mensagem}">
            <div class="alert alert-success">
                <strong>Sucesso!</strong> ${mensagem}
            </div>
        </c:if>


        <h4>Ações cadastradas: ${acoes.size()}!!</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Nome Do Ativo</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ac" items="${acoes}">
                <td>
                <td>${ac.id}</td>
                <td>${ac.nome}</td>
                <td>${ac.valor}</td>
                <a><a href="acao/${ac.id}/excluir"/>Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty acoes}">
        <h4>Não há ações cadastrados no momento.</h4>
    </c:if>
</div>
</body>
</html>


