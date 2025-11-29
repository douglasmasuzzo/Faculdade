package Exercicios; import java.util.Scanner;

public class Fatorial {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O NÚMERO DO FATORIAL: "); int numero = sc.nextInt();
        System.out.println("NÚMERO: " + numero ); System.out.println("FATORIAL: " + fatorial( numero ) );
    }

    public static int fatorial( int X ){
        if ( X <= 1 ) { return 1; } else { return X * fatorial( X - 1 ); }
    }
}
