<%@page import="br.NoobiesTestes.produto.web.Models.Produto"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

    <head>
        <title> Cadastro de Produto</title>        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    </head>
        <script>
            
        </script>
        <%
            Produto produto = new Produto();
            try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/noobies?useTimezone=true&serverTimezone=UTC","root","");
            if(con!=null){
                PreparedStatement stmt = con.prepareStatement("INSERT INTO produto (nome,descricao,valorCompra,valorVenda,quantidade,categoria)"+
                        " VALUES (?,?,?,?,?,?)");
                stmt.setString(1,produto.getNome());
            }
        }catch(Exception e){ 
            out.println("Não foi");
            out.println(e);
        }
        %>
    

