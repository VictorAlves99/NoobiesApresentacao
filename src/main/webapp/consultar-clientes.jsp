<%-- 
    Document   : consultar-clientes
    Created on : 24/04/2019, 21:17:08
    Author     : gabriela.vsmarques
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Consulta de clientes</title>
  <link href = "consultarClientes.css" rel = "stylesheet" type = "text/css"/>
</head>

<body>
  <div id="menu">
    <header>
      <div class="menu">
        <div class="titulo">
          <img class="logo" src="https://i.imgur.com/1ayr6NR.png">
          <h1>Noobies</h1>
        </div>
      </div>
    </header>
    <div class="divFuncs">
      <h2>CONSULTAR CLIENTES</h2>  
    </div>
    <div class="header">
      <hr>
      <nav>
        <ul>
          <li><a href="#espacador">CONSULTAR</a></li>
          <li id="barraVertical"></li>
          <li><a href="#alterar">ALTERAR</a></li>
        </ul>
      </nav>
      <hr>
    </div> 
  </div>
  <div id="espacador"></div>
  <div id="consultar">
    <h3 class="h3">CONSULTAR</h3>
    <hr>  
  </div>
</div>
<div class="consultarTable">
  <div class="tabConteudo">
    <table class="tabela">
      <tr class="row">
        <th class="tcpf">CPF</th>
        <th class="tnome">NOME</th>
        <th class="tendereco">ENDEREÇO</th>
        <th class="ttelefone">TELEFONE</th>
        <th class="temail">E-MAIL</th>
      </tr>
      
      <tr class="conteudo">
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr class="conteudo">
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr class="conteudo">
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr class="conteudo">
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr class="conteudo">
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr> 
      <c:forEach var="produto" items="${listaClientes}">
                            <tr class="linhaSec">
                                <td><c:out value="${c.cpf}" /></td>
                                <td><c:out value="${c.nome}" /></td>
                                <td><c:out value="${c.endereco}" /></td>
                                <td><c:out value="${c.telefone}" /></td>
                                <td><c:out value="${c.email}" /></td>
                            </tr>
     </c:forEach>
      
      
      
    </table>
  </div>
</div>
  <div class="ladoTab">
    <div class="pesquisar">
      <h3>Pesquisar cliente:</h3>
      <input class="pesq" type="text" name="pesquisa">
      <button class="buscar">BUSCAR</button>
    </div> 
  </div>
  <hr>
  <h3 class="h3">ALTERAR CADASTRO</h3>
  <hr>
  <div class="infoCad">
    <div id="alterar">
      <div class="name">
        <label>Nome: </label>
        <input class="nome" type="text" name="nome">
      </div>
      <br>
      <div class="address">
        <label>Endereço: </label>
        <input class = "endereco" type="text" name="endereco">
      </div>
      <br>
      <div class="phone">
        <label>Telefone: </label>
        <input class="telefone" type="text" name="telefone">
      </div>
      <br>
      <div class="email">
        <label>E-mail: </label>
        <input class="mail" type="text" name="mail">
      </div>
      <br>
    </div>
  </div>
  <div class="salvar">
    <button class="save" type="submit">ATUALIZAR</button>
  </div>
</div>
</body>
</html>
