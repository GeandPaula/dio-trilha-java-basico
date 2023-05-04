import services.ports.*;
import services.*;
import domain.*;;

public class Main {
    public static void main(String[] args) {

        // Criando o banco:
        Banco banco = new Banco();
        // Cadastrando os clientes:
        CadastroClientePort cadastro = new CadastrarClienteService();
        cadastro.cadastrarCliente(banco, new PessoaFisica("99999999", "cliente1@email.com",
                new Endereco("rua cliente 1", "cidade cliente 1", "estado cliente1",
                        "pais cliente1", "numerocliente1", "complementocliente1",
                        "bairroCliente1", "cepCliente1"),
                new Conta("1", "11111", "22222", "0", "Corrente"),"Gean","111111111-00"));
        
                cadastro.cadastrarCliente(banco, new PessoaJuridica("99999999", "cliente2@email.com",
                new Endereco("rua cliente 2", "cidade cliente 2", "estado cliente2",
                        "pais cliente2", "numerocliente2", "complementocliente2",
                        "bairroCliente2", "cepCliente2"),
                new Conta("1", "222222", "333333", "1", "Poupanca"),"Gean","222222222-00"));

       //Listar todos os clientes:
       System.out.println("Lista de Clientes: ");
       System.out.println("------------------------------------------------");
       ListarDadosClientePort dados = new ListarDadosClienteService();
       dados.listarClientesBanco(banco);
       System.out.println("------------------------------------------------");

       //ListarContasBanco
       System.out.println("Lista de Contas: ");
       System.out.println("------------------------------------------------");
       dados.listarContasCliente(banco);
       System.out.println("------------------------------------------------");

       // Listar Cliente especifico 1:+
       System.out.println("Cliente selecionado: ");
       System.out.println("------------------------------------------------");
       Cliente cliente1 = dados.listarDadoCliente(banco, 1);
       System.out.println("------------------------------------------------");

       //Listar Conta especifico 2:
       System.out.println("Conta selecionada: ");
       System.out.println("------------------------------------------------");
       Cliente cliente2 = dados.listarDadoCliente(banco,2);
       System.out.println("------------------------------------------------");

       //Realizando Transacões:
       System.out.println("Realizando Transação: ");
       System.out.println("------------------------------------------------");
       MovimentacaoPort movimentacao = new MovimentacaoService();
       movimentacao.depositar(10000,cliente1);
       System.out.println("------------------------------------------------");

       //Verificando o saldo da conta do cliente selecionado:
       System.out.println("Saldo da conta do cliente selecionado: ");
       System.out.println("------------------------------------------------");
       System.out.println(cliente1.getConta().getSaldo());
       System.out.println("------------------------------------------------");

       //Realizar Transferencia de dinheiro entre o cliente 1 e o cliente 2:
       System.out.println("Realizando Transferencia de dinheiro entre o cliente 1 e o cliente 2: ");
       System.out.println("------------------------------------------------");
       movimentacao.transferir(3000, cliente1, cliente2);
       System.out.println("------------------------------------------------");

       //Verificando o saldo da conta do cliente2 selecionado após transferencia:
       System.out.println("Saldo da conta do cliente2 selecionado: ");
       System.out.println("------------------------------------------------");
       System.out.println(cliente2.getConta().getSaldo());
       System.out.println("------------------------------------------------");

       //Verificando o saldo da conta do cliente1 selecionado após transferencia:
       System.out.println("Saldo da conta do cliente1 selecionado: ");
       System.out.println("------------------------------------------------");
       System.out.println(cliente1.getConta().getSaldo());
       System.out.println("------------------------------------------------");


        //Demonstrando todas as transcoes realizadas pelo cliente 1:
        System.out.println("Todas as transcoes realizadas no banco: ");
        System.out.println("------------------------------------------------");
        movimentacao.exibirMovimentacoes(cliente1);
        System.out.println("------------------------------------------------");
    }

}
