<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>AT-Java</title>

</head>
<body>

<div class="container">
    <c:if test="${not empty mensagem}">
        <div class="alert alert-info alert-dismissible">
            <a href="#" class="close" data-dismiss="alert" arial-label="close"></a>
                ${mensagem}
        </div>
    </c:if>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
        <h3>Autenticação</h3>
        <form action="/home" method="post">
                    <div class="login-form">
                        <div class="form-group">
                            <label>E-mail</label>
                            <input type="text" class="form-control" placeholder="Digite seu e-mail" name="email">
                        </div>

                        <div class="form-group">
                            <label>Senha</label>
                            <input type="password" class="form-control" placeholder="Digite sua senha" name="senha">
                        </div>

                        <button type="submit" class="btn btn black">Entrar</button>
                        <a href="/usuario/cadastro" type="submit" class="btn btn-info">Cadastrar</a>
                    </div>
        </form>
    </div>
</div>
</div>
</body>
</html>