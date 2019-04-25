<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro de clientes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href = "css\cadastroClientes.css" rel = "stylesheet" type = "text/css"/>
    </head>
    <body>
        <header>
            <div class="titulo">
                <img class="logo" src="https://i.imgur.com/1ayr6NR.png">
                <h1>Noobies</h1>
            </div>
        </header>
    <center>
        <h1>Cadastro de Clientes</h1>
        <hr>
        <form action="cliente" method="post"> 
            <div class="formulario">
                <div>
                    <label>Nome: </label>
                    <input class="nome" type="text" name="nome" required>
                    <c:if test="${not empty erroNome}">
                        <div style="background-color: lightcoral"><c:out value="${erroNome}" /></div>
                    </c:if>
                </div>

                <br>
                <div>
                    <label class = "cpf">CPF: </label>
                    <input class = "cpf" type="text" name="cpf">
                    <c:if test="${not empty erroCPF}">
                        <div style="background-color: lightcoral"><c:out value="${erroCPF}" /></div>
                    </c:if>
                </div>
                <br>
                <div>
                    <label>EndereÃ§o: </label>
                    <input class="endereco" type="text" name="endereco">
                    <c:if test="${not empty erroEndereco}">
                        <div style="background-color: lightcoral"><c:out value="${erroEndereco}" /></div>
                    </c:if>
                </div>
                <br>
                <div>
                    <label>Telefone: </label>
                    <input class="telefone" type="text" name="telefone">
                    <c:if test="${not empty erroTelefone}">
                        <div style="background-color: lightcoral"><c:out value="${erroTelefone}" /></div>
                    </c:if>
                </div>
                <br>
                <div>
                    <label>E-mail: </label>
                    <input class="email" type="text" name="email">
                    <c:if test="${not empty erroEmail}">
                        <div style="background-color: lightcoral"><c:out value="${erroEmail}" /></div>
                    </c:if>
                </div>
            </div>
                <button type="submit">CADASTRAR</button>
            </center>
        </form>
    </body>
</html>

