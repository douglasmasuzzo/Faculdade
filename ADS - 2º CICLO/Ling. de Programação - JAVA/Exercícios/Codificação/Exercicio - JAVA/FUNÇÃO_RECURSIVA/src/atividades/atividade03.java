package atividades;
import java.util.Scanner;

public class atividade03 {

    public static int sequenciaFibonnaci ( int number ) {
        if ( number <= 1 ) {
            return number;
        } else {
            return sequenciaFibonnaci(number - 1) + sequenciaFibonnaci(number - 2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o número do termo n-ésimo: ");
        int number = sc.nextInt();
        int resultado = sequenciaFibonnaci( number );

        System.out.print(" O " + number + "º termo da sequência de Fibonnaci é " + resultado);
        sc.close();
    }
}