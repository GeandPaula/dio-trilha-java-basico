package domain;

public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(String telefone, String email, Endereco endereco, Conta conta, String razaoSocial,
            String cnpj) {
        super(telefone, email, endereco, conta);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
