<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Consulta de Produtos</title>
        <link rel="stylesheet" href="css/consultar-produtos.css">
        <link rel="shortcut icon" href="img/logo.png" type="image/x-icon">
        <script defer src="js/consultar-produtos.js"></script>
    </head>
    <body>        
        <div id="fixed">
            <header>
                <div>
                    <a href="http://localhost:8084/noobies"><img src="img/logo-simple.png"/></a>
                    <h1>Noobies</h1>
                </div>
            </header>
        <div class="divProds">
            <h2>CONSULTA DE PRODUTOS</h2>
        </div>
        <div class="header">
            <nav>
                <ul>
                    <li><a href="#espacador1">CONSULTAR</a></li>
                    <li id="barraVertical"></li>
                    <li><a href="#espacador2">ALTERAR</a></li>
                </ul>
            </nav>
        </div>
        </div>

        <div id="resto">
            <div id="espacador1">

            </div>
            <h3 class="h3"  id="consultar">CONSULTA</h3>
            <div class="organizar">
                <div>
                    <table class="tabela">
                        <tr class="linhaPrinc">
                            <th>ID</th>
                            <th>NOME</th>
                            <th>V.COMPRA</th>
                            <th>V.VENDA</th>
                            <th>QUANT</th>
                        </tr>
                        <tr class="linhaSec">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr class="linhaSec">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr class="linhaSec">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr class="linhaSec">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </table>
                </div>
                <div class="pesquisaExc">
                    <div>
                        <h4>Pesquisa</h4>
                    </div>
                    <div class="inputPesq">
                        <form action="">
                            <input type="text" name="pesquisa">
                            <button class="buttonBusca">BUSCAR</button>
                        </form>
                    </div>
                    <div class="divisor">
                    </div>
                    <div class="excluir">
                        <button class="buttonExc">EXCLUIR</button>
                    </div>
                </div>
            </div>
            <div id="espacador2">
            </div>
            <div>
                <h3 class="h3" id="alteracao">ALTERAÇÃO</h3>
                <div id="alterar">
                </div>
                <div>
                    <form>
                        <div class="divNome">
                            <p>Nome do Produto:</p>
                        </div>
                        
                        <div class="divNomeInput">
                            <input name="nome" type="text" required>
                        </div>
                        <br>
                        <div class="divDescricao">
                            <p>Descrição do Produto:</p>
                        </div>
                        <div class="divDescricaoTxtArea">
                            <textarea name="descricao">
                            </textarea>
                        </div>
                        <br>
                        <div class="divValorCV">
                            <p>Valor de Compra:</p>
                            <p>Valor de venda:</p>
                        </div>
                        <div class="divValoresInput">
                            <input name="valorCompra" type="text" required>
                            <input name="valorVenda" type="text" required>
                        </div>
                        <br><br>
                        <div class="divBotao">
                            <button type="reset">Limpar</button>
                            <button type="submit">Alterar</button>
                        </div>
                    </form>
                    <div class="espacadorFinal"></div>
                </div>
            </div>
        </div>
    </body>
</html>