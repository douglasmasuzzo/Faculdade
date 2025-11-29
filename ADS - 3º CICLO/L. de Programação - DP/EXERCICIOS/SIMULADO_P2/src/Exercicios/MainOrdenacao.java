package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class MainOrdenacao {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        Ordenacao ord = new Ordenacao();
        ArrayList< Integer > list = new ArrayList<>();

        System.out.println("INFORME UM VALOR NÚMERICO: ");
        while( true ){
            int X = sc.nextInt();
            if ( X == 0 ){ break; }
            list.add( X );
        }

        boolean ordenacao = ord.Ordenacao( list );
        ord.ImprimirOrdenacao( ordenacao );
    }
}
