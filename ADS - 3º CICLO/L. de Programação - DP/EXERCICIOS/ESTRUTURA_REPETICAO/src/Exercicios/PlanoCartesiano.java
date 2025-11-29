package Exercicios; import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;

        System.out.println("DEFININDO COORDENADAS");

        while ( true ) {

            System.out.println("INFORME O VALOR DO EIXO X: ");
            X = sc.nextInt();
            System.out.println("INFORME O VALOR DO EIXO Y: ");
            Y = sc.nextInt();

            if ( X == 0 || Y == 0 ){
                break;
            } else if (X > 0 && Y > 0) {
                System.out.println("PLANO CARTESIANO: 1º QUADRANTE ");
            } else if (X < 0 && Y > 0) {
                System.out.println("PLANO CARTESIANO: 2º QUADRANTE ");
            } else if (X < 0 && Y < 0) {
                System.out.println("PLANO CARTESIANO: 3º QUADRANTE ");
            } else {
                System.out.println("PLANO CARTESIANO: 4º QUADRANTE ");
            }
        }

        sc.close();
    }
}