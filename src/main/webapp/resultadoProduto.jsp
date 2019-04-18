<%@page import="br.NoobiesTestes.produto.web.Models.Produto"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>    
<html>
    <head>
        <title> Cadastro de Produto</title>        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    </head>
    <body>
        <%
            String nome = request.getParameter("nome");            
            String descricao = request.getParameter("descricao");
            String valorCompra = request.getParameter("valorCompra");
            String valorVenda = request.getParameter("valorVenda");
            String quantidade = request.getParameter("quantidade");
            String categoria = request.getParameter("categoria");

            
        %>
    </body>
</html>
