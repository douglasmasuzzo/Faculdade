package Exercicios;
import java.util.Scanner;

public class Fatorial{

    public static int CalcularFatorial( int X ) {
        if ( X <= 1 ) {
            return 1;
        } else {
            return X * CalcularFatorial( X - 1 );
        }
    }

    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM NÚMERO: "); int X = sc.nextInt();
        System.out.println("----------------------");
        System.out.println("VALOR INFORMADO: " + X );
        System.out.println("FATORIAL: " + CalcularFatorial( X ) );
        sc.close();
    }
}