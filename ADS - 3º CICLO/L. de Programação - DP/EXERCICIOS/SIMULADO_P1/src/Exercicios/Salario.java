package Exercicios; import java.util.Scanner;

public class Salario{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O VALOR DO SALÁRIO: "); float salario = sc.nextFloat();

        if ( salario <= 645.00 ){
            System.out.println("RECEBE ATÉ: 1 SALÁRIO MÍNIMO");
        } else if ( salario <= 1935.00 ) {
            System.out.println("RECEBE ATÉ: 3 SALÁRIO(S) MÍNIMO");
        } else if ( salario <= 3225.00 ) {
            System.out.println("RECEBE ATÉ: 5 SALÁRIO(S) MÍNIMO");
        } else {
            System.out.println("RECEBE ATÉ: +5 SALÁRIO(S) MÍNIMO");
        }
        sc.close();
    }
}