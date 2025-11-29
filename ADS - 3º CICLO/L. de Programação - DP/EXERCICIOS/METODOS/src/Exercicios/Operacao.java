package Exercicios; import java.util.Scanner;

public class Operacao{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("-------------------------");
        System.out.println("MENU - OPERAÇÕES ");
        System.out.println(" [ 1 ] - SOMAR ");
        System.out.println(" [ 2 ] - SUBTRAIR ");
        System.out.println(" [ 3 ] - MULTIPLICAR ");
        System.out.println(" [ 4 ] - DIVIDIR ");
        System.out.println("SELECIONE UMA OPERAÇÃO");
        int operacao = sc.nextInt();

        switch( operacao ){

            case 1 :
                System.out.println("SOMA: " + somar( 5, 10 ) ); break;

            case 2 :
                System.out.println("SUBTRAÇÃO: " + subtrair( 5, 10 ) ); break;

            case 3 :
                System.out.println("MULTIPLICAÇÃO: " + multiplicar( 5, 10 ) ); break;

            case 4 :
                System.out.println("DIVISÃO: " + dividir( 5, 10 ) ); break;

            default :
                System.out.println("ESCOLHA INVÁLIDA"); break;
        }

        sc.close();
    }

    public static int somar( int A , int B ){ return A + B; }
    public static int subtrair( int A, int B){ return A - B; }
    public static int multiplicar( int A, int B ){ return A * B; }
    public static double dividir( int A , int B ) { return ( double ) A / B; }

}