import java.util.Scanner;

public class QUESTA0_01 {
    public static void main(String[] args){
        Scanner cotacao = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double dolar = cotacao.nextFloat();
        double real = dolar * 5.15;

        System.out.printf("Valor da Cotação: $%.2f = R$%.2f%n", dolar, real);

        cotacao.close();
    }
}
