<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>AT-JAVA</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="jumbotron text-center">
    <h1>Simulação</h1>
    <br>
    <br>
    <br>
    <c:if test="${not empty mensagem}">
        <div class="alert alert-success alert-dismissible">
            <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>!</strong> ${mensagem}
        </div>
    </c:if>

    <c:if test="${not empty simulacao}">
        <h4>Quantidade de simulações cadastrados: ${simulacao.size()}</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Ativo</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="sim" items="${simulacao}">
                <tr>
                    <td>${sim.id}</td>
                    <td>${sim.nome}</td>
                    <td>${sim.valor}</td>
                    <td>${sim.quantidade}</td>
                    <td><a href="/simulacao/${sim.id}/excluir" method="get">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty simulacao}">
        <h4>Não existem simulações cadastradas ate o momento</h4>
    </c:if>
</div>
</div>
</div>
</div>
</body>
</html>