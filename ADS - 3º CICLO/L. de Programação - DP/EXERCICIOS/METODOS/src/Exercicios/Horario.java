package Exercicios;

public class Horario {
    public static void main( String[] args ){
        double valor = 5657;

        System.out.println("SEGUNDOS: " + calcularSegundos( valor ) );
        System.out.println("MINUTOS: " + calcularMinutos( valor ) );
        System.out.println("HORAS: " + calcularHoras( valor ) );
    }

    public static double calcularSegundos( double segundo ){ return segundo % 60; }
    public static double calcularMinutos( double segundo ){ return ( segundo % 3600 ) / 60; }
    public static double calcularHoras( double segundo ){ return segundo / 3600; }
}
