import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        Random random = new Random();

        System.out.println("INFORME UM VALOR: ");
        Integer valor = sc.nextInt();

        Integer numero = random.nextInt( 10 );

        while( valor != numero ){
            if ( valor == numero ){
                System.out.println("VALOR IDENTIFICADO : " + valor );
            } else {
                System.out.println("VALOR NÃO IDENTIFICADO");
                valor = sc.nextInt();
            }
        }
        sc.close();
    }
}
