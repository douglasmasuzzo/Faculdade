package Getters_Setters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Circulo ex = new Circulo();

        System.out.print("Informe o Raio da Circunferencia: ");
        double raio = sc.nextDouble();
        ex.setRaio( raio );

        System.out.printf("Cálculo da Área: %.2f\n", ex.CalcularArea());
        sc.close();
    }
}
