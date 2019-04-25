package br.NoobiesTestes.produto.web.Servlets;

import br.NoobiesTestes.produto.web.Dao.ClienteDAO;
import br.NoobiesTestes.produto.web.Models.Cliente;

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
@WebServlet(name = "ClienteServlet", urlPatterns = {"/CadastrarCliente"})
public class CadastrarClienteServlet extends HttpServlet {

    protected void processRequest(String metodoHttp, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente c = new Cliente();

        c.setNomeCliente(request.getParameter("nome"));
        c.setCpfCliente(request.getParameter("cpf"));
        c.setTelefoneCliente(Integer.parseInt(request.getParameter("telefone")));
        c.setEnderecoCliente(request.getParameter("endereco"));
        c.setEmailCliente(request.getParameter("email"));

        boolean retorno = ClienteDAO.incluirCliente(c);
        if (retorno) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/consultar-clientes.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastrar-cliente.jsp");
            dispatcher.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest("GET", request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest("POST", request, response);
    }

}
