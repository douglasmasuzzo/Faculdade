package Exercicios; import java.util.Scanner;

public class Eixos{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.print("INFORME O VALOR DE EIXO X: \n"); float X = sc.nextFloat();
        System.out.println("INFORME O VALOR DO EIXO Y: "); float Y = sc.nextFloat();

        if ( X == 0.0 && Y == 0.0 ) {
            System.out.println("EIXO X = " + X + " || " + "EIXO Y = " + Y );
            System.out.println("PLANO CARTERSIANO: ORIGEM");
        } else if ( X == 0 && Y != 0.0 ) {
            System.out.println("EIXO Y = " + X + " || " + " PLANO CARTESIANO: EIXO X ");
        } else if ( X != 0 && Y == 0 ){
            System.out.println("EIXO X = " + Y + " || " + " PLANO CARTESIANO: EIXO Y ");
        } else if ( X > 0.0 && Y > 0.0 ) {
            System.out.println("PLANO CARTESIANO: 1ª QUADRANTE");
        } else if ( X < 0.0 && Y > 0.0 ) {
            System.out.println("PLANO CARTESIANO: 2º QUADRANTE");
        } else if ( X < 0.0 && Y < 0.0 ) {
            System.out.println("PLANO CARTESIANO: 3º QUADRANTE");
        } else {
            System.out.println("PLANO CARTESIANO: 4º QUADRANTE");
        } sc.close();
    }
}