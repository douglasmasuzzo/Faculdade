package exercicios;

import java.util.Scanner;

public class exe_003 {
    public static void main(String[] args){
        Scanner impar = new Scanner (System.in);

        System.out.print("Digite um número: ");
            int numero = impar.nextInt();

        for ( int i = 1; i <= numero; i++ ) {
            if ( i % 2 != 0 ) {
                System.out.println(i);
            }
        }
        impar.close();
    }
}
