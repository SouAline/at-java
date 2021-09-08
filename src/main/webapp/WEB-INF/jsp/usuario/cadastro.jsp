<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>AT-Java</title>

</head>
<body>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
        <h3>Cadastro</h3>
        <form action="/usuario/cadastro" method="post">
                    <div class="login-form">
                        <div class="form-group">
                            <label>Nome</label>
                            <input type="text" class="form-control" placeholder="Digite seu nome" name="nome">
                        </div>

                        <div class="form-group">
                            <label>E-mail</label>
                            <input type="email" class="form-control" placeholder="Digite seu e-mail" name="email">
                        </div>

                        <div class="form-group">
                            <label>Senha</label>
                            <input type="password" class="form-control" placeholder="Digite sua senha" name="senha">
                        </div>

                        <button type="submit" class="btn btn black">Cadastrar</button>
                    </div>
        </form>
    </div>
</div>
</div>
</body>
</html>

