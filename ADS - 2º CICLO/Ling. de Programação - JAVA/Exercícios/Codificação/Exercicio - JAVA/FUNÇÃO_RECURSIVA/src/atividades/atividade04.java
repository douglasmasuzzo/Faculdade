package atividades;
import java.util.Scanner;

public class atividade04 {
    public static int calcularPotencia ( int X, int Y ) {
        if ( Y == 0 ) {
            return 1;
        }
        return X * calcularPotencia ( X, Y - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Selecione a Base: ");
        int X = sc.nextInt();
        System.out.print("Selecione o Expoente: ");
        int Y = sc.nextInt();
        int potencia = calcularPotencia( X, Y );

        System.out.print( X + " ^ " + Y + " = " + potencia );
    }
}