package Exercicios;
import java.util.Scanner;

public class Divisao{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM VALOR: "); int X = sc.nextInt();
        System.out.println("INFORME OUTRO VALOR: "); int Y = sc.nextInt();

        try{
           if ( Y == 0 ) {
               System.out.println("ERRO, TENTE NOVAMENTE");
           }
           int resultado = X / Y; System.out.println( resultado );
        } catch ( ArithmeticException e )  {
            System.out.println("VALOR NÃO DIVISÍVEL " + e.getMessage() );
        }
    }
}