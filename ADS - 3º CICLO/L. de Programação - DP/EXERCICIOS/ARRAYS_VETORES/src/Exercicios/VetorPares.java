package Exercicios; import java.util.Scanner;

public class VetorPares {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int par = 0; int impar = 0;

        System.out.println("DEFINA A QUANTIDADE DE VALORES: ");
        int X = sc.nextInt(); int numeros[] = new int[ X ];

        for ( int i = 0; i < numeros.length; i++ ){
            System.out.println("INFORME UM VALOR: ");
            numeros[ i ] = sc.nextInt();

            if ( numeros[ i ] % 2 == 0 ){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("NÚMEROS PARES: " + par );
        System.out.println("NÚMEROS ÍMPARES: " + impar ); sc.close();
    }
}
