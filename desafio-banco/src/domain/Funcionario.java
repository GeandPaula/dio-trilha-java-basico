package domain;

public class Funcionario {
    
    private String nome;
    private String funcional;
    private String agenciaAssociada;
    private String cargo;
    private String email;

    public Funcionario(String nome, String funcional, String agenciaAssociada,
     String cargo, String email) {
        this.nome = nome;
        this.funcional = funcional;
        this.agenciaAssociada = agenciaAssociada;
        this.cargo = cargo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public String getFuncional() {
        return funcional;
    }
    public String getAgenciaAssociada() {
        return agenciaAssociada;
    }
    public String getCargo() {
        return cargo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", funcional=" + funcional + ", agenciaAssociada=" + agenciaAssociada + ", cargo=" + cargo + ", email=" + email + '}';
    }

    
}
