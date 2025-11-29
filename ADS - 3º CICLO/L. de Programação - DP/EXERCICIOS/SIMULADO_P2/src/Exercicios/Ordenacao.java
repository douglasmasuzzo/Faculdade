package Exercicios;
import java.util.ArrayList;

public class Ordenacao{

    public Ordenacao(){}

    public boolean Ordenacao( ArrayList<Integer> lista ){
        for ( int i = 0; i < lista.size() - 1; i++ ) {
            if ( lista.get(i) > lista.get(i + 1) ) { return false; }
        }
        return true;
    }

    public void ImprimirOrdenacao( boolean ordenacao ){
        if ( ordenacao ){ System.out.println("A LISTA ESTÁ ORDENADA ");
        } else { System.out.println("A LISTA NÃO ESTÁ ORDENADA"); }
    }
}