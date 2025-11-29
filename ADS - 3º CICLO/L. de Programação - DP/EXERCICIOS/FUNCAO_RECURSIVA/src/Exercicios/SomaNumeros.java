package Exercicios;
import java.util.Scanner;

public class SomaNumeros {

    public static int CalcularSoma( int X ){
        if ( X == 0 ){
            return 0;
        } else {
            return X + CalcularSoma( X - 1 );
        }
    }

    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM VALOR: "); int X = sc.nextInt();
        System.out.println("------------------------");
        System.out.println("NÚMERO: " + X );
        System.out.println("SOMA DOS NÚMEROS: " + CalcularSoma( X ) );
        sc.close();
    }
}
