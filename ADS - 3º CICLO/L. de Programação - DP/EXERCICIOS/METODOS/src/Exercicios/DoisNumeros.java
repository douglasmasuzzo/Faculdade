package Exercicios; import java.util.Scanner;

public class DoisNumeros{
    public static void main( String[] args ) {

        System.out.println("INFORMANDO A MÉDIA DE NOTAS: ");
        System.out.println("MÉDIA FINAL: " + SomarMedia( 10.0 , 7.5 ) );
    }

    public static double SomarMedia( double A, double B ){
        double media; media = ( A + B ) / 2;
        System.out.println("1º NOTA: " + A ); System.out.println("2º NOTA: " + B );
        return media;
    }
}