package Exercicios; import java.math.*;

public class Somar{
    public static void main( String[] args ){
        System.out.println("RESULTADO: " + VerificarSoma( 1 , 5 ) );
    }

    public static int VerificarSoma( int A , int B ){

        int X = Math.min( A, B ); int Y = Math.max( A, B ); int soma = 0; String ordem = "";

        for ( int i = X + 1 ; i < Y ; i++ ){
            soma = soma + i;  ordem += i + ( i < Y - 1 ? " + " : "" );
        }

        System.out.println("NÚMEROS: " + ordem + " || SOMA = " + soma ); return soma;
    }
}