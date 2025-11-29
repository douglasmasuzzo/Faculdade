package Exercicios; import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME A CONTAGEM DE VALORES: "); int X = sc.nextInt();
        int numero[] = new int[ X ];

        for ( int i = 0; i < numero.length; i++ ){
            System.out.println("INFORME UM VALOR: "); numero[ i ] = sc.nextInt();

            int positivos = 0;  int negativos = 0;

            if ( numero[ i ] < 0 ){
                 negativos++ ; System.out.println("VALORES NEGATIVOS: " + negativos );
            } else {
                positivos++ ; System.out.println("VALORES POSITIVOS: " + positivos );
            }
        }
        sc.close();
    }
}