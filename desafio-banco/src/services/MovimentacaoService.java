package services;

import domain.Cliente;
import domain.Movimentacao;
import domain.enums.TipoMovimentacaoEnum;
import services.ports.MovimentacaoPort;

public class MovimentacaoService implements MovimentacaoPort {

    private void adicionarMovimentacao(Cliente cliente, Movimentacao movimentacao) {
        cliente.getConta().getMovimentacao().add(movimentacao);
    }

    @Override
    public void depositar(double valor, Cliente cliente) {
        adicionarMovimentacao(cliente, new Movimentacao(
                "Deposito de um valor de " + valor + " Reais.", TipoMovimentacaoEnum.ENTRADA));
        cliente.getConta().setSaldo(cliente.getConta().getSaldo() + valor);
        System.out.println("Deposito de " + valor + " Reais realizado com sucesso.");
    }

    @Override
    public void sacar(double valor, Cliente cliente) {
        adicionarMovimentacao(cliente, new Movimentacao(
                "Saque no valor de " + valor + " Reais.", TipoMovimentacaoEnum.SAIDA));
        cliente.getConta().setSaldo(cliente.getConta().getSaldo() - valor);
        System.out.println("Saque de " + valor + " Reais realizado com sucesso.");
    }

    @Override
    public void transferir(double valor, Cliente clienteOrigem, Cliente clienteDestino) {
        clienteOrigem.getConta().setSaldo(clienteOrigem.getConta().getSaldo() - valor);
        clienteDestino.getConta().setSaldo(clienteDestino.getConta().getSaldo() + valor);
        adicionarMovimentacao(clienteOrigem, new Movimentacao(
                "Transferencia de um valor de " + valor + " Reais.", TipoMovimentacaoEnum.SAIDA));
        adicionarMovimentacao(clienteDestino, new Movimentacao(
                "Recebimento de um valor de " + valor + " Reais.", TipoMovimentacaoEnum.ENTRADA));
        System.out.println("Transferencia de " + valor + " Reais realizada com sucesso.");
    }

    @Override
    public void exibirMovimentacoes(Cliente cliente) {
        for(Movimentacao m: cliente.getConta().getMovimentacao())
            System.out.println(m);
    }

}
