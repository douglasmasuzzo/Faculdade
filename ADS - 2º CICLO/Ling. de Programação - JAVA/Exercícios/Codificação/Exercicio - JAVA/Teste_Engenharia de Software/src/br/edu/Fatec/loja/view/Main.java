package br.edu.Fatec.loja.view;
import br.edu.Fatec.loja.controller.ClienteController;

public class Main {
    public static void main(String[] args){
        ClienteController cc = new ClienteController();

        cc.setClientes("ASTRA", "MULHER", "CONTROLADORA", 20);
        cc.setClientes("JETT", "MULHER", "DUELISTA", 22);
        cc.setClientes("RAZE", "MULHER", "DUELISTA",  24);
        cc.setClientes("ISO", "HOMEM", "DUELISTA", 24);
        cc.setClientes("BREACH", "HOMEM", "INICIADOR", 30);
        cc.setClientes("BRIMSTONE", "HOMEM", "CONTROLADOR", 35);
        cc.setClientes("TEJO", "HOMEM", "INICIADOR", 33);
        cc.setClientes("DEADLOCK", "MULHER", "SENTINELA", 26);
        cc.setClientes("OMEM", "UNDEFINED", "CONTROLADOR", 30);
        cc.setClientes("FADE", "MULHER", "INICIADOR", 29);
        cc.setClientes("CHAMBER", "HOMEM", "SENTINELA", 31);
        cc.setClientes("VYSE", "UNDEFINED", "SENTINELA", 32 );

        System.out.println( cc.getCliente(9));
    }
}
