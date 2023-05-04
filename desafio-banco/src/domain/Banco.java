package domain;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    private static final String NOME = "Banco DIO";
    private static final String CNPJ = "000000000000000";
    private Endereco endereco;
    private static final String NUMERO_BANCO = "111";
    private static List<Cliente> clientes;
    private static List<Funcionario> funcionarios;

    public Banco() {
        this.endereco = new Endereco("Rua 13", "Cidade 123",
                "Novo", "Brasil", "55", "Perto do patio",
                "Laranjeiras", "00000-000");
        clientes = new ArrayList<Cliente>();
        funcionarios = new ArrayList<>();
        adicionarElementosBanco();
    }

    public String getNome() {
        return NOME;
    }

    public String getCnpj() {
        return CNPJ;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNumeroBanco() {
        return NUMERO_BANCO;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarElementosBanco() {
        funcionarios.add(new Funcionario("Jose", "333333333", "2222", "Gerente", "jose@email.com"));
        funcionarios.add(new Funcionario("Maria", "44444444", "2221", "Gerente", "maria@email.com"));
    }

    @Override
    public String toString() {
        return String.format("========== Conta Bancária ==========%n" +
                "Endereco: %s%n%n" +
                "Clientes: %s%n%n" +
                "Funcionarios: %s%n%n" +
                "===================================%n", endereco, clientes, funcionarios);
    }
}
