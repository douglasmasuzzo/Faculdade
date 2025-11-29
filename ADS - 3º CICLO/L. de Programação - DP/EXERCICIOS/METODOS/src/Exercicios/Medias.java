package Exercicios; import java.util.Scanner;

public class Medias{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("INFORME A 1º NOTA: "); double N1 = sc.nextDouble();
        System.out.println("INFORME A 2º NOTA: "); double N2 = sc.nextDouble();
        System.out.println("INFORME A 3º NOTA: "); double N3 = sc.nextDouble();
        System.out.println("SELECIONE A OPERAÇÃO DA MÉDIA: [ A ] - ARITMÉTICA || [ P ] - PONDERADA ");
        String letra = sc.next();

        if ( letra.equals("A") ){
            System.out.println("MÉDIA ARITMÉTICA: " + MediaAritmetica( N1, N2, N3, letra ) );
        } else if ( letra.equals("P") ){
            System.out.println("MÉDIA PONDERADA: " + MediaPonderada( N1, N2, N3, letra ) );
        } else {
            System.out.println("OPÇÃO INVÁLIDA");
        }

    }

    public static double MediaAritmetica( double nota1, double nota2, double nota3, String tipo ) {

        if ( tipo.equals("A") ){
            return ( nota1 + nota2 + nota3 ) / 3;
        }
        return 0;
    }

    public static double MediaPonderada( double prova1, double prova2, double prova3, String tipo ){

        if ( tipo.equals("P") ){
            return ( ( prova1 * 5 ) + ( prova2 * 3 ) + ( prova3 * 2 ) / ( 5 + 3 + 2 ) );
        }
        return 0;
    }
}