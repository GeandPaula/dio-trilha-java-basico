package services.ports;
import domain.Banco;
import domain.Conta;

public interface CriacaoContaPort {
    
    public void criarConta(Banco banco, Conta conta);
}
