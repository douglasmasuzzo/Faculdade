package com.exemplo;
import java.util.Scanner;

public class mediaCalculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[5];
        int soma = 0;
        double media = 0;
        System.out.print("Digite 5 números inteiros: ");

        for ( int i = 0; i < numeros.length; i++ ) {
            System.out.println("Número " + ( i + 1 ) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        media = (double) soma / numeros.length;
        System.out.println("A média é: " + media );
        sc.close();
    }
}
