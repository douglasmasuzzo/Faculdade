package Exercicios;
import java.util.Scanner;

public class Soma{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM VALOR: "); int A = sc.nextInt();
        System.out.println("INFORME OUTRO VALOR: "); int B = sc.nextInt();
        int soma = A + B;

        System.out.println("------------------------------");
        System.out.println("1º VALOR: " + A ); System.out.println("2º VALOR: " + B );
        System.out.print("SOMA: " + soma );
    }
}