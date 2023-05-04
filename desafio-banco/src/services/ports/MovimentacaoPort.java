package services.ports;
import domain.Cliente;

public interface MovimentacaoPort {

    void depositar(double valor, Cliente cliente);
    void sacar(double valor, Cliente cliente);
    void transferir(double valor, Cliente clienteOrigem, Cliente clienteDestino);
    void exibirMovimentacoes(Cliente cliente);
    
}
