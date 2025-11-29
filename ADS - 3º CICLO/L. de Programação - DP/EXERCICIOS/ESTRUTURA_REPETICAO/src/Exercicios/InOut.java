package Exercicios; import java.util.Scanner;

public class InOut {
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in ); int in = 0; int out = 0;

        System.out.println("INFORME A QUANTIDADE DE VALORES: "); int N = sc.nextInt();

        for ( int i = 0; i <= N ; i++ ){

            System.out.println("INFORME O VALOR DE X: "); int X = sc.nextInt();

            if ( X >= 10 && X <= 20 ) {
                in++;
            } else {
                out++;
            }

        }

        System.out.println("IN: " + in + " || OUT : " + out ); sc.close();
    }
}
