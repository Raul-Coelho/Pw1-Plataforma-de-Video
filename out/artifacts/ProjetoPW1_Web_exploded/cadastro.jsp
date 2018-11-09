<%--
  Created by IntelliJ IDEA.
  User: Raul Coelho
  Date: 08/11/2018
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css"/>
    <title>Cadastro Usuario</title>
</head>
<body>
    <div id="divPrincipal">
    <center>
        <h1 id="titulo">Cadastro Usuario</h1>
        <div class="divForm">
            <form action="cadastrar">
                <label>Nome</label>
                <input name="nome" type="text" > <br>
                <label>Email</label>
                <input name="email" type="text"> <br>
                <label>Senha</label>
                <input name="senha" type="password"> <br>
                <label>Sexo</label>
                <input name="sexo" type="char"> <br>
                <label>Rua</label>
                <input name="rua" type="text"> <br>
                <label>Numero</label>
                <input name="numero" type="text"> <br>
                <label>Cidade</label>
                <input name="cidade" type="text"> <br>
                <label>Estado</label>
                <input name="estado" type="text"> <br>
                <label>Cep</label>
                <input name="cep" type="text"> <br>
                <label>Telefone</label>
                <input name="telefone" type="text"> <br>
                <label>Foto</label>
                <input name="foto" type="file"> <br>
                <input type="submit" value="Cadastrar">
            </form>
        </div>
    </center>
    </div>

</body>
</html>
