package atividade02;
import java.util.Scanner;

public class VerificarEmpregado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SEU NOME: ");
        String nome = sc.nextLine();
        System.out.print("INFORME SEU SALÁRIO: ");
        double salBruto = sc.nextDouble();
        System.out.print("INFORME O TOTAL DO DESCONTO: ");
        double des = sc.nextDouble();

        Empregado func = new Empregado ( nome, salBruto, des );
        System.out.printf("SALÁRIO LÍQUIDO: R$%.2f\n", func.Sal_Liquido(des));

        System.out.println("INFORME A QUANTIDADE DA PORCENTAGEM: ");
        double porcentagem = sc.nextDouble();
        func.AumentarSal(porcentagem);
        System.out.printf("O VALOR DO NOVO SALÁRIO LÍQUIDO: %.2f%n", func.Sal_Liquido(des));

        sc.close();
    }
}
