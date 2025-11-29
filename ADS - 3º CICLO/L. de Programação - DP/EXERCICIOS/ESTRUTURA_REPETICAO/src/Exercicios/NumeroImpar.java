package Exercicios; import java.util.Scanner;

public class NumeroImpar {
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("INFORME UM NÚMERO: "); int numero = sc.nextInt();

        for ( int i = 0; i <= numero; i++ ){

            if ( i % 2 != 0 ) { System.out.println( i ); }
        }

        sc.close();
    }
}
