package br.NoobiesTestes.produto.web.Dao;

import br.NoobiesTestes.produto.web.Models.Produto;
import static br.NoobiesTestes.produto.web.db.utils.ConnectionUtils.obterConexao;
import com.mysql.cj.jdbc.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {

    public static boolean incluirProduto(Produto produto){
        {
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
            stmt.setString(1, produto.getNomeProd());
            stmt.setString(2, produto.getDescProd());
            stmt.setDouble(3, produto.getValorCompra());
            stmt.setDouble(4, produto.getValorVenda());
            stmt.setInt(5, produto.getQuantidade());  
            stmt.setString(6, produto.getCategoria());         

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
    //incompleto
    public List<Produto> listarProdutos() throws SQLException, ClassNotFoundException{
        
        List<Produto> listaProdutos = new ArrayList<>();
        
        Statement stmt = null;
        Connection conn = null;
        ResultSet resultSet = null;
        //Preparar string sql
        String sql = "SELECT * FROM produtos";
        
        //Obten conexão para SQL workbench
        conn = obterConexao();

        stmt = conn.createStatement();
        resultSet = stmt.executeQuery(sql);

        while(resultSet.next()){
            resultSet.getInt("id");
            resultSet.getString("nome");
            resultSet.getDouble("valorCompra");
            resultSet.getDouble("valorVenda");
            resultSet.getInt("quantidade");

            Produto produto = new Produto();
            listaProdutos.add(produto);
        }

        resultSet.close();
        stmt.close();
        conn.close();

        return listaProdutos;
    }
            
    public static void excluirProduto(int id){
        {
        PreparedStatement stmt = null;
        Connection conn = null;
        //Preparar string sql
        String sql = "DELETE FROM DB_LOJA_NOOBIES.TB_PRODUTOS WHERE ID ="+id+"";//INSERIR VARIÁVEL COM ID
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);                  
            stmt.executeUpdate();
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
    }
    }
    public static void editarProduto(Produto produto){
        //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        //Preparar string sql
        String sql = "UPDATE DB_LOJA_NOOBIES.TB_PRODUTOS SET NOME_PRODUTO = ?, DESCRICAO = ?, VALOR_COMPRA = ?, VALOR_VENDA = ?, QUANTIDADE = ?"
                + "WHERE COD_PRODUTO = ";//INSERIR VARIÁVEL COM ID
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProd());
            stmt.setString(2, produto.getDescProd());
            stmt.setDouble(3, produto.getValorCompra());
            stmt.setDouble(4, produto.getValorVenda());
            stmt.setInt(5, produto.getQuantidade());           

            // 2) Executar SQL
            stmt.executeUpdate();
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
    }
    public static void consultarProduto(Produto produto){
                //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        //Preparar string sql
        String sql = "SELECT ";//INSERIR VARIÁVEL COM ID
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNomeProd());
            stmt.setString(2, produto.getDescProd());
            stmt.setDouble(3, produto.getValorCompra());
            stmt.setDouble(4, produto.getValorVenda());
            stmt.setInt(5, produto.getQuantidade());           

            // 2) Executar SQL
            stmt.executeUpdate();
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
    }
    
    
}
