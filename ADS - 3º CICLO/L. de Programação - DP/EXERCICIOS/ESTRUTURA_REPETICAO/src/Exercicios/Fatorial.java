package Exercicios; import java.util.Scanner;

public class Fatorial{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.println("INFORME O VALOR DO FATORIAL: "); int numero = sc.nextInt();

        if ( numero < 0 ){
            System.out.println("VALOR NEGATIVO");
        } else {

            long fatoracao =  1;
            for ( int i = 1 ; i <= numero; i++ ){
                fatoracao *= i; System.out.print( i );

                if ( i >= 1 ) { System.out.println( "x" ); }
            }

            System.out.println(" = " + fatoracao );
        }
        sc.close();
    }
}