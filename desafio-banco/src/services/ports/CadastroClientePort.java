package services.ports;
import domain.Cliente;
import domain.Banco;
public interface CadastroClientePort {

    void cadastrarCliente(Banco banco,Cliente cliente);
    
}
