package services.ports;
import domain.*;

public interface ListarDadosClientePort {

    void listarContasCliente(Banco banco);
    void listarClientesBanco(Banco banco);
    Cliente listarDadoCliente(Banco banco,int idCliente);
    
}
