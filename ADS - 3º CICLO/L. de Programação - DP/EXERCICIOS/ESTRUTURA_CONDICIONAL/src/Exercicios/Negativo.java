package Exercicios; import java.util.Scanner;

public class Negativo{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.print("INFORME UM VALOR: \n"); int X = sc.nextInt();
        System.out.print("VALOR: " + X + "\n" );
        System.out.print("STATUS: " + (( X > 0 ) ? "POSITIVO " : "NEGATIVO " ) );
        sc.close();
    }
}