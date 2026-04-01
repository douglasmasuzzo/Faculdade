package atividades;
import java.util.Scanner;

public class atividade01 {

    public static int Fatorial ( int number ){
        if ( number <=1 ) {
            return number;
        } else {
            return number * Fatorial ( number - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidades de vezes que o Fatorial rodará: ");
        int number = sc.nextInt();
        System.out.print("Fatorial de " + number + " é: " + Fatorial ( number ) );

        sc.close();
    }
}

