package Exercicios;
import java.util.Scanner;
//import java.math.*;

public class Circulo{
    public static void main( String[] args ){
        Scanner sc = new Scanner ( System.in );

        System.out.println("INFORME O VALOR DO RAIO: "); double raio = sc.nextDouble();
        double pi = 3.14159; double area = pi * ( raio * raio );
        System.out.println("--------------------");
        System.out.println("RAIO: " + raio ); System.out.printf("ÁREA: %.4f", area );
    }
}