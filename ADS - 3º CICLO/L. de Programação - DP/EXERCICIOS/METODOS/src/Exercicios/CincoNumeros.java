package Exercicios; import java.util.Scanner;

public class CincoNumeros{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in ); int quantidade;

        do{
            System.out.println("INFORME A QUANTIDADE DE VALORES: "); quantidade = sc.nextInt();
        } while ( quantidade < 2 || quantidade > 5 );

        System.out.println("INFORMANDO A MÉDIA");
        System.out.println("MÉDIA: " + CalcularMedia( quantidade ) );
    }

    public static double CalcularMedia( int quantidade ){
        double soma = 0;

        for ( int i = 1 ; i <= quantidade ; i++ ){
            System.out.println("VALOR: " + i );
            soma += quantidade;
        }

        return soma / quantidade;
    }
}