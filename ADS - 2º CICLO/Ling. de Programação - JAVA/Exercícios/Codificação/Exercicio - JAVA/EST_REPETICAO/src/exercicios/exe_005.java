package exercicios;

import java.util.Scanner;

public class exe_005 {
    public static void main(String[] args){
        Scanner fatoracao = new Scanner (System.in);

        System.out.print("Digite um número: ");
            int number = fatoracao.nextInt();

        if ( number < 0 ) {
            System.out.print("Não existe fatoração com números negativos.");
        } else {
            long fatorar = 1;
                for ( int i = 1; i <= number; i++ ) {
                    fatorar += i;
                    System.out.print(i);
                        if ( i >= 1 ) {
                            System.out.print(" x ");
                        }
                }

            System.out.print("= " + fatorar);
        }

        fatoracao.close();
    }
}
