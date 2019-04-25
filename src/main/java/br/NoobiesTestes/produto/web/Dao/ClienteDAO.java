package br.NoobiesTestes.produto.web.Dao;

import br.NoobiesTestes.produto.web.Models.Cliente;
import static br.NoobiesTestes.produto.web.db.utils.ConnectionUtils.obterConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gabriela.vsmarques
 */
public class ClienteDAO {
    
    
     public static boolean incluirCliente(Cliente c){
        boolean retorno = false;
        int linhasAfetadas = 0;
        
        //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        //Preparar string sql
        String sql = "INSERT INTO produtos (nome, descricao, valorCompra, "
                + "valorVenda, quantidade, categoria)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getCpfCliente());
            stmt.setInt(3, c.getTelefoneCliente());
            stmt.setString(4, c.getEnderecoCliente());
            stmt.setString(5, c.getEmailCliente());       

            // 2) Executar SQL
            linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Não foi possível executar. SQL Exception");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Não foi possível executar. ClassNotFound EXception");
        } finally 
        {
            if (stmt != null) 
            {
                try 
                {
                    stmt.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro ao fechar stmt.");
                }
            }
            if (conn != null) 
            {
                try 
                {
                    conn.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro ao fechar conn.");
                }
            }
        }
        return retorno;
    }
    
     }

