import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cotacao = new Scanner(System.in);

        System.out.print("Digite o valor selecionado: ");
        double valor = cotacao.nextDouble();
        double euro = valor * 6.50;

        System.out.printf("O valor do produto selecionado é: £%.2f = R$%.2f", euro, valor);
    }
}
