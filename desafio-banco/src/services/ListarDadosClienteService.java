package services;

import domain.Banco;
import domain.Cliente;
import services.ports.ListarDadosClientePort;

public class ListarDadosClienteService implements ListarDadosClientePort {

    @Override
    public void listarContasCliente(Banco banco) {
        for(Cliente c: banco.getClientes()){
            System.out.println(c.getConta());
        }
    }

    @Override
    public void listarClientesBanco(Banco banco) {
        for(Cliente c: banco.getClientes()){
            System.out.println(c);
            }
    }

    @Override
    public Cliente listarDadoCliente(Banco banco,int idCliente) {
        Cliente cliente  = banco.getClientes().get(idCliente-1);
        System.out.println(cliente);
        return cliente;
    }
}
