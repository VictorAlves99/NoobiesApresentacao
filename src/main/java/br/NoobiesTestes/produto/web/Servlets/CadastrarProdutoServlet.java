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

@WebServlet(name = "ProdutoServlet", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProdutoServlet extends HttpServlet {
    
    protected void processRequest(String metodoHttp, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Produto produto = new Produto();
        
        // RECUPERA INFORMACOES DA REQUISICAO
        produto.setNomeProd(request.getParameter("nome"));
        produto.setDescProd(request.getParameter("descricao"));
        produto.setValorCompra(Float.parseFloat(request.getParameter("valorCompra")));
        produto.setValorVenda(Float.parseFloat(request.getParameter("valorVenda")));
        produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        produto.setCategoria(request.getParameter("categoria"));
        
        
//        // VALIDAR DADOS
//        boolean temErros = false;
//        
//        if (produto.get == null || nome.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroNome", "Nome não preenchido");
//        }
//        if ( descricao == null || descricao.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroDescricao", "Descrição não preenchido");
//        }
//        if (valorVenda == null || valorVenda.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroValorCompra", "Valor de Compra não preenchido");
//        }
//        if (valorCompra == null || valorCompra.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroValorVenda", "Valor de Venda não preenchido");
//        }
//        if (quantidade == null || quantidade.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroQuantidade", "Quantidade não preenchido");
//        }
//        if (categoria == null || categoria.length() == 0) {
//            temErros = true;
//            request.setAttribute("erroCategoria", "Categoria não preenchido");
//        }
//        
//        if (temErros) {
//            // REAPRESENTA FORMULARIO INDICANDO OS ERROS
//            RequestDispatcher dispatcher = request.getRequestDispatcher("formularioProduto.jsp");
//            dispatcher.forward(request, response);
//        }

        boolean retorno = ProdutoDAO.incluirProduto(produto);
        if(retorno){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/consultar-produtos.jsp");
            dispatcher.forward(request, response);
        }else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastrar-produtos.jsp");
            dispatcher.forward(request, response);
        }
        
        
        
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
