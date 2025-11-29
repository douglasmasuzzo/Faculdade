package Exercicios; import java.util.Scanner;

public class Horas{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int HoraTotal;

        System.out.print("INFORME A HORA INICIAL: "); float HoraInicial = sc.nextFloat();
        System.out.print("INFORME A HORA FINAL: "); float HoraFinal = sc.nextFloat();

        if ( HoraInicial < HoraFinal ) {
            HoraTotal = ( int ) ( HoraInicial - HoraFinal );
        } else {
            HoraTotal = ( int ) ( ( 24 - HoraInicial ) + HoraFinal );
        }

        System.out.println("------------------------");
        System.out.println("HORA INICIAL: " + HoraInicial + " a.m ");
        System.out.println("HORA FINAL: " + HoraFinal + " p.m ");
        System.out.print("DURAÇÃO: " + HoraTotal + " HORA( S )" );
        sc.close();
    }
}
