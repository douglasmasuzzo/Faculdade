package atividade01;
import java.util.Scanner;

public class CalcularRetangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da ALTURA: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o valor da LARGURA: ");
        double largura = sc.nextDouble();

        Retangulo ret = new Retangulo(altura, largura);

        System.out.printf("ÁREA: %.2f m²%n", ret.area());
        System.out.printf("PERIMETRO: %.2f m%n", ret.perimetro());
        System.out.printf("DIAGONAL: %.2f m%n", ret.diagonal());

        sc.close();
    }
}
