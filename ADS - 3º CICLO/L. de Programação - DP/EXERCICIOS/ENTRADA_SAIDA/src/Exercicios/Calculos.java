package Exercicios;
import java.util.Scanner;

public class Calculos{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O 1º VALOR: "); double A = sc.nextDouble();
        System.out.println("INFORME O 2º VALOR: "); double B = sc.nextDouble();
        System.out.println("INFORME O 3º VALOR: "); double C = sc.nextDouble();

        double pi = 3.14159; double AreaRetangulo = A * B;
        double AreaTriangulo = ( A * C ) / 2 ; double AreaCirculo = pi * ( C * C );
        double AreaTrapezio = ( ( A + B ) * C ) / 2; double AreaQuadrado = B * B;

        System.out.println("1º VALOR: " + A ); System.out.println("2º VALOR: " + B ); System.out.println("3º VALOR: " + C );
        System.out.println("---------------------------------------");
        System.out.printf("ÁREA DO TRIÂNGULO: %.3f\n", AreaTriangulo ); System.out.printf("ÁREA DO CÍRCULO: %.3f\n", AreaCirculo );
        System.out.println("ÁREA DO TRAPÉZIO: " + AreaTrapezio ); System.out.println("ÁREA DO QUADRADO: " + AreaQuadrado );
        System.out.println("ÁREA DO RETÂNGULO: " + AreaRetangulo );
        sc.close();
    }
}