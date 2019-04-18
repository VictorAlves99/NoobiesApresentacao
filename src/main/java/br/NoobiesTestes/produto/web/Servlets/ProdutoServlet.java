package br.NoobiesTestes.produto.web.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gabriela.vsmarques
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/produto"})
public class ProdutoServlet extends HttpServlet {

        protected void processRequest(String metodoHttp, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            // RECUPERA INFORMACOES DA REQUISICAO
            String nome = request.getParameter("nome");
            String descricao = request.getParameter("descricao");
            String valorVenda = request.getParameter("valorVenda");
            String valorCompra = request.getParameter("valorCompra");
            String quantidade = request.getParameter("quantidade");
            String categoria = request.getParameter("categoria");

            
             // VALIDAR DADOS
        boolean temErros = false;
        
        if (nome == null || nome.length() == 0) {
            temErros = true;
            request.setAttribute("erroNome", "Nome não preenchido");
        }
        if ( descricao == null || descricao.length() == 0) {
            temErros = true;
            request.setAttribute("erroCPF", "CPF não preenchido");
        }
        if (valorVenda == null || valorVenda.length() == 0) {
            temErros = true;
            request.setAttribute("erroEndereco", "Endereco não preenchido");
        }
        if (valorCompra == null || valorCompra.length() == 0) {
            temErros = true;
            request.setAttribute("erroTelefone", "Telefone não preenchido");
        }
        if (quantidade == null || quantidade.length() == 0) {
            temErros = true;
            request.setAttribute("erroEmail", "E-mail não preenchido");
        }
        if (categoria == null || categoria.length() == 0) {
            temErros = true;
            request.setAttribute("erroEmail", "E-mail não preenchido");
        }

        if (temErros) {
            // REAPRESENTA FORMULARIO INDICANDO OS ERROS
            RequestDispatcher dispatcher = request.getRequestDispatcher("formularioCliente.jsp");
            dispatcher.forward(request, response);
        }

        // ARMAZENANDO VALORES COMO ATRIBUTOS
        request.setAttribute("metodoHttp", metodoHttp);
        request.setAttribute("nome", nome);
        request.setAttribute("descricao", descricao);
        request.setAttribute("valorVenda", valorVenda);
        request.setAttribute("valorCompra", valorCompra);
        request.setAttribute("quantidade", quantidade);
        request.setAttribute("categoria", categoria);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/resultadoCliente.jsp");
        dispatcher.forward(request, response); 
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

