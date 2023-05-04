package domain;

public class Cliente {

    private static int numeroCliente = 0;
    private int idCliente = 0;
    private String telefone;
    private String email;
    private Endereco endereco;
    private Conta conta;

    public Cliente(String telefone, String email,Endereco endereco, Conta conta) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.conta = conta;
        numeroCliente++;
        idCliente = numeroCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco + '\'' +
                ", conta=" + conta + '\'' +
                '}';
    }

}
