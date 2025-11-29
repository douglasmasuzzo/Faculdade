package Exercicios; import java.util.Scanner;

public class Media{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        double soma = 0; double media = 0.0;

        System.out.println("DEFINA OS VALORES DIGITADOS:  "); int X = sc.nextInt();
        double valores[] = new double[ X ];

        for ( int i = 0; i < valores.length; i++ ){
            System.out.println("DIGITE UM VALOR: " );
            valores[ i ] = sc.nextDouble();

            if ( valores[ i ] > 0.0 ){
                soma += valores[ i ];
                media = soma / X;
            } else {
                System.out.println("NENHUM VALOR FOI INFORMADO");
            }
        }
        System.out.println("SOMA: " + soma );
        System.out.printf("MÉDIA: %.1f", media ); sc.close();
    }
}