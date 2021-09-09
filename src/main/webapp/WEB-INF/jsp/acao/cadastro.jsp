<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>AT-Java</title>

</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="sidenav">
    <div class="login-main-text">
        <h3>Cadastro De Ativos</h3>
        <form action="/acao/cadastro" method="get">

            <div class="main">
                <div class="col-md-6 col-sm-12">
                    <div class="login-form">
                        <div class="form-group">
                            <label>Nome Ativo</label>
                            <input type="text" class="form-control" placeholder="Digite o nome do ativo" name="nome">
                        </div>

                        <div class="form-group">
                            <label>Empresa</label>
                            <input type="text" class="form-control" placeholder="Digite a quantidade" name="empresa">
                        </div>

                        <div class="form-group">
                            <label>Valor de Compra</label>
                            <input type="number" class="form-control" placeholder="Digite o valor de compra" name="valor">
                        </div>

                        <div class="form-group">
                            <label>Valor de Dividendo</label>
                            <input type="number" class="form-control" placeholder="Digite o valor de compra" name="dividendo">
                        </div>

                        <div class="form-group">
                            <label>Quantidade</label>
                            <input type="text" class="form-control" placeholder="Digite a quantidade" name="quantidade">
                        </div>

                        <button type="submit" class="btn btn black">Cadastrar</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
