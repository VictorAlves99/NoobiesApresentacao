package br.NoobiesTestes.produto.web.Dao;

import br.NoobiesTestes.produto.web.Models.Produto;
import static br.NoobiesTestes.produto.web.db.utils.ConnectionUtils.obterConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void incluirProduto(Produto produto){
        {

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
    public void excluirProduto(){
        
    }
    public void editarProduto(){
        
    }
    public void consultarProduto(){
        
    }
}