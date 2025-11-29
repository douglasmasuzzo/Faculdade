package Exercicios;

public class Indice {
    public static void main( String[] args ){

        int vetor[] = { 1, 3, 5, 7, 9 };

        try{
            System.out.print( vetor[ 5 ] );
        } catch ( ArrayIndexOutOfBoundsException e ){
            System.out.println("ELEMENTO FORA DO ÍNDICE. TENTE NOVAMENTE ");
            System.out.println( e.getMessage() );
        }
    }
}
