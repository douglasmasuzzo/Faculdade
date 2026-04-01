import java.util.Scanner;

public class QUESTAO_03{

    public static double calcularSalario ( int quantCarros, double totalVendas, double salarioFixo, double comissaoCarro  ){
        double comissao_Fixa = quantCarros + comissaoCarro;
        double comissao_Vendas = totalVendas * 0.05;
        return salarioFixo + comissao_Fixa + comissao_Vendas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int quantCarros = scanner.nextInt();

        System.out.print("Digite o valor total de vendas: R$");
        double totalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite a comissão por carros vendidos: R$");
        double comissaoCarro = scanner.nextDouble();

        double salarioFinal = calcularSalario(quantCarros, totalVendas, salarioFixo, comissaoCarro);

        System.out.printf("\nO salário final do vendendor: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}