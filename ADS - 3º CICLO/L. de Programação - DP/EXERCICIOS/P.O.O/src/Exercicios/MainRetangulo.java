package Exercicios;
import java.util.Scanner;

public class MainRetangulo {
    public static void main( String[] args ){
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME O VALOR DA ALTURA: "); retangulo.altura = sc.nextDouble();
        System.out.println("INFORME O VALOR DA LARGURA: "); retangulo.largura = sc.nextDouble();

        System.out.println("---------------");
        System.out.println("ÁREA: " + retangulo.CalcularArea( retangulo.altura , retangulo.largura ) + " m²");
        System.out.printf("PERÍMETRO: %.1f\n" , retangulo.CalcularPerimetro( retangulo.altura , retangulo.largura ) , " cm");
        System.out.printf("DIAGONAL: %.2f\n" , retangulo.CalcularDiagonal( retangulo.altura , retangulo.largura ) , " cm");

    }
}
