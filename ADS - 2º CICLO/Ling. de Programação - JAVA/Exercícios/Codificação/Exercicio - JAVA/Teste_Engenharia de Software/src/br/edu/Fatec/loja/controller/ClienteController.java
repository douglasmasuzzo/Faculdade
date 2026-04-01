package br.edu.Fatec.loja.controller;
import br.edu.Fatec.loja.model.Cliente;
import java.util.List;
import java.util.ArrayList;


public class ClienteController {
    private List <Cliente> clientes = new ArrayList<>();

    public boolean setClientes( String nome, String genero, String classe, int idade ){
        Cliente c = new Cliente( nome, genero, classe,   idade );
        clientes.add( c );
        return true;
    }

    public String getCliente( int quantidades ){
        return clientes.get( quantidades ).toString();
    }
}

