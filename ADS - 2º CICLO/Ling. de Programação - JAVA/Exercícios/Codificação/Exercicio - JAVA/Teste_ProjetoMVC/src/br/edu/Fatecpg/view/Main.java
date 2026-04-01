package br.edu.Fatecpg.view;
import br.edu.Fatecpg.controller.ClienteController;

public class Main{
    public static void main(String[] args) {
        ClienteController CC = new ClienteController();

        CC.setClientes( "MIGUEL", 1750);
        CC.setClientes("KRIEGER", 3500);
        CC.setClientes("LOIRINHA DO CHAN", 2500);

        System.out.println(CC.getCliente(1));
    }
}