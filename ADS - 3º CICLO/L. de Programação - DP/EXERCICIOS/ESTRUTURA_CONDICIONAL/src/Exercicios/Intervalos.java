package Exercicios; import java.util.Scanner;

public class Intervalos {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME UM VALOR: "); double valor = sc.nextDouble();

        if ( valor < 0.0 ) {
            System.out.println("VALOR NEGATIVO");
        } else if (valor < 25.00 ) {
            System.out.println("VALOR: " + valor + " || " + "INTERVALO: [ 0.0 || 25.00 ] ");
        } else if (valor < 50.00 ) {
            System.out.println("VALOR: " + valor + " || " + "INTERVALO: [ 25.00 || 50.00 ] ");
        } else if (valor < 75.00 ) {
            System.out.println("VALOR: " + valor + " || " + "INTERVALO: [ 50.00 || 75.00 ] ");
        } else if ( valor < 100.00 ) {
            System.out.println("VALOR: " + valor + " || " + "INTERVALO: [ 75.00 || 100.00 ] ");
        } else {
            System.out.println("INTERVALO NÃO DEFINIDO");
        } sc.close();
    }
}
