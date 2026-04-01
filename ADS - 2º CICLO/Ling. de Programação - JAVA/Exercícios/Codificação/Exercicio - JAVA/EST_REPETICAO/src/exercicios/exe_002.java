package exercicios;

import java.util.Scanner;

public class exe_002 {
    public static void main(String[] args){
        Scanner plano = new Scanner (System.in);
        boolean continuar = true;

        while ( continuar ) {
            System.out.print("Digite a coordenada X : ");
            int X = plano.nextInt();
            System.out.print("Digite a coordenada Y: ");
            int Y = plano.nextInt();

            if ( X == 0 || Y == 0 ) {
                continuar = false;
            } else if ( X > 0 && Y > 0) {
                System.out.println("Primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
        }
            plano.close();
    }
}
