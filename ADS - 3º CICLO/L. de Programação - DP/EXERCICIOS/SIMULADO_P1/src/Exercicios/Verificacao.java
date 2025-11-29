package Exercicios; import java.util.Scanner;

public class Verificacao {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM NÚMERO:"); int numero = sc.nextInt();
        String status = ( numero > 0 ) ? "NÚMERO POSITIVO" : "NÚMERO NEGATIVO";
        System.out.println("RESULTADO: " + status );
    }
}