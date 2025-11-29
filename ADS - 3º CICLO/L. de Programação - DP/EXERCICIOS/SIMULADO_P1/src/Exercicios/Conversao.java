package Exercicios; import java.util.Scanner;

public class Conversao{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O VALOR EM DÓLAR ( $ ): "); double dolar = sc.nextDouble();

        double conversao = 5.15;
        double real = dolar * conversao;

        System.out.printf("DOLLAR ( $ ): %.2f\n", dolar );
        System.out.printf("REAL ( R$ ): %.2f\n", real );
        System.out.printf("CONVERSÃO: %.2f", conversao );
        sc.close();
    }
}