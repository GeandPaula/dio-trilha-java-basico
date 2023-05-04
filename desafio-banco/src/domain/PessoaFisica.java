package domain;

public class PessoaFisica extends Cliente {

    private String nome;
    private String cpf;

    public PessoaFisica(String telefone, String email, Endereco endereco, Conta conta, String nome, String cpf) {
        super(telefone, email, endereco, conta);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
