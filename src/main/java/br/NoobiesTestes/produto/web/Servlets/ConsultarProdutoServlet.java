package br.NoobiesTestes.produto.web.Servlets;

import br.NoobiesTestes.produto.web.Dao.ProdutoDAO;
import br.NoobiesTestes.produto.web.Models.Produto;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConsultarProdutoServlet", urlPatterns = {"/ConsultarProduto"})
public class ConsultarProdutoServlet extends HttpServlet {
    
    protected void processRequest(String metodoHttp, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Produto produto = new Produto();
        
        // RECUPERA INFORMACOES DA REQUISICAO
        produto.setNomeProd(request.getParameter("nome"));
        produto.setDescProd(request.getParameter("descricao"));
        produto.setValorCompra(Float.parseFloat(request.getParameter("valorVenda")));
        produto.setValorVenda(Float.parseFloat(request.getParameter("valorCompra")));
        produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        produto.setCategoria(request.getParameter("categoria"));

        ProdutoDAO.incluirProduto(produto);
        
        
        
        // ARMAZENANDO VALORES COMO ATRIBUTOS
//        request.setAttribute("metodoHttp", metodoHttp);
//        request.setAttribute("nome", nome);
//        request.setAttribute("descricao", descricao);
//        request.setAttribute("valorVenda", valorVenda);
//        request.setAttribute("valorCompra", valorCompra);
//        request.setAttribute("quantidade", quantidade);
//        request.setAttribute("categoria", categoria);
//        
//        RequestDispatcher dispatcher
//                = request.getRequestDispatcher("resultadoProduto.jsp");
//        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest("GET",request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest("POST",request, response);
    }
    
    
}
