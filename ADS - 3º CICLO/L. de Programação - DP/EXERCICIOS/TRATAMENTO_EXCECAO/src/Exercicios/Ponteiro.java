package Exercicios;

public class Ponteiro{
    public static void main( String[] args ) {
        String situacao = null;
        try {
            System.out.println("SITUAÇÃO: " + situacao.length() );
        } catch (NullPointerException e) {
            System.out.println("VARIÁVEL SEM VALOR");
            System.out.println( e.getMessage() );
        }
    }
}