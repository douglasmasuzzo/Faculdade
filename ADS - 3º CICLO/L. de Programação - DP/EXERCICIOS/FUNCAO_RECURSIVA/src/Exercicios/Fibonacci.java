package Exercicios;
import java.util.Scanner;

public class Fibonacci {

    public static int CalcularFibonacci( int X ){

        for ( int i = 0; i <= X; i++ ){
            if ( X <= 1 ){
                return 1;
            } else {
                return X * CalcularFibonacci( X - 1 );
            }
        }
        return CalcularFibonacci( X );
    }

    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM NÚMERO: "); int X = sc.nextInt();
        System.out.print("-----------------------\n");
        System.out.println("NÚMERO : " + X );
        System.out.println("FIBONACCI: " + Fibonacci.CalcularFibonacci( X ) );
        sc.close();
    }
}
