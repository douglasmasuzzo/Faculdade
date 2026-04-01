package exercicios;

import java.util.Scanner;

public class exe_004 {
    public static void main(String[] args){
        Scanner in_Out = new Scanner(System.in);

        System.out.print("Selecione o(s) valor(es) desejado(s): ");
            int valorN = in_Out.nextInt();
            int in = 0; int out = 0;

        for ( int i = 0; i < valorN; i++ ){
            System.out.print("Digite os valores lidos por X: ");
            int x = in_Out.nextInt();

            if ( x >= 10 && x <= 20 ) {
                in ++ ;
            } else {
                out ++;
            }
        }
            System.out.print(in + " in " + " || " + out + " out ");
            in_Out.close();
    }
}
