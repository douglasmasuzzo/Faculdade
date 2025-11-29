package Exercicios; import java.util.Scanner;

public class Comissao{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("INFORME A QUANTIDADE DE CARROS VENDIDOS: "); int quantidade = sc.nextInt();
        System.out.println("INFORME O VALOR TOTAL DE VENDAS: "); double valorVendas = sc.nextDouble();
        System.out.println("INFORME O VALOR DO SALÁRIO FIXO: "); double salarioFixo = sc.nextDouble();
        double comissao = 500.00;

        System.out.printf("SALÁRIO FINAL: %.4f", calcularSalarioFinal( quantidade, salarioFixo, comissao, valorVendas ) );
        sc.close();
    }

    public static double calcularSalarioFinal( int quant, double salarioFixo, double comissaoVendas, double valorVendas ){
        double comissao = quant * comissaoVendas;
        double porcentagem = valorVendas * 0.05;
        double salarioFinal = salarioFixo + comissao + porcentagem;
        return salarioFinal;
    }
}