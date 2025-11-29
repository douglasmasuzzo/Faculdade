package Exercicios;
import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM NOME: "); String nome = sc.nextLine();

        try{
            int status = Integer.parseInt( nome );
            System.out.println( status );
        } catch ( NumberFormatException e ){
            System.out.println("CONVERSÃO NÃO CONCEDIDA");
        }
    }
}
