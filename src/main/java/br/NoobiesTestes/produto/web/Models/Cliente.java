package br.NoobiesTestes.produto.web.Models;

/**
 *
 * @author gabriela.vsmarques
 */
public class Cliente {
    private int codCliente;
    private String nomeCliente;
    private String cpfCliente;
    private int telefoneCliente;
    private String enderecoCliente;
    private String emailCliente;
    
    
    public Cliente(String nomeCliente,String cpfCliente,int telefoneCliente,String enderecoCliente,String emailCliente){
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
        this.emailCliente = emailCliente;  
    }

    public Cliente(int codCliente, String nomeCliente,String cpfCliente,int telefoneCliente,String enderecoCliente,String emailCliente){
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
        this.emailCliente = emailCliente;  
    }

    public Cliente() {
     
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    

}
