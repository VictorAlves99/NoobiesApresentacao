<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Cadastro de Produtos</title>
        <link rel="stylesheet" href="css/cadastro-produtos.css">
        <link rel="shortcut icon" href="img/logo.png" type="image/x-icon">
    </head>
    <body>
        <header>
            <div>
                <a href="http://localhost:8084/noobies"><img src="img/logo-simple.png"/></a>
                <h1>Noobies</h1>
            </div>
        </header>
        <div class="divProds">
            <h2>Cadastrar Produto</h2>
        </div>
        <hr>
        <br><br>
        <div>
            <form action="resultadoProduto.jsp" method="post">
                <div class="divNome">
                    <p>Nome do Produto:</p>
                </div>
                <div class="divNomeInput">
                    <input name="nome" type="text" required>
                </div>
                <div class="divDescricao">
                    <p>Descrição do Produto:</p>
                </div>
                <div class="divDescricaoTxtArea">
                    <textarea name="descricao">
                    </textarea>
                </div>
                <div class="divValorCV">
                    <p>Valor de Compra:</p>
                    <p>Valor de venda:</p>
                </div>
                <div class="divValoresInput">
                    <input name="valorCompra" type="text" required>
                    <input name="valorVenda" type="text" required>
                </div>
                <div class="divQTDCAT">
                    <p>Quantidade:</p>
                    <p>Categoria:</p>
                </div>
                <div class="divQTDCATInput">
                    <input name="quantidade" type="text" required>
                    <select name="categoria">
                        <option value="">Selecione uma Categoria...</option>
                        <option value="PS4">PS4</option>
                        <option value="XBOX-ONE">XBOX ONE</option>
                        <option value="SWITCH">Nintendo Switch</option>
                        <option value="TABULEIRO">Tabuleiro</option>
                        <option value="PC">PC</option>
                    </select>
                </div>
                <br><br><br>
                <div class="divBotao">
                    <button type="reset">Limpar</button>
                    <button type="submit">Cadastrar</button>
            </form>
        </div>
    </body>
</html>