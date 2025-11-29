package Exercicios; import java.util.Scanner;

public class Multiplos {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.print("INFORME O 1º VALOR: "); int X = sc.nextInt();
        System.out.print("INFORME O 2º VALOR: "); int Y = sc.nextInt();

        if ( X % Y == 0 || Y % X == 0 ) {
            System.out.println("SÃO MÚLTIPLOS");
        } else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }
        sc.close();
    }
}
