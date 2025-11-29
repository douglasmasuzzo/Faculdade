package Exercicios;
import java.util.Scanner;

public class Diferenca{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("INFORME O 1º VALOR: "); int A = sc.nextInt();
        System.out.println("INFORME O 2º VALOR: "); int B = sc.nextInt();
        System.out.println("INFORME O 3º VALOR: "); int C = sc.nextInt();
        System.out.println("INFORME O 4º VALOR: "); int D = sc.nextInt();
        int diferenca = ( ( A * B ) - ( C * D ) );

        System.out.println("------------------------------");
        System.out.println("1º VALOR: " + A ); System.out.println("2º VALOR: " + B );
        System.out.println("3º VALOR: " + C ); System.out.println("4º VALOR: " + D );
        System.out.println("DIFERENÇA: " + diferenca );
    }
}