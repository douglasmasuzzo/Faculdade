import java.util.Scanner;

public class exePratica01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        double euro = valor * 6.40;

        System.out.printf("Valor em Euros: £%.2f = R$%.2f%n", euro, valor);
    }
}
