package prova.salario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 8;
        int B = A + 10;
        int C = B + 10;

        System.out.println("INFORME O VALOR DO SALÁRIO: ");
        double salario = sc.nextDouble();

        if (salario > 0.00 && salario <= 2000.00) {
            System.out.print("INSENTO");
        } else if (salario > 2000.01 && salario <= 3000.00) {
            System.out.println("RENDA: " + salario);
            System.out.println("IMPOSTO DE RENDA: " + A + "%");
        } else if (salario > 3000.00 && salario <= 4500.00) {
            System.out.println("RENDA: " + salario);
            System.out.println("IMPOSTO DE RENDA: " + B + "%");
        } else {
            System.out.println("RENDA: " + salario);
            System.out.println("IMPOSTO DE RENDA: " + C + "%");
        }
    }
}

