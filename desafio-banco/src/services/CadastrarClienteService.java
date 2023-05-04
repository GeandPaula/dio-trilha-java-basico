package services;

import domain.Banco;
import domain.Cliente;
import services.ports.CadastroClientePort;

public class CadastrarClienteService implements CadastroClientePort {

    @Override
    public void cadastrarCliente(Banco banco, Cliente cliente) {
        banco.getClientes().add(cliente);
    }
}
