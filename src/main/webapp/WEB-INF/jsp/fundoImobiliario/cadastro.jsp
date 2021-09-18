<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="jumbotron text-center">
    <h1>AÇÕES</h1>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro De Ativos</h3>
            <form action="/acao/incluir" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <label>Nome Ativo</label>
                        <input type="text" class="form-control" placeholder="Nome do ativo" name="nome">
                    </div>

                    <div class="form-group">
                        <label>Empresa</label>
                        <input type="text" class="form-control" placeholder="Empresa" name="empresa">
                    </div>

                    <div class="form-group">
                        <label>Valor de Compra</label>
                        <input type="number" class="form-control" placeholder="R$ Compra" name="valor">
                    </div>

                    <div class="form-group">
                        <label>Valor de Dividendo</label>
                        <input type="number" class="form-control" placeholder="R$ Dividendo" name="dividendo">
                    </div>

                    <div class="form-group">
                        <label>Quantidade</label>
                        <input type="text" class="form-control" placeholder="Digite a quantidade" name="quantidade">
                    </div>
                    <button type="submit" class="btn btn black">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>