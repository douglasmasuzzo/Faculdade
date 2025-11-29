package Exercicios; import java.util.Scanner;

public class Comparacao {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int posicao = -1; int maior = 0;

        System.out.println("INFORME A QUANTIDADE DE VALORES: ");
        int X = sc.nextInt(); int comparar[] = new int[ X ];

        for( int i = 0; i < comparar.length; i++ ){
            System.out.println("INFORME UM VALOR: ");
            comparar[ i ] = sc.nextInt();

            if ( comparar[ i ] > maior ){
                maior = comparar[ i ]; posicao++;
            }
        }
        System.out.println("MAIOR VALOR: " + maior );
        System.out.println("POSIÇÃO: " + posicao ); sc.close();
    }
}
