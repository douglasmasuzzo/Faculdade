package Exercicios;

public class Retornar{
    public static void main( String[] args ){
        System.out.println("RESULTADO: " + Verificar( -1 ) );
    }

    public static int Verificar( int numero ){
        int resultado = ( numero >= 0 ) ? 1 : 0 ;
        return resultado;
    }
}