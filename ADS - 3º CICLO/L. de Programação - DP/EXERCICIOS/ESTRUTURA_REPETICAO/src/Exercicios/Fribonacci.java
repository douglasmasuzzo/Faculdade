package Exercicios; import java.util.Scanner;

public class Fribonacci {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O NÚMERO DA SEQUÊNCIA: "); int numero = sc.nextInt();

        if ( numero <= 0 ) {
            System.out.println("VALOR NEGATIVO");
        } else {
            System.out.println("VALOR DA SEQUÊNCIA: " + numero ); int A = 0; int B = 1;

            for ( int i = 0; i < numero; i++ ){
                System.out.println("VALOR: " + A + " -> "); System.out.println("CÁLCULO: " + A + " + " + B + " = " + ( A + B  ) );
                int sequencia = ( A + B ); A = B; B = sequencia;
            }
        }
    }
}
