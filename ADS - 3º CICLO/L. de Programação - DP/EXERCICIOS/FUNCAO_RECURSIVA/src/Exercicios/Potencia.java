package Exercicios;
import java.util.Scanner;

public class Potencia{

    public static int CalcularPotencia( int X, int Y ) {
        if ( Y == 0 ){
            return 1;
        } else {
            return X * CalcularPotencia( X , Y - 1 );
        }
    }

    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME A BASE: "); int X = sc.nextInt();
        System.out.println("INFORME O EXPOENTE: "); int Y = sc.nextInt();
        System.out.print("---------------------------------\n");
        System.out.println("NÚMERO: " + X );
        System.out.println("RESULTADO: " + Potencia.CalcularPotencia( X , Y ) );
        sc.close();
    }
}
