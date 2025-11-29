package Exercicios; import java.util.Scanner;

public class RestoPar {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );

        System.out.print("INFORME O VALOR: \n"); int X = sc.nextInt();
        System.out.print("VALOR: " + X + "\n");
        System.out.print("STATUS: " + (( X % 2 == 0 ) ? "PAR" : "ÍMPAR" ) );
        sc.close();
    }
}
