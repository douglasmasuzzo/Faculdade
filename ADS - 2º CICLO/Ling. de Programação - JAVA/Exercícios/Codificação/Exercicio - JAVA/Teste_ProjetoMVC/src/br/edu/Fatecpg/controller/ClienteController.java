package br.edu.Fatecpg.controller;
import br.edu.Fatecpg.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List <Cliente> clientes = new ArrayList<>();

    public boolean setClientes ( String nome, double credito ){
        Cliente cliente = new Cliente( nome , credito );
        clientes.add( cliente );
        return true;
    }

    public String getCliente( int quant ) {
        return clientes.get( quant ).toString();
    }


}
