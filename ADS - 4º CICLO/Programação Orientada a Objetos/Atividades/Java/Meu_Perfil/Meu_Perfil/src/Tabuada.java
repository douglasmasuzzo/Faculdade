import java.util.Scanner;
public class Tabuada {
    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
            System.out.println("INFORME UM NÚMERO: ");
            Integer numero = sc.nextInt();

            for ( Integer i = 0; i <= 10; i++ ){
                Integer resultado =  numero * i;
                System.out.println("=======================================");
                System.out.println( numero + " X " + i + " = " + resultado );
            }
        sc.close();
    }
}
