package domain;

public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    public Endereco(String rua, String cidade, String estado, 
    String pais, String numero, String complemento, String bairro, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getEndereco() {
        return rua;
    }
    public void setEndereco(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", cidade=" + cidade +
         ", estado=" + estado + ", pais=" + pais + ", numero=" + 
         numero + ", complemento=" + complemento + ", bairro=" + 
         bairro + ", cep=" + cep + '}';
    }

}
